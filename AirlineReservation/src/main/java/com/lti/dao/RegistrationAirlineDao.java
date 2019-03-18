package com.lti.dao;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.RegistrationAirline;




@Repository
public class RegistrationAirlineDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void add(RegistrationAirline registrationAirline) {
		entityManager.persist(registrationAirline);
	}

}
