package com.xworkz.jpa.boot;

import com.xworkz.jpa.entites.TravelEntity;
import com.xworkz.jpa.repository.TravelRepository;
import com.xworkz.jpa.repository.TravelRepositoryImpl;

public class TravelRunner {

	public static void main(String[] args) {
		TravelEntity entity = new TravelEntity(1, "Bengalore", "Darmastala", 8, 1000);

		TravelRepository repository = new TravelRepositoryImpl();

		repository.saveTravel(entity);
	}
}
