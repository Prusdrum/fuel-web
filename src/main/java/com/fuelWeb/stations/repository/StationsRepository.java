package com.fuelWeb.stations.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.fuelWeb.stations.model.Station;

@Transactional
public interface StationsRepository extends CrudRepository<Station, Long> {
	public List<Station> findAll();
}
