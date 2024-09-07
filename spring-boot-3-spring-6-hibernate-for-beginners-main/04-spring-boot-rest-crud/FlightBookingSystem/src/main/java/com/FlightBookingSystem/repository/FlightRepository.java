package com.FlightBookingSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.FlightBookingSystem.entity.Flight;

@Repository
public interface FlightRepository extends CrudRepository<Flight, Long> {
}