package com.xworkz.jpa.boot;

import com.xworkz.jpa.entites.ConditionerEntity;
import com.xworkz.jpa.repository.ConditionerRepository;
import com.xworkz.jpa.repository.ConditionerRepositoryImpl;

import java.util.ArrayList;
import java.util.List;

public class ConditionerCreate {
    public static void main(String[] args) {
        ConditionerEntity conditioner = new ConditionerEntity(6, 134, "Dove", "Liquid", "All", "Strengthen", "All", "Detangling", 167.4D, 1, "Camellia", "Paraben free");

        ConditionerRepository repository = new ConditionerRepositoryImpl();

        repository.save(conditioner);

        System.out.println("_________________________________________________________________________________________");

        List<ConditionerEntity> list = new ArrayList<>();
        list.add(new ConditionerEntity(7, 176, "Medimix", "Solid", "Dandruff remove", "Shining", "All", "Hair growth", 182, 2, "Moroccanoil Moisture Repair Conditioner", "PP (Polypropylene)"));
        list.add(new ConditionerEntity(8, 156, "Lux", "Liquid", "All", "Dandruff remove", "Adults", "Freez management", 160, 2, "Aussie 3 Minute Miracle Moist", "LDPE (Low-Density Polyethylene)"));

        repository.saveAll(list);
    }
}
