package com.lti.airline.admin.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.airline.admin.entity.AirlineDetails;

@Repository
public class AirlineAddDao {
@PersistenceContext
private EntityManager entityManager;

@Transactional
public void addAirlineDetails(AirlineDetails airlineDetails) {
	
	entityManager.persist(airlineDetails);	
	
}
}
