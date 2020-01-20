 /* package com.smati.flightreservation1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class SecurityServiceImpl implements SecurityService {

	@Autowired
	UserDetailsService userDetailsService;
	@Autowired
	AuthenticationManager authenticationManager;
	
	
	@Override
	public boolean login(String username, String password) {
		UserDetails userDetails = userDetailsService.loadUserByUsername(username);
		UsernamePasswordAuthenticationToken Token = new UsernamePasswordAuthenticationToken(userDetails, password,userDetails.getAuthorities());
		
		authenticationManager.authenticate(Token);
		boolean result = Token.isAuthenticated();
		if (result) {
			SecurityContextHolder.getContext().setAuthentication(Token);
		}
		return result;
	}
	
	
	
	
	
	

}*/
	
