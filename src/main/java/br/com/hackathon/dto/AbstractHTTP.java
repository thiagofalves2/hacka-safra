package br.com.hackathon.dto;

public abstract class AbstractHTTP {
	
	private Integer httpStatus;
	private String httpErrorDesc;
	
	public AbstractHTTP() {
		
	}

	public Integer getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(Integer httpStatus) {
		this.httpStatus = httpStatus;
	}

	public String getHttpErrorDesc() {
		return httpErrorDesc;
	}

	public void setHttpErrorDesc(String httpErrorDesc) {
		this.httpErrorDesc = httpErrorDesc;
	}
}
