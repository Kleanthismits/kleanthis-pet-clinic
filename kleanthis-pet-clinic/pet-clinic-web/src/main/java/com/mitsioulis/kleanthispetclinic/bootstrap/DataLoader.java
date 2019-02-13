package com.mitsioulis.kleanthispetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mitsioulis.kleanthispetclinic.model.Owner;
import com.mitsioulis.kleanthispetclinic.model.Vet;
import com.mitsioulis.kleanthispetclinic.services.OwnerService;
import com.mitsioulis.kleanthispetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner{
	
	private  final OwnerService ownerService;
	private  final VetService vetService;
	
	public DataLoader(OwnerService ownerService, VetService vetService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
	}



	@Override
	public void run(String... args) throws Exception {
		
		Owner owner1 = new Owner();
		owner1.setFirstName("Kleanthis");
		owner1.setLastName("Mitsioulis");
		
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setFirstName("Makis");
		owner2.setLastName("Mitsioulis");
		
		ownerService.save(owner2);
		
		System.out.println("Loaded Owners");
		
		Vet vet1 = new Vet();
		vet1.setFirstName("Sofia");
		vet1.setLastName("Naki");
		
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setFirstName("Bill");
		vet2.setLastName("Gakias");
		
		vetService.save(vet2);
		System.out.println(vet2);
		System.out.println(vet1);
		
		System.out.println("Loaded Vets");
	}

}
