package br.com.hackathon.sms.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "sendSmsRequest")
public class ZenviaSMSRequestDTO implements Serializable {

	private static final long serialVersionUID = 4960308481900031642L;
	
	private String from;
	private Long to;
	private String schedule;
	private String msg;
	private String callbackOption;
	private Long id;
	private Boolean flashSms;
	
	public ZenviaSMSRequestDTO() {
		
	}
	
	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public Long getTo() {
		return to;
	}

	public void setTo(Long to) {
		this.to = to;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getCallbackOption() {
		return callbackOption;
	}

	public void setCallbackOption(String callbackOption) {
		this.callbackOption = callbackOption;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getFlashSms() {
		return flashSms;
	}

	public void setFlashSms(Boolean flashSms) {
		this.flashSms = flashSms;
	}

}
