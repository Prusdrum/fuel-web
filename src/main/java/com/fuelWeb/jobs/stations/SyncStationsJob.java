package com.fuelWeb.jobs.stations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fuelWeb.jobs.stations.model.Location;
import com.fuelWeb.jobs.stations.model.PlacesResponseModel;
import com.fuelWeb.stations.model.Station;
import com.fuelWeb.stations.repository.StationsRepository;

@Component
public class SyncStationsJob {

	@Autowired
	FetchService fetchService;

	@Autowired
	StationsRepository repository;
	
	public void run() {
        double queryLat = 50.040177;
        double queryLng = 19.983802;
        
        PlacesResponseModel model = fetchService.fetchStations(queryLat, queryLng);
        System.out.println("I'm trying to save: " + model.toString());
        model.getResults().forEach(result -> {
        	String id = result.getId();
    		String name = result.getName();
    		
    		Location location = result.getGeometry().getLocation();
    		double lat = location.getLat();
    		double lng = location.getLng();
    		
    		Station station = new Station();
    		station.setName(name);
    		station.setLat(lat);
    		station.setLng(lng);
    		station.setId(id);
    		
    		repository.save(station);
        });
        
	}
	
	
}
