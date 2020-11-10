package br.com.hackathon.sms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

import br.com.hackathon.exceptions.UserBlockException;
import br.com.hackathon.exceptions.UserNotFoundException;
import br.com.hackathon.sms.dto.DeliverySMSResponseDTO;
import br.com.hackathon.sms.service.SMSService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/sms")
@Api(value = "SMS", description = "API envio de SMS")
public class SMSController {
	
	@Autowired
	private SMSService smsService;
	
	@ApiOperation(value = "Enviar token por SMS")
	@PostMapping("/{document}")
	public ResponseEntity<DeliverySMSResponseDTO> sendTokenBySMS(@PathVariable("document") String document) {
		DeliverySMSResponseDTO resp = new DeliverySMSResponseDTO();
		try {
			resp = smsService.sendSMS(document);
			resp.setHttpErrorDesc(HttpStatus.ACCEPTED.name());
			resp.setHttpStatus(HttpStatus.ACCEPTED.value());
		} catch (JsonProcessingException | UserNotFoundException | UserBlockException e) {
			resp.setHttpErrorDesc(e.getMessage());
			resp.setHttpStatus(HttpStatus.BAD_REQUEST.value());
		}
		return ResponseEntity.ok(resp);
	}
	
}
