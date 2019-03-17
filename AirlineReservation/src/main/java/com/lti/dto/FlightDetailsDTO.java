package com.lti.dto;

	public class FlightDetailsDTO {
		
		private int flightId;
		private String travelName;
		private String arrivalTime;
		private String departureTime;
		private int totalPrice;

		public int getFlightId() {
			return flightId;
		}
		public void setFlightId(int flightId) {
			this.flightId = flightId;
		}
		public String getTravelName() {
			return travelName;
		}
		public void setTravelName(String travelName) {
			this.travelName = travelName;
		}
		public String getArrivalTime() {
			return arrivalTime;
		}
		public void setArrivalTime(String arrivalTime) {
			this.arrivalTime = arrivalTime;
		}
		public String getDepartureTime() {
			return departureTime;
		}
		public void setDepartureTime(String departureTime) {
			this.departureTime = departureTime;
		}
		public int getTotalPrice() {
			return totalPrice;
		}
		public void setTotalPrice(int totalPrice) {
			this.totalPrice = totalPrice;
		}


	}


