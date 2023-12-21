package com.hotelbookings.model;

import java.util.Collection;
import java.util.HashSet;

import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

public class User {
	
	private Long id;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String password;
	
	
	@ManyToMany(fetch = FetchType.EAGER,
			cascade = {CascadeType.PERSIST,
					CascadeType.MERGE,CascadeType.DETACH})
	@JoinTable(name = "user_roles", joinColumns = @JoinColumn(name="user_id",referencedColumnName = "id"))
	private Collection<Role> roles =  new HashSet<>();

}
