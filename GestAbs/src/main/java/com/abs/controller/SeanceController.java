package com.abs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.abs.entities.Eleve;
import com.abs.entities.Seance;
import com.abs.services.SeanceService;



@Controller
public class SeanceController {
	@Autowired 
	SeanceService seanceService ;
	
	@GetMapping("/seances")
	public String seance(Model model) {
		model.addAttribute("seance", new Seance());
		return "AddSeance.html";
	}
	@PostMapping("/addseance")
	public String addSeance(Seance s) {
		seanceService.CreateSeance(s);
		return "AddSeance.html";
	}
	
	@PostMapping("/saveSeance")
	public String save(@ModelAttribute("seance") Seance seance) {
		
		seanceService.Save(seance);
		
		return "redirect:/ListSeance" ;
	}
	@GetMapping("/listSeances")
	public String list(Model model) {
		
		 List<Seance> list =  (seanceService).getAll();
		
		 model.addAttribute("list", list);
		
		return "ListSeance" ;
	}
	
}
