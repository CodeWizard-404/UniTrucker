package com.dsi.projet.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dsi.projet.entities.Professeur;
import com.dsi.projet.services.ProfServiceImpl;

@RestController
@CrossOrigin("http://localhost:4200")
public class ProfController {
	@Autowired
	private ProfServiceImpl profService;
	
	
	@GetMapping("/profs")
	public List<Professeur> getProfs(){
	return profService.getProfs();}
	
	
	@PostMapping("/profs")
	public Professeur addProf(@RequestBody Professeur p){
	return profService.addProf(p);
}

}