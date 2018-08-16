package com.fuelWeb.jobs.stations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fuelWeb.jobs.stations.model.Location;
import com.fuelWeb.jobs.stations.model.PlacesResponseModel;

@Component
public class SyncStationsJob {

	@Autowired
	FetchService fetchService;
	
	@Autowired
	DataSource dataSource;
	
	private String format(String val) {
		return "'" + val + "'";
	}
	
	public void run() {
        double queryLat = 50.040177;
        double queryLng = 19.983802;
        
        PlacesResponseModel model = fetchService.fetchStations(queryLat, queryLng);
        
        model.getResults().forEach(result -> {
        	try (Connection connection = dataSource.getConnection()) {
        		
        		String id = result.getId();
        		String name = result.getName();
        		
        		Location location = result.getGeometry().getLocation();
        		double lat = location.getLat();
        		double lng = location.getLng();
        		
        		String sql = "INSERT INTO stations VALUES (" + 
        				format(id) + " , " +
        				format(name) + " , " + 
        				lat + " , " +
        				lng + 
        				");";
        		
//        		Statement statement = connection.createStatement();
//        		statement.executeQuery(sql);
        		System.out.println(sql);
        		
        	} catch (SQLException e) {
				e.printStackTrace();
			}
        });
        
	}
	
	
}
