package com.FlightBookingSystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FlightBookingSystem.entity.Flight;
import com.FlightBookingSystem.repository.FlightRepository;

@Service
public class FlightBookingService {

    @Autowired
    private FlightRepository flightRepository;

    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    public Flight getFlightById(Long id) {
        return flightRepository.findById(id).orElse(null);
    }

    public Flight createFlight(Flight flight) {
        return flightRepository.save(flight);
    }

    public Flight updateFlight(Long id, Flight flight) {
        Flight existingFlight = flightRepository.findById(id).orElse(null);
        if (existingFlight != null) {
            existingFlight.setAirline(flight.getAirline());
            existingFlight.setDestination(flight.getDestination());
            existingFlight.setOrigin(flight.getOrigin());
            existingFlight.setFlightDate(flight.getFlightDate());
            existingFlight.setFlightDuration(flight.getFlightDuration());
            existingFlight.setAvailableSeats(flight.getAvailableSeats());
            return flightRepository.save(existingFlight);
        } else {
            return null;
        }
    }

    public String deleteFlight(Long id) {
        Flight existingFlight = flightRepository.findById(id).orElse(null);
        if (existingFlight != null) {
            flightRepository.delete(existingFlight);
            return "Deleted the flight with id: " + id;
        } else {
            return "No flight found with id: " + id;
        }
    }
}
