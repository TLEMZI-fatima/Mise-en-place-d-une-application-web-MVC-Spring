package com.abs.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.abs.entities.Eleve;
import com.abs.repositories.EleveRepository;
@Service
public class EleveService {
	
	@Autowired
	private EleveRepository eleverepo;
	//ajouter eleve
	
	
	
	public Eleve CreateEleve(@RequestBody Eleve e) {
		return eleverepo.save(e);
	}
	

	//affichage des eleve
	@RequestMapping(value="/eleves",method=RequestMethod.GET)
	public List<Eleve> getEleve(){
		return eleverepo.findAll();
	}


	public List<Eleve> getAll() {
		// TODO Auto-generated method stub
		return eleverepo.findAll();
	}

	
	
	public void Save(Eleve eleve) {
		// TODO Auto-generated method stub
		eleverepo.save(eleve); 
	}



	

}
