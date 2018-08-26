package com.fuelWeb.stations.service;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fuelWeb.RootConfig;
import com.fuelWeb.stations.repository.PriceRecordsRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= { RootConfig.class })
public class DirectoStoragePriceRecordsServiceTest {

	@Autowired
	private PriceRecordsService service;
	
	@MockBean
	private PriceRecordsRepository repository;
	
	@Test()
	public void test() {
		when(repository.save(null)).thenReturn(null);
		
		service.storePrice(0, null, 0);
		
		verify(repository, times(1)).save(null);
		
		
	}

}
