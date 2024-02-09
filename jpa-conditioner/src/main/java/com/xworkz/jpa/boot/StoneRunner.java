package com.xworkz.jpa.boot;

import com.xworkz.jpa.entites.StoneEntity;
import com.xworkz.jpa.repository.StoneRepository;
import com.xworkz.jpa.repository.StoneRepositoryImpl;

import java.util.ArrayList;
import java.util.List;

public class StoneRunner {
    public static void main(String[] args) {
        StoneEntity stoneEntity = new StoneEntity("Obsidian", "Large", "Sapphire Blue", 5000D);

        StoneRepository repository = new StoneRepositoryImpl();
//        repository.save(stoneEntity);
        System.out.println("__________________________________________________");

        List<StoneEntity> list = new ArrayList<>();
        list.add(new StoneEntity("Amethyst", "Small", "Amethyst Purple", 300));
        list.add(new StoneEntity("Jade", "Medium", "Topaz Yellow", 500));
        list.add(new StoneEntity("Quartz", "Large", "Ruby Red", 564));
        list.add(new StoneEntity("Onyx", "Large", "Emerald Green", 432));

//        repository.saveAll(list);

        repository.updateStoneSizeByName("Quartz", "Medium");
        System.out.println("_________________________________________________");

        repository.deleteById(2);
        System.out.println("________________________________________________");

        repository.findAllByColor("Amethyst Purple");
        System.out.println("________________________________________________");

        repository.findIdByName("Jade");
        System.out.println("_________________________________________________");

        repository.findAllByColorSize("Emerald Green", "Large");
        System.out.println("_________________________________________________");

        repository.fineAll().forEach(System.out::println);
        System.out.println("____________________________________________________");

        System.out.println("FIND BY ID USING CRITERIA");
        repository.findById(3);
        System.out.println("____________________________________________________");

        System.out.println("FIND BY SIZE");
        repository.findBySize("Medium");
        System.out.println("____________________________________________________");

        System.out.println("FIND BY ID AND NAME");
        repository.findByIdAndName(5);
        System.out.println("____________________________________________________");

        System.out.println("FIND BY SIZE COLOR AND NAME");
        repository.findByStoneSizeColorAndName("Large", "Emerald Green", "Onyx");
        System.out.println("____________________________________________________");
    }
}
