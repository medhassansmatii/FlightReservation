package com.smati.flightreservation1.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smati.flightreservation1.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

}
