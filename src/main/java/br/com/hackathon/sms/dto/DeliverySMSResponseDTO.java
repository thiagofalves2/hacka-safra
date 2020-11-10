package br.com.hackathon.sms.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonRootName;

import br.com.hackathon.dto.AbstractHTTP;

@JsonRootName(value = "sendSmsResponse")
public class DeliverySMSResponseDTO extends AbstractHTTP implements Serializable {

	private static final long serialVersionUID = 491219522704189429L;
	
	private String statusCode;
	private String statusDescription;
	private String detailCode;
	private String detailDescription;

	public DeliverySMSResponseDTO() {

	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusDescription() {
		return statusDescription;
	}

	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}

	public String getDetailCode() {
		return detailCode;
	}

	public void setDetailCode(String detailCode) {
		this.detailCode = detailCode;
	}

	public String getDetailDescription() {
		return detailDescription;
	}

	public void setDetailDescription(String detailDescription) {
		this.detailDescription = detailDescription;
	}

}
