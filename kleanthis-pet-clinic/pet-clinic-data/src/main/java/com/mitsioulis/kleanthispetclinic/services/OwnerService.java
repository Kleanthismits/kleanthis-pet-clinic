package com.mitsioulis.kleanthispetclinic.services;

import java.util.Set;

import com.mitsioulis.kleanthispetclinic.model.Owner;

public interface OwnerService {
	
	Owner findByLastName(String lastName);
	Owner findById(Long id);
	Owner save(Owner owner);
	Set<Owner> findAll();
}
