package br.com.hackathon.authorization.service;

import java.math.BigDecimal;
import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hackathon.db.service.AuthorizationDBService;

@Service
public class AuthorizationService {
	
	@Autowired
	private AuthorizationDBService authorizationDBService;
	
	public BigDecimal howMuchSell(String document, String dtTransaction) throws ParseException {
		return authorizationDBService.howMuchSell(document, dtTransaction);
	}
	
	public BigDecimal howMuchReceived(String document, String dtSettlement) throws ParseException {
		return authorizationDBService.howMuchReceived(document, dtSettlement);
	}
	
	public BigDecimal howFutureSettlementSchedule(String document, String dtSettlement) throws ParseException {
		return authorizationDBService.howFutureSettlementSchedule(document, dtSettlement);
	}
	
}
