package com.smati.flightcheckin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.smati.flightcheckin.integration.ReservationRestClient;
import com.smati.flightcheckin.integration.dto.Reservation;
import com.smati.flightcheckin.integration.dto.ReservationUpdateRequest;

@Controller
public class CheckinController {

	@Autowired
	ReservationRestClient restClient;

	@RequestMapping("/showStartChekin")
	public String showStratCheckin() {
		return "startCheckin";
	}

	@RequestMapping("/startCheckIn")
	public String startCheckIn(@RequestParam("reservationId") Long reservationId, ModelMap modelMap) {
		Reservation reservation = restClient.findReservation(reservationId);
		modelMap.addAttribute("reservation", reservation);
		return "displayReservationDetails";

	}

	@RequestMapping("/completeCheckIn")
	public String completeCheckIn(@RequestParam("reservationId") Long reservationId,
			@RequestParam("numberOfBags") int numberOfBags) {
		ReservationUpdateRequest reservationupdateRequest = new ReservationUpdateRequest();
		reservationupdateRequest.setId(reservationId);
		reservationupdateRequest.setChechedIn(true);
		reservationupdateRequest.setNumberOfBags(numberOfBags);
		restClient.updateReservation(reservationupdateRequest);
		return "checkinConfirmation";
	}
}
