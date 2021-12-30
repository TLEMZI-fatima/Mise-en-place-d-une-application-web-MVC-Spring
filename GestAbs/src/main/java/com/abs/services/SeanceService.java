package com.abs.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.abs.entities.Eleve;
import com.abs.entities.Seance;
import com.abs.repositories.SeanceRepository;
@Service
public class SeanceService {
	@Autowired
	private SeanceRepository seancerepo;
	
	//ajouter seance
	
	public Seance CreateSeance(@RequestBody Seance s) {
		return seancerepo.save(s);
	}
	
	//affichage des seance
	public List<Seance> getEleve(){
		return seancerepo.findAll();
	}

	public void Save(Seance seance) {
		// TODO Auto-generated method stub
		seancerepo.save(seance); 
	}

	public List<Seance> getAll() {
		// TODO Auto-generated method stub
		return seancerepo.findAll();
	}

	

	
}
