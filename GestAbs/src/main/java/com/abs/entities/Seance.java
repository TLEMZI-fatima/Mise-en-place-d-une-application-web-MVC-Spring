package com.abs.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Seance {
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_seance;
	private String date;
	private String matiere;
	
	@OneToMany
	@JoinColumn(name = "id_seance")
	List<Absence> abs;
	
	public Seance(String date, String matiere, List<Absence> abs)  {
		super();
		// TODO Auto-generated constructor stub
		this.date = date;
		this.matiere = matiere;
		this.abs = abs;
	}

	
	
	public Seance() {
		// TODO Auto-generated constructor stub
	}

	public int getId_seance() {
		return id_seance;
	}


	public void setId_seance(int id_seance) {
		this.id_seance = id_seance;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getMatiere() {
		return matiere;
	}


	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}





}
