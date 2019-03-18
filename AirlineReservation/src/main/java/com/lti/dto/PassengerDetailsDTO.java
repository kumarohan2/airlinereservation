package com.lti.dto;

	import java.util.ArrayList;
	import java.util.List;

	import com.lti.entity.PassengerDetails;


	public class PassengerDetailsDTO {
		
		private List<PassengerDetails> passengerDetails = new ArrayList<PassengerDetails>();
		private long mobileNo;

		
		public List<PassengerDetails> getPassengerDetails() {
			return passengerDetails;
		}
		public void setPassengerDetails(List<PassengerDetails> passengerDetails) {
			this.passengerDetails = passengerDetails;
		}
		public long getMobileNo() {
			return mobileNo;
		}
		public void setMobileNo(long mobileNo) {
			this.mobileNo = mobileNo;
		}
		@Override
		public String toString() {
			return "PassengerDetailsDTO [passengerDetails=" + passengerDetails + ", mobileNo=" + mobileNo + "]";
		}
			
		
	}

