package com.lti.airline.admin.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.airline.admin.entity.AirlineDetails;
import com.lti.airline.admin.service.AirlineAddService;



@Repository
public class AirlineDisplayDao {

	@PersistenceContext
	private EntityManager entityManager;
	
//	@Transactional
//	public void add(AirlineDetails airline) {
//		entityManager.persist(airline);
//	}
@Transactional
	public List<AirlineDetails> fetchAll() {
		return entityManager.createQuery("select r from AirlineDetails r").getResultList();
	}

}


