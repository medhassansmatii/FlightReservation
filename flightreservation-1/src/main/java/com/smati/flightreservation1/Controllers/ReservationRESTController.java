package com.smati.flightreservation1.Controllers;


import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smati.flightreservation1.DataTransferObject.ReservationUpdateRequest;
import com.smati.flightreservation1.entities.Reservation;
import com.smati.flightreservation1.repos.ReservationRepository;
import com.smati.flightreservation1.services.ReservationServationImpl;

@RestController
public class ReservationRESTController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ReservationRESTController.class);

 
	@Autowired
	ReservationRepository reservationRepository;
	
	
	
	@RequestMapping("/reservations/{id}")
	public Reservation findReservation(@PathVariable("id")Long id) {
		LOGGER.info("Inside findReservation() "+id);

		return reservationRepository.findById(id).get();
	}
	@RequestMapping("/reservations")
	public Reservation updatereservation(@RequestBody ReservationUpdateRequest request) {
		LOGGER.info("Inside updatereservation() "+request);

		Reservation reservation = reservationRepository.findById(request.getId()).get();
		reservation.setNumberOfBags(request.getNumberOfBags());
		reservation.setCheckedIn(request.getChechedIn());
		LOGGER.info("saving reservation "+request);

		return reservationRepository.save(reservation);
		
	}
}
