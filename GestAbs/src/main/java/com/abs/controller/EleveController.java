package com.abs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.abs.entities.Eleve;
import com.abs.services.EleveService;
@Controller
public class EleveController {
	@Autowired
	private EleveService eleveService;
//	private EleveRepository eleverepo;
	
	//AjouterEleve 
//    @GetMapping("/eleves")
//	public String getAlleleve() {
//		return "Eleves.html";
//	}
	@GetMapping("/eleves")
	public String eleve(Model model) {
		model.addAttribute("eleve", new Eleve());
		return "ListEleve.html";
	}
	@PostMapping("/addeleve")
	public String addEleve(Eleve e) {
		eleveService.CreateEleve(e);
		return "ListEleve.html";
	}
	
	
	@PostMapping("/saveEleve")
	public String save(@ModelAttribute("eleve") Eleve eleve) {
		
		eleveService.Save(eleve);
		
		return "redirect:/eleves" ;
	}
	@GetMapping("/listEleves")
	public String list(Model model) {
		
		 List<Eleve> lsit =  ( eleveService).getAll();
		
		 model.addAttribute("list", lsit);
		
		return "AddEleve" ;
	}
	
	

}
