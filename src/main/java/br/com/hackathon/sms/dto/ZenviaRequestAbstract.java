package br.com.hackathon.sms.dto;

import java.io.Serializable;

public class ZenviaRequestAbstract implements Serializable {
	
	private static final long serialVersionUID = -2345653350143671726L;
	
	private ZenviaSMSRequestDTO sendSmsRequest;
	
	public ZenviaRequestAbstract() {
		
	}

	public ZenviaSMSRequestDTO getSendSmsRequest() {
		return sendSmsRequest;
	}

	public void setSendSmsRequest(ZenviaSMSRequestDTO sendSmsRequest) {
		this.sendSmsRequest = sendSmsRequest;
	}

}
