package com.fuelWeb.stations.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fuelWeb.stations.model.StationDTO;

@Service
public class StationsServiceImpl implements StationsService {

	@Override
	public List<StationDTO> getStations() {
		List<StationDTO> list = new ArrayList<StationDTO>();
		list.add(new StationDTO("Test name"));
		
		return list;
	}

	
}
