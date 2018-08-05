package com.fuelWeb.jobs.stations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan(basePackages = "com.fuelWeb")
public class SyncStationsJobConfig {

	@Bean
	public FetchService fetchService(Environment env) {
		String API_KEY = env.getProperty("google_api_key"); 
        FetchService fetchService = new FetchService(API_KEY);
        return fetchService;
	}
	
}
