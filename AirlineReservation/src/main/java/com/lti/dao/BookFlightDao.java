package com.lti.dao;
	import java.util.List;

	import javax.persistence.EntityManager;
	import javax.persistence.PersistenceContext;
	import javax.persistence.Query;

	import org.springframework.stereotype.Repository;
	import org.springframework.transaction.annotation.Transactional;

	import com.lti.dto.FlightDetailsDTO;
	import com.lti.entity.FlightDetails;
	import com.lti.entity.PassengerDetails;

	@Repository
	public class BookFlightDao {
		
		@PersistenceContext
		private EntityManager entityManager;
		
		public void addPassenger(PassengerDetails passengerDetails) {
			entityManager.persist(passengerDetails);
		}
		
		
		public FlightDetails fetchFlightDetails(int flightid) {
			//Query query=entityManager.createQuery("select Flight from FlightDetails as Flight where Flight.FlightId=:id");
			FlightDetails flightDetails=entityManager.find(FlightDetails.class, flightid);
			return flightDetails;
		}
		
		/*public FlightDetails displayFlight(int Flightid) {
			return entityManager.createQuery("select Flight from FlightDetails as Flight where Flight.FlightId=:id").setParameter("id", Flightid).getSingleResult();
		}*/

		
	}


