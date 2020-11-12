package br.com.hackathon.db.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "hacka", name = "tb_cardholder")
public class CardHolder implements Serializable {

	private static final long serialVersionUID = -8461438447432026518L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_id_user")
	@SequenceGenerator(schema = "hacka", name = "seq_id_user", sequenceName = "seq_id_user", allocationSize = 1)
	private Long id;
	
	@Column(name = "full_name")
	private String fullName;
	
	@Column(name = "ds_email")
	private String email;
	
	@Column(name = "ds_document")
	private String document;
	
	@Column(name = "tp_document")
	private Integer typeDocument;
	
	@Column(name = "nu_cel_phone")
	private String celPhone;
	
	@Column(name = "dt_last_login")
	private Date dtLastLogin;
	
	@Column(name = "dt_block")
	private Date dtBlock;
	
	public CardHolder() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getCelPhone() {
		return celPhone;
	}

	public void setCelPhone(String celPhone) {
		this.celPhone = celPhone;
	}

	public Date getDtLastLogin() {
		return dtLastLogin;
	}

	public void setDtLastLogin(Date dtLastLogin) {
		this.dtLastLogin = dtLastLogin;
	}

	public Date getDtBlock() {
		return dtBlock;
	}

	public void setDtBlock(Date dtBlock) {
		this.dtBlock = dtBlock;
	}

	public Integer getTypeDocument() {
		return typeDocument;
	}

	public void setTypeDocument(Integer typeDocument) {
		this.typeDocument = typeDocument;
	}

}
