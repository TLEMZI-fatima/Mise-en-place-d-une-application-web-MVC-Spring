package com.abs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.abs.entities.Absence;
import com.abs.services.AbsenceService;

@Controller
public class AbsenceController {
	@Autowired
	private AbsenceService absenceService;
	
	@GetMapping("/absences")
	public String absence(Model model) {
		model.addAttribute("absence", new Absence());
		return "ListAbsence.html";
	}
	@PostMapping("/addabsence")
	public String addAbsence(Absence a) {
		absenceService.CreateAbsence(a);
		return "ListAbsence.html";
	}
	
	
	@PostMapping("/saveAbsence")
	public String save(@ModelAttribute("Absence") Absence absence) {
		
		absenceService.Save(absence);
		
		return "redirect:/ListAbsence" ;
	}
	@GetMapping("/listAbsence")
	public String list(Model model) {
		
		 List<Absence> lsit =  ( absenceService).getAll();
		
		 model.addAttribute("list", lsit);
		
		return "ListAbsence" ;
	}
	
}
