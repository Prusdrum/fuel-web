package com.fuelWeb.stations.repository;

import java.util.List;

import com.fuelWeb.stations.model.Station;

public interface StationsRepository {
	public List<Station> findAll();
}
