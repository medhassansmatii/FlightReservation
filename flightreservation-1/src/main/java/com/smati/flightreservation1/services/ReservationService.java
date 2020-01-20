package com.smati.flightreservation1.services;

import com.smati.flightreservation1.DataTransferObject.ReservationRequest;
import com.smati.flightreservation1.entities.Reservation;

public interface ReservationService {

	public Reservation bookFlight(ReservationRequest request) ;
	}
