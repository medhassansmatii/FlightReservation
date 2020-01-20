 package com.smati.flightcheckin.integration;

import com.smati.flightcheckin.integration.dto.Reservation;
import com.smati.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {
 public Reservation findReservation(Long id);
 public Reservation updateReservation(ReservationUpdateRequest request) ;
}
