package br.com.hackathon.db.service;

import java.math.BigDecimal;
import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hackathon.db.repository.AuthorizationRepository;
import br.com.hackathon.util.DateUtil;

@Service
public class AuthorizationDBService {
	
	private static final String DATE_PATTERN = "yyyy-MM-dd";
	
	@Autowired
	private AuthorizationRepository authorizationRepository;
	
	public BigDecimal howMuchSell(String document, String dtTransaction) throws ParseException {
		BigDecimal amount =  authorizationRepository.howMuchSell(document, DateUtil.getDateFormat(dtTransaction, DATE_PATTERN));
		if(amount == null) {
			return new BigDecimal(BigDecimal.ZERO.toPlainString());
		}
		return amount;
	}
	
	public BigDecimal howMuchReceived(String document, String dtSettlement) throws ParseException {
		BigDecimal amount =  authorizationRepository.howMuchReceived(document, DateUtil.getDateFormat(dtSettlement, DATE_PATTERN));
		if(amount == null) {
			return new BigDecimal(BigDecimal.ZERO.toPlainString());
		}
		return amount;
	}
	
	public BigDecimal howFutureSettlementSchedule(String document, String dtSettlement) throws ParseException {
		BigDecimal amount =  authorizationRepository.howFutureSettlementSchedule(document, DateUtil.getDateFormat(dtSettlement, DATE_PATTERN));
		if(amount == null) {
			return new BigDecimal(BigDecimal.ZERO.toPlainString());
		}
		return amount;
	}
}
