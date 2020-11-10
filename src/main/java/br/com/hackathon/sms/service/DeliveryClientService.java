package br.com.hackathon.sms.service;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;

import br.com.hackathon.sms.dto.ZenviaResponseSMS;

@Service
public class DeliveryClientService {
	
	public ZenviaResponseSMS enviarSMS(String sms) throws JsonProcessingException {
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<String> request = new HttpEntity<String>(sms, getHeader());
		ResponseEntity<String> response = restTemplate.postForEntity("https://api-rest.zenvia.com/services/send-sms", request, String.class);
		return new Gson().fromJson(response.getBody(), ZenviaResponseSMS.class);
	}
	
	private HttpHeaders getHeader() {
		String plainCreds = "nobregatec.smsonline:cp8ti8HhNV";
		byte[] plainCredsBytes = plainCreds.getBytes();
		byte[] base64CredsBytes = Base64.encodeBase64(plainCredsBytes);
		String base64Creds = new String(base64CredsBytes);
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "Basic " + base64Creds);
		headers.add("Accept", "application/json");
		headers.setContentType(MediaType.APPLICATION_JSON);
		return headers;
	}

}
