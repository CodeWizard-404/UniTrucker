package com.dsi.projet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dsi.projet.entities.Etudiant;
import com.dsi.projet.services.EtudiantService;


@RestController
public class EtudiantController {
	@Autowired
	private EtudiantService etdServ;
	
	@GetMapping("/etd")
	public List<Etudiant> getAll(){
	return etdServ.getAll();}
	
	
	@PostMapping("/etd")
	public Etudiant addEtudiant(@RequestBody Etudiant e){
	return etdServ.addEtudiant(e);	}

}
