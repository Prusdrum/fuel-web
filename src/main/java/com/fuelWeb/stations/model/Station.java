package com.fuelWeb.stations.model;

public class Station {
	private String id;
	
	private String name;
	
	@Override
	public String toString() {
		return "Station [id=" + id + ", name=" + name + ", location_lat=" + location_lat + ", location_lng="
				+ location_lng + "]";
	}
	private double location_lat;
	private double location_lng;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getLocation_lat() {
		return location_lat;
	}
	public void setLocation_lat(double location_lat) {
		this.location_lat = location_lat;
	}
	public double getLocation_lng() {
		return location_lng;
	}
	public void setLocation_lng(double location_lng) {
		this.location_lng = location_lng;
	}
}
