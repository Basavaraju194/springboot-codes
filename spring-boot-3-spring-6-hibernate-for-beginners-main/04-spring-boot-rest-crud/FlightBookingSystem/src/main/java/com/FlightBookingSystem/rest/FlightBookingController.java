package com.FlightBookingSystem.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.FlightBookingSystem.Service.FlightBookingService;
import com.FlightBookingSystem.entity.Flight;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightBookingController {

	@Autowired
	private FlightBookingService flightBookingService;

	@PostMapping
	public Flight bookFlight(@RequestBody Flight flight) {
		return flightBookingService.bookFlight(flight);
	}

	@GetMapping
	public List<Flight> getAllFlights() {
		return flightBookingService.getAllFlights();
	}

	@GetMapping("/{id}")
	public Flight getFlightById(@PathVariable Long id) {
		return flightBookingService.getFlightById(id);
	}

	@PutMapping("/{id}")
	public Flight updateFlight(@PathVariable Long id, @RequestBody Flight flight) {
		return flightBookingService.updateFlight(id, flight);
	}

	@DeleteMapping("/{id}")
	public void deleteFlight(@PathVariable Long id) {
		flightBookingService.deleteFlight(id);
	}
}