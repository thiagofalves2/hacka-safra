package br.com.hackathon.db.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "hacka", name = "tb_token")
public class Token implements Serializable {

	private static final long serialVersionUID = 7858079313080207118L;
	
	@Id
	@Column(name = "cardholder")
	private Long cardHolder;
	
	@Column(name = "dt_send")
	private Date dtSend;
	
	@Column(name = "ds_token")
	private String token;
	
	@Column(name = "dt_validated")
	private Date dtValidated;
	
	public Token() {
		
	}

	public Date getDtSend() {
		return dtSend;
	}

	public void setDtSend(Date dtSend) {
		this.dtSend = dtSend;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Date getDtValidated() {
		return dtValidated;
	}

	public void setDtValidated(Date dtValidated) {
		this.dtValidated = dtValidated;
	}

	public Long getCardHolder() {
		return cardHolder;
	}

	public void setCardHolder(Long cardHolder) {
		this.cardHolder = cardHolder;
	}	
}
