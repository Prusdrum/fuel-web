package com.fuelWeb.jobs.stations;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fuelWeb.jobs.stations.model.PlacesResponseModel;
import com.google.gson.Gson;

@Service
public class FetchService {
    private String apiKey;
    
    @Autowired
    private RestTemplate restTemplate;
    
    public FetchService(String API_KEY) {
            this.apiKey = API_KEY;
    }
    
    public PlacesResponseModel fetchStations(double lat, double lng) {             
            String url = getUrl(lat, lng);
			PlacesResponseModel model = restTemplate.getForObject(url, PlacesResponseModel.class);
			return model;
            
    }
    
    private String getUrl(double lat, double lng) {
            return new StringBuilder()
                            .append("https://maps.googleapis.com/maps/api/place/nearbysearch/json")
                            .append("?location=" + lat + "," + lng)
                            .append("&type=gas_station")
                            .append("&radius=2500")
                            .append("&key=" + apiKey)
                            .toString();
    }
}