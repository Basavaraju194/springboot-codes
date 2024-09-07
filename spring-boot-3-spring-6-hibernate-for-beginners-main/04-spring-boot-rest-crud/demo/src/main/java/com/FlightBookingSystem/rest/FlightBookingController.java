package com.FlightBookingSystem.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.FlightBookingSystem.Service.FlightBookingService;
import com.FlightBookingSystem.entity.Flight;

@RestController
public class FlightBookingController {

    @Autowired
    private FlightBookingService flightBookingService;

    @GetMapping("/flights")
    public List<Flight> getAllFlights() {
        return flightBookingService.getAllFlights();
    }

    @GetMapping("/flights/{id}")
    public Flight getFlightById(@PathVariable Long id) {
        return flightBookingService.getFlightById(id);
    }

	/*
	 * @PostMapping("/flights") public Flight createFlight(@RequestBody Flight
	 * flight) { return flightBookingService.createFlight(flight); }
	 */

    @PutMapping("/flights/{id}")
    public Flight updateFlight(@PathVariable Long id, @RequestBody Flight flight) {
        return flightBookingService.updateFlight(id, flight);
    }

    @DeleteMapping("/flights/{id}")
    public String deleteFlight(@PathVariable Long id) {
        return flightBookingService.deleteFlight(id);
    }
}



