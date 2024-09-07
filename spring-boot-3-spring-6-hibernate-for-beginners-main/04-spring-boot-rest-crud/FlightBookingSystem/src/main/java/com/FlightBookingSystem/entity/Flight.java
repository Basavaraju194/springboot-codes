package com.FlightBookingSystem.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String flightName;
    private String source;
    private String destination;
    private LocalDate doj;
    private Integer numberOfAvailableSeats;
    private Double ticketPrice;
    private String flightClass;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	public Integer getNumberOfAvailableSeats() {
		return numberOfAvailableSeats;
	}
	public void setNumberOfAvailableSeats(Integer numberOfAvailableSeats) {
		this.numberOfAvailableSeats = numberOfAvailableSeats;
	}
	public Double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(Double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public String getFlightClass() {
		return flightClass;
	}
	public void setFlightClass(String flightClass) {
		this.flightClass = flightClass;
	}
	public Flight() {
		super();
	}
	public Flight(Long id, String flightName, String source, String destination, LocalDate doj,
			Integer numberOfAvailableSeats, Double ticketPrice, String flightClass) {
		super();
		this.id = id;
		this.flightName = flightName;
		this.source = source;
		this.destination = destination;
		this.doj = doj;
		this.numberOfAvailableSeats = numberOfAvailableSeats;
		this.ticketPrice = ticketPrice;
		this.flightClass = flightClass;
	}
	@Override
	public String toString() {
		return "Flight [id=" + id + ", flightName=" + flightName + ", source=" + source + ", destination=" + destination
				+ ", doj=" + doj + ", numberOfAvailableSeats=" + numberOfAvailableSeats + ", ticketPrice=" + ticketPrice
				+ ", flightClass=" + flightClass + "]";
	}
    

}