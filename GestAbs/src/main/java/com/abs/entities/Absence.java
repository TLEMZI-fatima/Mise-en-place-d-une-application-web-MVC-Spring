package com.abs.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Absence {
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_abs;
	@ManyToOne
	@JoinColumn(name = "id_seance")
	private Seance seance;
	@ManyToOne
	 @JoinColumn(name = "id_eleve")
	private Eleve eleve;
	private boolean abs = false;
	public Absence() {}
	public Absence(Seance seance, Eleve eleve, boolean abs) {
		super();
		this.seance = seance;
		this.eleve = eleve;
		this.abs = abs;
		
	}
	public int getId_abs() {
		return id_abs;
	}
	public void setId_abs(int id_abs) {
		this.id_abs = id_abs;
	}
	public Seance getSeance() {
		return seance;
	}
	public void setSeance(Seance seance) {
		this.seance = seance;
	}
	public Eleve getEleve() {
		return eleve;
	}
	public void setEleve(Eleve eleve) {
		this.eleve = eleve;
	}
	public boolean isAbs() {
		return abs;
	}
	public void setAbs(boolean abs) {
		this.abs = abs;
	}
		
	

}
