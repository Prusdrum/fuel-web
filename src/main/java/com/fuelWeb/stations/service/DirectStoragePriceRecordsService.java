package com.fuelWeb.stations.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fuelWeb.stations.model.PriceRequest;
import com.fuelWeb.stations.repository.PriceRecordsRepository;

@Service
public class DirectStoragePriceRecordsService implements PriceRecordsService {

	@Autowired
	private PriceRecordsRepository repository;
	
	@Override
	public void storePrice(long stationId, PriceRequest price, long userId) {
		repository.save(null);
	}

}
