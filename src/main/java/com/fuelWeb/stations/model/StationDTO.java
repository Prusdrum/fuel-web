package com.fuelWeb.stations.model;

import com.fuelWeb.jobs.stations.model.Location;

public class StationDTO {

	private long id;
	private String name;
	private Location location;
	private String address;

	public StationDTO(String name) {
		super();
		this.name = name;
	}
	
	public StationDTO() {
		super();
	}
	
	public StationDTO(long id, String name, Location location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
