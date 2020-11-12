package br.com.hackathon.db.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "hacka", name = "tb_authorization")
public class Authorization implements Serializable {

	private static final long serialVersionUID = 7532300558567273752L;
	
	@Id
	private Long id;
	
	@Column(name = "merchant_id")
	private String merchantId;
	
	@Column(name = "terminal_id")
	private String terminalId;
	
	@Column(name = "nsu")
	private String nsu;
	
	@Column(name = "rrn")
	private String rrn;
	
	@Column(name = "ca_name")
	private String caName;
	
	@Column(name = "ca_city")
	private String caCity;
	
	@Column(name = "ca_region")
	private String caRegion;
	
	@Column(name = "ca_country")
	private String caCountry;
	
	@Column(name = "ca_address")
	private String caAddress;
	
	@Column(name = "ca_postalcode")
	private String caPostalCode;
	
	@Column(name = "mcc")
	private String mcc;
	
	@Column(name = "responsecode")
	private String responseCode;
	
	@Column(name = "approvalcode")
	private String approvalCode;
	
	@Column(name = "displaymessage")
	private String displayMessage;
	
	@Column(name = "date")
	private Date date;
	
	@Column(name = "transmissiondate")
	private Date dtTransmissionDate;
	
	@Column(name = "localtransactiondate")
	private Date dtLocalTransactionDate;
	
	@Column(name = "mti")
	private String mti;
	
	@Column(name = "currencycode")
	private String currencyCode;
	
	@Column(name = "amount")
	private BigDecimal amount;
	
	@Column(name = "card")
	private Long card;
	
	@Column(name = "cardholder")
	private Long cardHolder;
	
	@Column(name = "dt_settlement")
	private Date dtSettlement;
	
	@Column(name = "dt_effective_settlement")
	private Date dtEffectiveSettlement;
	
	public Authorization() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getTerminalId() {
		return terminalId;
	}

	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}

	public String getNsu() {
		return nsu;
	}

	public void setNsu(String nsu) {
		this.nsu = nsu;
	}

	public String getRrn() {
		return rrn;
	}

	public void setRrn(String rrn) {
		this.rrn = rrn;
	}

	public String getCaName() {
		return caName;
	}

	public void setCaName(String caName) {
		this.caName = caName;
	}

	public String getCaCity() {
		return caCity;
	}

	public void setCaCity(String caCity) {
		this.caCity = caCity;
	}

	public String getCaRegion() {
		return caRegion;
	}

	public void setCaRegion(String caRegion) {
		this.caRegion = caRegion;
	}

	public String getCaCountry() {
		return caCountry;
	}

	public void setCaCountry(String caCountry) {
		this.caCountry = caCountry;
	}

	public String getCaAddress() {
		return caAddress;
	}

	public void setCaAddress(String caAddress) {
		this.caAddress = caAddress;
	}

	public String getCaPostalCode() {
		return caPostalCode;
	}

	public void setCaPostalCode(String caPostalCode) {
		this.caPostalCode = caPostalCode;
	}

	public String getMcc() {
		return mcc;
	}

	public void setMcc(String mcc) {
		this.mcc = mcc;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getApprovalCode() {
		return approvalCode;
	}

	public void setApprovalCode(String approvalCode) {
		this.approvalCode = approvalCode;
	}

	public String getDisplayMessage() {
		return displayMessage;
	}

	public void setDisplayMessage(String displayMessage) {
		this.displayMessage = displayMessage;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getDtTransmissionDate() {
		return dtTransmissionDate;
	}

	public void setDtTransmissionDate(Date dtTransmissionDate) {
		this.dtTransmissionDate = dtTransmissionDate;
	}

	public Date getDtLocalTransactionDate() {
		return dtLocalTransactionDate;
	}

	public void setDtLocalTransactionDate(Date dtLocalTransactionDate) {
		this.dtLocalTransactionDate = dtLocalTransactionDate;
	}

	public String getMti() {
		return mti;
	}

	public void setMti(String mti) {
		this.mti = mti;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Long getCard() {
		return card;
	}

	public void setCard(Long card) {
		this.card = card;
	}

	public Long getCardHolder() {
		return cardHolder;
	}

	public void setCardHolder(Long cardHolder) {
		this.cardHolder = cardHolder;
	}

	public Date getDtSettlement() {
		return dtSettlement;
	}

	public void setDtSettlement(Date dtSettlement) {
		this.dtSettlement = dtSettlement;
	}

	public Date getDtEffectiveSettlement() {
		return dtEffectiveSettlement;
	}

	public void setDtEffectiveSettlement(Date dtEffectiveSettlement) {
		this.dtEffectiveSettlement = dtEffectiveSettlement;
	}
	
	
	
}
