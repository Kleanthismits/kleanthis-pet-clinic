package com.mitsioulis.kleanthispetclinic.services;

import java.util.Set;

import com.mitsioulis.kleanthispetclinic.model.Pet;

public interface PetService {

	Pet findById(Long id);
	Pet save(Pet Pet);
	Set<Pet> findAll();
}
