package edu.uniandes.veterinary;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

public class VeterinaryManagerTest {
		
	@Test 
	public void simpleTest() {
		
		PodamFactory factory = new PodamFactoryImpl();
		Pet pet = factory.manufacturePojo(Pet.class);
		assertNotNull(pet);
		assertNotNull(pet.getOwner());
		assertNotNull(pet.getBreed());
		assertNotNull(pet.getDiagnostics());
		for (Diagnostic d : pet.getDiagnostics()) {
			assertNull(d.getDate());
			assertNull(d.getDescription());
			assertNull(d.getMedication());
			assertNull(d.getDicease());
		}
	}
}
