package com.isil.usermanagement.model;

/**
 * User.java
 * This is a model class represents a User entity
 * @author Abel Huarca [Isil]
 *
 */
/**
 * @author Alumno
 *
 */
public class Alumno {
	protected int id;
	protected String name;
	protected String lastname;
	protected double average;
	
	public Alumno() {
	}
	
	
	
	

	public Alumno(String name, String lastname, double average) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.average = average;
	}
	
	


	public Alumno(int id, String name, String lastname, double average) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.average = average;
	}





	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}



	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public double getAverage() {
		return average;
	}


	public void setAverage(double average) {
		this.average = average;
	}





   
	
	
	
	
	
}
	