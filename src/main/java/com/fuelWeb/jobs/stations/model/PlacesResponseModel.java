package com.fuelWeb.jobs.stations.model;

import java.util.List;

public class PlacesResponseModel {
	private String status;
	private List<String> html_attributions;
	private List<StationResult> results;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<String> getHtml_attributions() {
		return html_attributions;
	}
	public void setHtml_attributions(List<String> html_attributions) {
		this.html_attributions = html_attributions;
	}
	public List<StationResult> getResults() {
		return results;
	}
	public void setResults(List<StationResult> results) {
		this.results = results;
	}
	
	
}