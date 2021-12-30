package com.abs.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.abs.entities.Absence;
import com.abs.repositories.AbsenceRepository;

@Service
public class AbsenceService {
	@Autowired
	private AbsenceRepository absrepo;
	//ajouter eleve
	
	public Absence CreateAbsence(@RequestBody Absence a) {
		return absrepo.save(a);
	}
	
	//affichage des eleve 
	public List<Absence> getEleve(){
		return absrepo.findAll();
	}

	public void Save(Absence absence) {
		// TODO Auto-generated method stub
		absrepo.save(absence); 
	}

	public List<Absence> getAll() {
		// TODO Auto-generated method stub
		return absrepo.findAll();
	}



	
}


