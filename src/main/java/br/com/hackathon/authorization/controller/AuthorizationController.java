package br.com.hackathon.authorization.controller;

import java.math.BigDecimal;
import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hackathon.authorization.service.AuthorizationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/authorization")
@Api(value = "TOKEN", description = "API Authorization")
public class AuthorizationController {

	@Autowired
	private AuthorizationService authorizationService;
	
	@ApiOperation(value = "Method to return to the customer the total amount sold in the SAFRAPAY machine in the settlement in the current account")
	@GetMapping("/howMuchSell/{document}/{dtTransaction}")
	public ResponseEntity<BigDecimal> howMuchSell(@PathVariable("document") String document, 
			@PathVariable("dtTransaction") String dtTransaction) throws ParseException {
		return ResponseEntity.ok(authorizationService.howMuchSell(document, dtTransaction));
	}
	
	@ApiOperation(value = "Method to return to the customer the total amount received on settlement in current account")
	@GetMapping("/howMuchReceived/{document}/{dtSettlement}")
	public ResponseEntity<BigDecimal> howMuchReceived(@PathVariable("document") String document, 
			@PathVariable("dtSettlement") String dtSettlement) throws ParseException {
		return ResponseEntity.ok(authorizationService.howMuchReceived(document, dtSettlement));
	}
	
	@ApiOperation(value = "Method to return to the customer the total amount pending settlement in the settlement in the current account")
	@GetMapping("/howFutureSettlementSchedule/{document}/{dtSettlement}")
	public ResponseEntity<BigDecimal> howFutureSettlementSchedule(@PathVariable("document") String document, 
			@PathVariable("dtSettlement") String dtSettlement) throws ParseException {
		return ResponseEntity.ok(authorizationService.howFutureSettlementSchedule(document, dtSettlement));
	}
	
}
