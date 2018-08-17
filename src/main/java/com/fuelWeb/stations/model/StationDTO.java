package com.fuelWeb.stations.model;

import com.fuelWeb.jobs.stations.model.Location;

public class StationDTO {

	private String name;
	private Location location;

	public StationDTO(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
}
