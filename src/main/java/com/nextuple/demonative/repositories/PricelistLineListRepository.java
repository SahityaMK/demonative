package com.nextuple.demonative.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nextuple.demonative.entities.PricelistLineList;


@Repository
public interface PricelistLineListRepository extends JpaRepository<PricelistLineList, Long>{
	
  List<PricelistLineList> findByItemItemKey(long itemKey);
  
  boolean existsByItemItemKey(long itemKey);
  
  boolean existsByPriceListPriceListKey(long itemKey);
}
