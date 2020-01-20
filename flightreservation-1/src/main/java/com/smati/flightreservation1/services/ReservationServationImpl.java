package com.smati.flightreservation1.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smati.flightreservation1.Controllers.FlightController;
import com.smati.flightreservation1.DataTransferObject.ReservationRequest;
import com.smati.flightreservation1.Util.EmailUtil;
import com.smati.flightreservation1.Util.PDFGenerator;
import com.smati.flightreservation1.entities.Flight;
import com.smati.flightreservation1.entities.Passenger;
import com.smati.flightreservation1.entities.Reservation;
import com.smati.flightreservation1.repos.FlightRepository;
import com.smati.flightreservation1.repos.PassengerRepository;
import com.smati.flightreservation1.repos.ReservationRepository;

@Service
@Transactional
public class ReservationServationImpl implements ReservationService {

	@Value("${com.smati.flightreservation-1.itinerary.dirpath}")
	private String ITINERARY_DIR = "C:/Users/King_Lap/Documents/FlightReservation/Reservation/reservation";
	@Autowired
	FlightRepository flightRepository;
	@Autowired
	PassengerRepository passengerRepository;
	@Autowired
	ReservationRepository reservationRepository;
	@Autowired
	PDFGenerator pdfGenerator;
	@Autowired
	EmailUtil emailUtil;

	private static final Logger LOGGER = LoggerFactory.getLogger(ReservationServationImpl.class);

	@Override
	public Reservation bookFlight(ReservationRequest request) {
		LOGGER.info("inside bookFlight()");
		// make payment

		Long flightId = request.getFlightid();
		LOGGER.info("fetching flight for flight id" + flightId);
		Flight flight = flightRepository.findById(flightId).get();

		Passenger passenger = new Passenger();
		passenger.setFirstName(request.getPassengerFirstName());
		passenger.setLastName(request.getPassengerLastName());
		passenger.setPhone(request.getPassengerPhone());
		passenger.setEmail(request.getPassengerEmail());
		LOGGER.info("Saving passenger" + passenger);
		Passenger savedPassenger = passengerRepository.save(passenger);

		Reservation reservation = new Reservation();
		reservation.setFlight(flight);
		reservation.setPassenger(savedPassenger);
		reservation.setCheckedIn(false);
		LOGGER.info("Saving reservation" + reservation);
		Reservation savedReservation = reservationRepository.save(reservation);

		String filePath = ITINERARY_DIR
				+ savedReservation.getId() + ".pdf";
		LOGGER.info("generating the itinerary");
		pdfGenerator.GenerateItinerary(savedReservation, filePath);
		LOGGER.info("Emailing the itinerary");
		emailUtil.sendItinerary(passenger.getEmail(), filePath);
		return savedReservation;

	}

}
