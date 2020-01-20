package com.smati.flightreservation1.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smati.flightreservation1.entities.Passenger;


public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
