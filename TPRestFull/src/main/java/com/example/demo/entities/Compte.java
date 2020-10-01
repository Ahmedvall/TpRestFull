package com.example.demo.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Data @NoArgsConstructor @AllArgsConstructor @ToString
@Entity
public class Compte {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long code;
	private double sole;
	private Date dateCreation;
	private String type;
	public Compte(Long code, double sole, Date dateCreation, String type) {
		super();
		this.code = code;
		this.sole = sole;
		this.dateCreation = dateCreation;
		this.type = type;
	}
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
	}
	public double getSole() {
		return sole;
	}
	public void setSole(double sole) {
		this.sole = sole;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}