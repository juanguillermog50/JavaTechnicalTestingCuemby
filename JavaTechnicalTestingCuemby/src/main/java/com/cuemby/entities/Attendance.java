package com.cuemby.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "attendance")
public class Attendance implements Serializable {

	private static final long serialVersionUID = 1L;
	// Atributtes
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	@Column(name = "employee")
	private int employee;// Employee's ID
	@Column(name = "date")
	private Date date;
	@Column(name = "attend")
	private boolean attend;

	// Constructor
	public Attendance() {
	}

	// Getters and setters
	public int getId() {
		return employee;
	}

	public void setId(int id) {
		this.employee = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
