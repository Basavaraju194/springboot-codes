package com.luv2code.springboot.thymeleafdemo.entity;
/*
 * import jakarta.persistence.Column; import jakarta.persistence.Entity; import
 * jakarta.persistence.GeneratedValue; import
 * jakarta.persistence.GenerationType; import jakarta.persistence.Id; import
 * jakarta.persistence.Table;
 * 
 * @Entity
 * 
 * @Table(name="employee") public class Employee {
 * 
 * // define fields
 * 
 * @Id
 * 
 * @GeneratedValue(strategy=GenerationType.IDENTITY)
 * 
 * @Column(name="id") private int id;
 * 
 * @Column(name="first_name") private String firstName;
 * 
 * @Column(name="last_name") private String lastName;
 * 
 * @Column(name="email") private String email;
 * 
 * 
 * // define constructors
 * 
 * public Employee() {
 * 
 * }
 * 
 * public Employee(int id, String firstName, String lastName, String email) {
 * this.id = id; this.firstName = firstName; this.lastName = lastName;
 * this.email = email; }
 * 
 * 
 * public Employee(String firstName, String lastName, String email) {
 * this.firstName = firstName; this.lastName = lastName; this.email = email; }
 * 
 * // define getter/setter
 * 
 * public int getId() { return id; }
 * 
 * public void setId(int id) { this.id = id; }
 * 
 * public String getFirstName() { return firstName; }
 * 
 * public void setFirstName(String firstName) { this.firstName = firstName; }
 * 
 * public String getLastName() { return lastName; }
 * 
 * public void setLastName(String lastName) { this.lastName = lastName; }
 * 
 * public String getEmail() { return email; }
 * 
 * public void setEmail(String email) { this.email = email; }
 * 
 * // define tostring
 * 
 * @Override public String toString() { return "Employee [id=" + id +
 * ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email +
 * "]"; }
 * 
 * }
 * 
 * 
 */



import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "flight")
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "flight_name")
	private String flightName;

	@Column(name = "sourse")
	private String source;

	@Column(name = "destination")
	private String destination;

	@Column(name = "doj")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate doj;

	@Column(name = "availableseates")
	private int availableSeats;

	@Column(name = "ticketprice")
	private double ticketPrice;

	@Column(name = "flightclass")
	private String flightClass;

	public Flight() {

	}

	public Flight(String flightName, String source, String destination, LocalDate doj, int availableSeats,
			double ticketPrice, String flightClass) {
		super();

		this.flightName = flightName;
		this.source = source;
		this.destination = destination;
		this.doj = doj;
		this.availableSeats = availableSeats;
		this.ticketPrice = ticketPrice;
		this.flightClass = flightClass;
	}

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

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public String getFlightClass() {
		return flightClass;
	}

	public void setFlightClass(String flightClass) {
		this.flightClass = flightClass;
	}

	@Override
	public String toString() {
		return "Flight [id=" + id + ", flightName=" + flightName + ", source=" + source + ", destination=" + destination
				+ ", doj=" + doj + ", availableSeats=" + availableSeats + ", ticketPrice=" + ticketPrice
				+ ", flightClass=" + flightClass + "]";
	}

}






