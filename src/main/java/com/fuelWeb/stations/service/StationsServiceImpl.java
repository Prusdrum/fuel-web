package com.fuelWeb.stations.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fuelWeb.jobs.stations.model.Location;
import com.fuelWeb.stations.model.StationDTO;
import com.fuelWeb.stations.repository.StationsRepository;

@Service
public class StationsServiceImpl implements StationsService {

	@Autowired
	StationsRepository repository;
	
	@Override
	public List<StationDTO> getStations() {
		return repository.findAll().stream().map(station -> {
			StationDTO dto = new StationDTO(station.getName());
			dto.setLocation(
				new Location(
						station.getLat(), 
						station.getLng()
				)
			);
			
			return dto;
		}).collect(Collectors.toList());
	}

	
}
