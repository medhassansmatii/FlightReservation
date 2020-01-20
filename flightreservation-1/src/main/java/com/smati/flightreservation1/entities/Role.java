package com.smati.flightreservation1.entities;

import java.nio.MappedByteBuffer;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

//import org.springframework.security.core.GrantedAuthority;

@Entity
public class Role extends AbstractEntities/* implements GrantedAuthority*/  {
	private String  Name ;
	@ManyToMany(mappedBy = "roles")
	private Set<User> users;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	//@Override
	//public String getAuthority() {
	//	return Name;
	//}
	

}
