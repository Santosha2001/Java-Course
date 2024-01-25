package com.xworkz.jpa.boot;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.jpa.entites.FertilizerEntity;
import com.xworkz.jpa.repository.FertilizerRepository;
import com.xworkz.jpa.repository.FertilizerRepositoryImpl;

public class FertilizerRunner {

	public static void main(String[] args) {
		/*
		 * FertilizerEntity entity = new FertilizerEntity(0, "Miracle-Gro",
		 * "Miracle-Gro", 1000, LocalDate.of(2022, 11, 12), LocalDate.of(2024, 7, 18));
		 * repository.save(entity);
		 */

		FertilizerRepository repository = new FertilizerRepositoryImpl();

//		List<FertilizerEntity> fertilizerEntities = new ArrayList<FertilizerEntity>();
//
//		fertilizerEntities.add(new FertilizerEntity(2, "Scotts Turf Builder Lawn Food", "Scotts", 1200,
//				LocalDate.of(2021, 11, 3), LocalDate.of(2024, 5, 11)));
//		fertilizerEntities.add(new FertilizerEntity(3, "Jobe's Organics", "Jobe's", 1000, LocalDate.of(2022, 1, 3),
//				LocalDate.of(2023, 8, 1)));
//		fertilizerEntities.add(new FertilizerEntity(4, "Osmocote Smart-Release ", "Osmocote", 800,
//				LocalDate.of(2022, 4, 23), LocalDate.of(2024, 2, 11)));
//		
//		repository.save(fertilizerEntities);

		repository.findById(1);
		System.out.println("_______________________________________________________________");
		repository.findAll();

	}
}
