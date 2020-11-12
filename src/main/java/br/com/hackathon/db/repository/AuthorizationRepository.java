package br.com.hackathon.db.repository;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.com.hackathon.db.entity.Authorization;

public interface AuthorizationRepository extends CrudRepository<Authorization, Long> {

	@Query(value = 	"select sum(amount)\n" + 
			        " from hacka.tb_authorization ta ," + 
			        " hacka.tb_cardholder tc" + 
			        " where ta.cardholder = tc.id " + 
			        "    and tc.ds_document = :document" + 
			        "    and ta.date = :dtTransaction", nativeQuery = true)
	public BigDecimal howMuchSell(@Param("document") String document, @Param("dtTransaction") Date dtTransaction);
	
	
	@Query(value = 	"select sum(amount)\n" + 
	        " from hacka.tb_authorization ta ," + 
	        " hacka.tb_cardholder tc" + 
	        " where ta.cardholder = tc.id " + 
	        "    and tc.ds_document = :document" + 
	        "    and ta.dt_effective_settlement = :dtSettlement", nativeQuery = true)
	public BigDecimal howMuchReceived(@Param("document") String document, @Param("dtSettlement") Date dtSettlement);
	
	@Query(value = 	"select sum(amount)\n" + 
	        " from hacka.tb_authorization ta ," + 
	        " hacka.tb_cardholder tc" + 
	        " where ta.cardholder = tc.id " + 
	        "    and tc.ds_document = :document" + 
	        "    and ta.dt_settlement >= :dtSettlement" +
	        "    and ta.dt_effective_settlement is null", nativeQuery = true)
	public BigDecimal howFutureSettlementSchedule(@Param("document") String document, @Param("dtSettlement") Date dtSettlement);
	
}
