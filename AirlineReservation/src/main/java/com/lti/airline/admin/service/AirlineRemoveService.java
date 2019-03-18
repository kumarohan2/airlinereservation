package com.lti.airline.admin.service;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	import org.springframework.transaction.annotation.Transactional;



	
	@Service
	public class AirlineRemoveService {

		@Autowired
		private AirlineRemoveDao airlineRemoveDao;
		
		@Transactional
		public void remove(String flightNo) {
			
			
			airlineRemoveDao.remove(flightNo);
		}
		
	}


