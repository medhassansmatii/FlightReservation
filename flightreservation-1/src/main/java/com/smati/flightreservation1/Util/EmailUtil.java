package com.smati.flightreservation1.Util;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailSender;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import com.smati.flightreservation1.services.ReservationServationImpl;

@Component
public class EmailUtil {

	@Value("${com.smati.flightreservation-1.itinerary.email.subject}")
	private String EMAIL_SUBJECT = "Itineray for your Flight";

	@Value("${com.smati.flightreservation-1.itinerary.email.body}")
	private String EMAIL_BODY = "please find your Itinerary attached.";

	@Autowired
	JavaMailSender sender;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EmailUtil.class);

	
	
	public void sendItinerary(String toAddress,String filePath) {

		LOGGER.info("Inside sendItinerary() "+toAddress +filePath);

		MimeMessage message = sender.createMimeMessage();
		try {
			MimeMessageHelper messageHelper = new MimeMessageHelper(message,true);
			messageHelper.setTo(toAddress);
			messageHelper.setSubject(EMAIL_SUBJECT);
			messageHelper.setText(EMAIL_BODY);
			messageHelper.addAttachment("Itinearary", new File(filePath) );
			sender.send(message);
		} catch (MessagingException e) {

			
			LOGGER.error("Exception inside sendItinerary"+ e);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
