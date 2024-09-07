package com.FlightBookingSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FlightBookingSystem.entity.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {

    List<Flight> findByAirline(String airline);

    List<Flight> findByDestination(String destination);

    List<Flight> findByOrigin(String origin);
}