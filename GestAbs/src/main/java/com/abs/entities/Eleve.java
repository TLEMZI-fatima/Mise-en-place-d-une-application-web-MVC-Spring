package com.abs.entities;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Eleve {
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id_eleve;
	private String nom;
	private String prenom;
	private int cne;
	
	@OneToMany
	@JoinColumn(name="id_eleve")
	List<Absence> abs;

	public Eleve(int id_eleve,String nom, String prenom, int cne, List<Absence> abs) {
		super();
		this.id_eleve = id_eleve;
		this.nom = nom;
		this.prenom = prenom;
		this.cne= cne;
		this.abs= abs;
	}
	

	
	public Eleve() {
		// TODO Auto-generated constructor stub
	}



	public int getIdEleve() {
		return id_eleve;
	}



	public void setIdEleve(int id_eleve) {
		this.id_eleve = id_eleve;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public int getCne() {
		return cne;
	}



	public void setCne(int cne) {
		this.cne = cne;
	}



	public List<Absence> getAbs() {
		return abs;
	}



	public void setAbs(List<Absence> abs) {
		this.abs = abs;
	}



}

