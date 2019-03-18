package com.lti.airline.admin.dao;

	import javax.persistence.EntityManager;
	import javax.persistence.PersistenceContext;

	import org.springframework.stereotype.Repository;
	import org.springframework.transaction.annotation.Transactional;



	@Repository
	public class AirlineRemoveDao {

		@PersistenceContext
		private EntityManager entityManager;
		
		@Transactional
		public void remove(String flightNo) {
			entityManager.createQuery("delete from AirlineDetails as r where r.flightNo=:flightNo").setParameter("flightNo", flightNo).executeUpdate();
		
		}
		
		

	}


