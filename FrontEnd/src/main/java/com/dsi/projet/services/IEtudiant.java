package com.dsi.projet.services;

import java.util.List;

import com.dsi.projet.entities.Etudiant;

public interface IEtudiant {
	public Etudiant addEtudiant(Etudiant e);
	public List<Etudiant> getAll();

}
