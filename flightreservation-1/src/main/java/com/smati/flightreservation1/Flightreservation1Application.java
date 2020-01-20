package com.smati.flightreservation1;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Flightreservation1Application extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(Flightreservation1Application.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(Flightreservation1Application.class, args);
	}

	  @PostConstruct
	    void init() {
	        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
	    }
}
