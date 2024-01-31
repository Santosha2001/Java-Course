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
    }
}
