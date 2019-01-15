package com.mitsioulis.kleanthispetclinic.services;

import java.util.Set;

import com.mitsioulis.kleanthispetclinic.model.Vet;

public interface VetService {

	Vet findById(Long id);
	Vet save(Vet Vet);
	Set<Vet> findAll();
	
}
