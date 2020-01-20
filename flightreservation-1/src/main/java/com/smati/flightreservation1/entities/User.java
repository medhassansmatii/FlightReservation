package com.smati.flightreservation1.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class User extends AbstractEntities{
	
private String firstName;
private String lastName;
private String email;
private String password;
@ManyToMany
@JoinTable(name="user_role",joinColumns=@JoinColumn(name="USER_ID"),inverseJoinColumns = @JoinColumn(name="role_id"))
private Set<Role> roles;
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastname() {
	return lastName;
}
public void setLastname(String lastname) {
	this.lastName = lastname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "User [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", password=" + password
			+ "]";
}
public Set<Role> getRoles() {
	return roles;
}
public void setRoles(Set<Role> roles) {
	this.roles = roles;
}

}
