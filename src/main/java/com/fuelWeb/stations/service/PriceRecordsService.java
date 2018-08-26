package com.fuelWeb.stations.service;

import com.fuelWeb.stations.model.PriceRequest;

public interface PriceRecordsService {

	public void storePrice(long stationId, PriceRequest price, long userId);
}
