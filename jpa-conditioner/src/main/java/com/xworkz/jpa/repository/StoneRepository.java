package com.xworkz.jpa.repository;

import com.xworkz.jpa.entites.StoneEntity;

import java.util.List;

public interface StoneRepository {
    void save(StoneEntity entity);

    void saveAll(List<StoneEntity> list);

    void updateStoneSizeByName(String name, String size);

    void deleteById(int id);

    List<StoneEntity> findAllByColor(String color);

    List<Integer> findIdByName(String name);

    List<StoneEntity> findAllByColorSize(String color, String size);

    List<StoneEntity> fineAll();

    //criteria
    StoneEntity findById(int id);

    List<StoneEntity> findBySize(String size);

    StoneEntity findByIdAndName(int id);

    List<StoneEntity> findByStoneSizeColorAndName(String size, String color, String name);

}
