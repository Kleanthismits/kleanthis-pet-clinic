package com.mitsioulis.kleanthispetclinic.services;

import com.mitsioulis.kleanthispetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
	
	Owner findByLastName(String lastName);
	
}
