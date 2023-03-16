package com.nextuple.demonative.repositories;

import java.time.OffsetDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nextuple.demonative.entities.Item;
import com.nextuple.demonative.entities.PriceList;


@Repository
public interface PriceListRepository extends JpaRepository<PriceList, Long>{
	
	List<PriceList> findByOrganizationCodeAndPriceListName(String organizationCode, String priceListname);
	
	List<PriceList> findByOrganizationCode(String organizationCode);
	
	List<PriceList> findByOrganizationCodeAndActive(String organizationCode,String active);
	
	List<PriceList> findByPriceListKeyAndActiveAndStartDateLessThanAndEndDateGreaterThan(Long id,String active,OffsetDateTime pricingDate,OffsetDateTime pricingEndDate);
	
	List<PriceList> findAllByPriceListKeyInAndActiveAndStartDateGreaterThanAndEndDateLessThan(List<Long> priceListKeys,String status,OffsetDateTime startDate,OffsetDateTime endDate);
	
	boolean existsByPriceListNameAndOrganizationCode(String priceListName,String orgCode);
	

}
