package com.fuelWeb.jobs.stations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SyncStationsJobRunner {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SyncStationsJobConfig.class)) {
			
			SyncStationsJob syncJob = 
					(SyncStationsJob)context.getBean("syncStationsJob");
			
			syncJob.run();
		}
		
	}

}
