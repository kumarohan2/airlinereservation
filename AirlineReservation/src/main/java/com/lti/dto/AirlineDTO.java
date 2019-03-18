package com.lti.airline.admin.dao;

public class AirlineDTO {
private int id;
private String flightNo;
private String flightName;
private String source;
private String destination;
private double price;
private String arrivalTime;
private String departureTime;
private String capacity;
private String departureDate;
public String getDepartureDate() {
	return departureDate;
}
public void setDepartureDate(String departureDate) {
	this.departureDate = departureDate;
}
public String getArrivalDate() {
	return arrivalDate;
}
public void setArrivalDate(String arrivalDate) {
	this.arrivalDate = arrivalDate;
}
private String arrivalDate;

public String getFlightNo() {
	return flightNo;
}
public void setFlightNo(String flightNo) {
	this.flightNo = flightNo;
}
public String getFlightName() {
	return flightName;
}


public void setFlightName(String flightName) {
	this.flightName = flightName;
}
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}

public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
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
public String getCapacity() {
	return capacity;
}
public void setCapacity(String capacity) {
	this.capacity = capacity;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}





}


