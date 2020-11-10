package br.com.hackathon.sms.service;

import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;

import br.com.hackathon.db.entity.User;
import br.com.hackathon.db.service.TokenDBService;
import br.com.hackathon.db.service.UserDBService;
import br.com.hackathon.exceptions.UserBlockException;
import br.com.hackathon.exceptions.UserNotFoundException;
import br.com.hackathon.sms.dto.DeliverySMSResponseDTO;
import br.com.hackathon.sms.dto.ZenviaRequestAbstract;
import br.com.hackathon.sms.dto.ZenviaResponseSMS;
import br.com.hackathon.sms.dto.ZenviaSMSRequestDTO;
import br.com.hackathon.util.DateUtil;
import br.com.hackathon.util.HashUtil;

@Service
public class SMSService {

	private static final String CALLBACK_OPTION = "ALL";
	private static final String FROM = "SAFRA 360";
	private static Long CODIGO_PAIS = 55L;

	@Autowired
	private UserDBService userDBService;
	
	@Autowired
	private TokenDBService tokenDBService;
	
	@Autowired
	private DeliveryClientService deliveryClientService;

	public DeliverySMSResponseDTO sendSMS(String document) throws UserNotFoundException, JsonProcessingException, UserBlockException {
		User user = userDBService.getByDocument(document);
		String token = String.valueOf(HashUtil.getRandomNumberInRange(1000, 9999));
		String jsonSMS = sendSMS(user, token);
		ZenviaResponseSMS response = deliveryClientService.enviarSMS(jsonSMS);
		saveToken(user, token);
		return response.getSendSmsResponse();
	}
	
	private void saveToken(User user, String strToken) {
		tokenDBService.save(user.getId(), strToken);
	}

	private String sendSMS(User user, String token) {
		ZenviaRequestAbstract t = new ZenviaRequestAbstract();
		ZenviaSMSRequestDTO req = new ZenviaSMSRequestDTO();
		req.setCallbackOption(CALLBACK_OPTION);
		req.setFrom(FROM);
		req.setFlashSms(Boolean.FALSE);
		req.setId(ThreadLocalRandom.current().nextLong(10,1000000));
		req.setMsg("Token para acesso: "+ token);
		req.setTo(Long.valueOf((CODIGO_PAIS + "" + user.getCelPhone())));
		req.setSchedule(DateUtil.getDataFormat(new Date(), "yyyy-MM-dd'T'HH:mm:ss"));
		t.setSendSmsRequest(req);
		return new Gson().toJson(t);
	}

}
