package com.xworkz.jpa.boot;

import com.xworkz.jpa.entites.ConditionerEntity;
import com.xworkz.jpa.repository.ConditionerRepository;
import com.xworkz.jpa.repository.ConditionerRepositoryImpl;

public class ConditionerRunner {
    public static void main(String[] args) {
        ConditionerRepository repository = new ConditionerRepositoryImpl();

        System.out.println("FIND ALL BY BRAND");
        repository.findAllByBrand("Biolage");
        System.out.println("_________________________________________________________________________________");

        System.out.println("FIND ALL BY HAIR TYPE");
        repository.findAllByHairType("All");
        System.out.println("_________________________________________________________________________________");

        System.out.println("FIND SCENT BY ID.");
        repository.findScentById(1);
        System.out.println("_________________________________________________________________________________");

        System.out.println("UPDATE NET QUANTITY BY BRAND.");
        repository.updateNetQuantityByBrand("Moroccanoil", 170.3D);
        System.out.println("_________________________________________________________________________________");

        System.out.println("UPDATE RECOMMENDED FOR BY BRAND.");
        repository.updateRecommendedForByBrand("Biolage", "Hair growth and shine");
        System.out.println("_________________________________________________________________________________");

        System.out.println("GET ALL SIZE.");
        repository.getAllSize();
        System.out.println("_________________________________________________________________________________");

        System.out.println("GET ALL BRAND.");
        repository.getAllBrand();
        System.out.println("_________________________________________________________________________________");

    }
}
