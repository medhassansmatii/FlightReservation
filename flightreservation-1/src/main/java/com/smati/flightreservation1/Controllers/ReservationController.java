package com.smati.flightreservation1.Controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.smati.flightreservation1.DataTransferObject.ReservationRequest;
import com.smati.flightreservation1.entities.Flight;
import com.smati.flightreservation1.entities.Reservation;
import com.smati.flightreservation1.repos.FlightRepository;
import com.smati.flightreservation1.services.ReservationService;

@Controller
public class ReservationController {

	@Autowired
	FlightRepository flightRepository;
	@Autowired
	ReservationService reservationService;
	private static final Logger LOGGER = LoggerFactory.getLogger(ReservationController.class);


	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("flightId") Long flightId, ModelMap modelMap) {
		Flight flight = flightRepository.findById(flightId).get();
		LOGGER.info("Inside showCompleteReservation() and the flight id is: "+flightId);

		

		modelMap.addAttribute("flight", flight);
LOGGER.info("flight is "+flight  );


		return "completeReservation";

	}
	@RequestMapping(value="/completeReservation" ,method=RequestMethod.POST)
	public String completeReservation(ReservationRequest request, ModelMap modelMap) {
		LOGGER.info("Inside completeReservation() "+request );

		Reservation reservation = reservationService.bookFlight(request);
		modelMap.addAttribute("msg", "Reservation created successfully and the id is "+reservation.getId());
		LOGGER.info("Reservation created successfully and the id is");
		return "reservationConfirmation";
	}
}
