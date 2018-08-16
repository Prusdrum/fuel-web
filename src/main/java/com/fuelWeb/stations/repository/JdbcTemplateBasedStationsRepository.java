package com.fuelWeb.stations.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Component;

import com.fuelWeb.stations.model.Station;

@Component
public class JdbcTemplateBasedStationsRepository implements StationsRepository {

	@Autowired
	JdbcOperations operations;
	
	private static final String SELECT_QUERY = "SELECT id, name, location_lat, location_lng from stations";
	
	@Override
	public List<Station> findAll() {
		List<Station> stations = new ArrayList<Station>();
		
		List<Map<String, Object>> rows = operations.queryForList(SELECT_QUERY);
		for (Map row : rows) {
			Station station = new Station();
			station.setId((String)row.get("id"));
			station.setName((String)row.get("name"));
			station.setLocation_lat((double)row.get("location_lat"));
			station.setLocation_lng((double)row.get("location_lng"));
			
			stations.add(station);
		}
			
		return stations;
	}

}
