package com.fuelWeb.stations.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="stations")
public class Station {
	@Id
	private String id;
	private String name;
	private double lng;
	private double lat;
	
	
	
	public Station() {
		super();
	}
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
	public double getLng() {
		return lng;
	}
	public void setLng(double lng) {
		this.lng = lng;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	
}
