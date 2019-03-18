package com.lti.dao;
	import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.BookingDetails;
import com.lti.entity.Flight;
import com.lti.entity.PassengerDetails;

	@Repository
	public class BookFlightDao {
		
		@PersistenceContext
		private EntityManager entityManager;
		
		public void addPassenger(PassengerDetails passengerDetails) {
			entityManager.persist(passengerDetails);
		}
		
		
		public Flight fetchFlightDetails(int flightid) {
			//Query query=entityManager.createQuery("select Flight from FlightDetails as Flight where Flight.FlightId=:id");
			Flight flightDetails=entityManager.find(Flight.class, flightid);
			return flightDetails;
		}
		
		/*public FlightDetails displayFlight(int Flightid) {
			return entityManager.createQuery("select Flight from FlightDetails as Flight where Flight.FlightId=:id").setParameter("id", Flightid).getSingleResult();
		}*/

		@Transactional
		public void add(BookingDetails bookingDetails) {
			entityManager.persist(bookingDetails);
		}
		
	}


