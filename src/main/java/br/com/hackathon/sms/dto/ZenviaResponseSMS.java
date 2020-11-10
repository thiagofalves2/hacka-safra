package br.com.hackathon.sms.dto;

import java.io.Serializable;

public class ZenviaResponseSMS implements Serializable {

	private static final long serialVersionUID = -6692924560382701339L;
	
	private DeliverySMSResponseDTO sendSmsResponse;
	
	public ZenviaResponseSMS() {
		
	}

	public DeliverySMSResponseDTO getSendSmsResponse() {
		return sendSmsResponse;
	}

	public void setSendSmsResponse(DeliverySMSResponseDTO sendSmsResponse) {
		this.sendSmsResponse = sendSmsResponse;
	}

}
