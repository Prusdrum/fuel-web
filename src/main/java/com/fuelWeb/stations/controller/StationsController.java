package com.fuelWeb.stations.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fuelWeb.stations.model.StationDTO;
import com.fuelWeb.stations.service.StationsService;

@RestController
public class StationsController {

	@Autowired
	StationsService stationsService;
	
	@RequestMapping(value = "/api/stations", method = RequestMethod.GET)
	public List<StationDTO> getAllStations() {
		return stationsService.getStations();
	}
	
	
}
