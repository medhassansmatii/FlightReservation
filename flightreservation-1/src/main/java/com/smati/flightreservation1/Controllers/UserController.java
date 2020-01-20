package com.smati.flightreservation1.Controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.smati.flightreservation1.entities.User;
import com.smati.flightreservation1.repos.UserRepository;
//import com.smati.flightreservation1.services.SecurityService;

@Controller
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	@Autowired
	//private SecurityService securityService;
	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

	@Autowired
	//private BCryptPasswordEncoder encoder;

	@RequestMapping("/showReg")
	public String showRegistrationPage() {
		LOGGER.info("Inside showRegistrationPage() ");
		return "login/registerUser";
	}

	@RequestMapping(value = "/registerUser", method = RequestMethod.POST)
	public String register(@ModelAttribute("user") User user) {
		LOGGER.info("Inside register()"+user);
		//user.setPassword(encoder.encode(user.getPassword()));
		userRepository.save(user);
		return "login/login";
	}

	@RequestMapping("/showLogin")
	public String showLoginPage() {
		LOGGER.info("Inside showLoginPage() ");
		return "login/login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestParam("email") String email, @RequestParam("password") String password,
			ModelMap modelmap) {
		User user = userRepository.findByEmail(email);
		LOGGER.info("Inside login() and the email is :"+email);
		if (user != null && user.getPassword().equals(password)) {
			return "findFlights";
		} else {
			modelmap.addAttribute("msg", "Invalid User Name Or Password Please Try Again!");
		}
		return "login/login";

	}
}
