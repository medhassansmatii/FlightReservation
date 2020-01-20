package com.smati.flightreservation1.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smati.flightreservation1.entities.Reservation;


public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
