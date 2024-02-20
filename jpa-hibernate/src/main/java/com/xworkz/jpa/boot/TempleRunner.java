package com.xworkz.jpa.boot;

import com.xworkz.jpa.entities.TempleEntity;
import com.xworkz.jpa.repository.TempleRepository;
import com.xworkz.jpa.repository.TempleRepositoryImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TempleRunner {
    public static void main(String[] args) {
        TempleRepository repository = new TempleRepositoryImpl();
        // System.out.println("SAVE SINGLE ENTITY.");
        //TempleEntity temple = new TempleEntity(9, "Kedarnath temple", "Kedarnath", 0, 2000, LocalDate.of(1990, 5, 7), "Shiva", 1000);
        //repository.save(temple);
        //System.out.println("___________________________________________________________________________________________________________________________\n");
        System.out.println("FINDALLBYLOCATION");
        repository.findAllByLocation("Ujire");
        System.out.println("___________________________________________________________________________________________________________________________\n");

        System.out.println("___________________________________________________________________________________________________________________________\n");
        System.out.println("___________________________________________________________________________________________________________________________\n");


    }
}
