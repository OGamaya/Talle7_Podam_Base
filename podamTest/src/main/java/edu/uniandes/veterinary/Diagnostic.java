package edu.uniandes.veterinary;

import java.util.Date;

public class Diagnostic {
	private int id;
	private Date date;
	private String description;
	private Medication medication;
	private Dicease dicease;

	public int getId() {
		return id;
	}
	public Date getDate() {
		return date;
	}
	public String getDescription() {
		return description;
	}
	public Medication getMedication() {
		return medication;
	}
	public Dicease getDicease() {
		return dicease;
	}
	@Override
	public String toString() {
		return "Diagnostic [id=" + id + ", date=" + date + ", description=" + description + ", \n\t\tmedication=" + medication
				+ "\t\t dicease=" + dicease + "]";
	}
	
}
