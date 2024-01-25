package com.xworkz.jpa.boot;

import com.xworkz.jpa.entites.DiseaseEntity;
import com.xworkz.jpa.repository.DiseaseRepository;
import com.xworkz.jpa.repository.DiseaseRepositoryImpl;

public class DiseaseRunner {

	public static void main(String[] args) {
		DiseaseEntity entity = new DiseaseEntity(1, "Fever", "Mosquito", 2, "India");

		DiseaseRepository repository = new DiseaseRepositoryImpl();

		repository.saveDisease(entity);
	}
}
