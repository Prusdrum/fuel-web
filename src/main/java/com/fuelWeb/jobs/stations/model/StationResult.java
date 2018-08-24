package com.fuelWeb.jobs.stations.model;

import java.util.List;

public class StationResult {
	private Geometry geometry;
	private String icon;
	private String id;
	private String name;
	private OpeningHours opening_hours;
	private String place_id;
	private PlusCode plus_code;
	private double rating;
	private String reference;
	private String scope;
	private List<String> types;
	private String vicinity;
	public Geometry getGeometry() {
		return geometry;
	}
	public void setGeometry(Geometry geometry) {
		this.geometry = geometry;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
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
	public OpeningHours getOpening_hours() {
		return opening_hours;
	}
	public void setOpening_hours(OpeningHours opening_hours) {
		this.opening_hours = opening_hours;
	}
	public String getPlace_id() {
		return place_id;
	}
	public void setPlace_id(String place_id) {
		this.place_id = place_id;
	}
	public PlusCode getPlus_code() {
		return plus_code;
	}
	public void setPlus_code(PlusCode plus_code) {
		this.plus_code = plus_code;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getScope() {
		return scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}
	public List<String> getTypes() {
		return types;
	}
	public void setTypes(List<String> types) {
		this.types = types;
	}
	public String getVicinity() {
		return vicinity;
	}
	public void setVicinity(String vicinity) {
		this.vicinity = vicinity;
	}
	
	
}
