package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.dto.FlightSearchDTO;
import com.lti.entity.Flight;

@Repository
public class FlightSearchDao {

	@PersistenceContext
	private EntityManager entityManager;

	public void addDetails(Flight flight) {
		entityManager.persist(flight);
	}    

	public List<Flight> fetchFlight() {

		return entityManager.createQuery("select a from Flight a").getResultList();
	}

	public List<Flight> fetchFlight(FlightSearchDTO flightSearchDTO) {
	//	System.out.println(flightSearchDTO);
		String q = "select b from Flight b where b.source = :source and b.destination = :destination";
		return entityManager
				.createQuery(q).setParameter("source", flightSearchDTO.getSource())
				.setParameter("destination", flightSearchDTO.getDestination()).getResultList();
	}

	public List<Flight> fetchMorningFlight(FlightSearchDTO flightSearchDTO) {
		String q = "select b from Flight b where  b.source = :source and b.destination = :destination and b.departureTime >= 5 and b.departureTime <= 11";
		return entityManager
						.createQuery(q)
						.setParameter("source", flightSearchDTO.getSource())
						.setParameter("destination", flightSearchDTO.getDestination())
						.getResultList();
	}

	public List<Flight> fetchEveningFlight(FlightSearchDTO flightSearchDTO) {
		String q = "select b from Flight b where  b.source = :source and b.destination = :destination and b.departureTime >= 15 and b.departureTime <= 24";
		return entityManager
						.createQuery(q)
						.setParameter("source", flightSearchDTO.getSource())
						.setParameter("destination", flightSearchDTO.getDestination())
						.getResultList();
	}

	public List<Flight> fetchFlightByCarrier(FlightSearchDTO flightSearchDTO,String carrier) {
		String q = "select b from Flight b where  b.source = :source and b.destination = :destination and b.flightName =:flightname";
		return entityManager
						.createQuery(q)
						.setParameter("source", flightSearchDTO.getSource())
						.setParameter("destination", flightSearchDTO.getDestination())
						.setParameter("flightname", carrier)
						.getResultList();
	}
	
	public List<String> fetchAllCarriers() {
		String q = "select distinct b.flightName from Flight b";
		return entityManager
						.createQuery(q)
						.getResultList();
	}

	
	}
	



