package com.fuelWeb.stations.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.fuelWeb.stations.model.Price;

@Transactional
public interface PriceRecordsRepository extends CrudRepository<Price, Long>{

	
}
