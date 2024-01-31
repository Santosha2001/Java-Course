package com.xworkz.jpa.repository;

import com.xworkz.jpa.entites.ConditionerEntity;

import java.util.List;

public interface ConditionerRepository {
    void save(ConditionerEntity conditioner);

    void saveAll(List<ConditionerEntity> conditionerEntities);

    void updateNetQuantityByBrand(String brand, double netQuantity);

    void updateRecommendedForByBrand(String brand, String recommendedFor);

    List<ConditionerEntity> findAllByBrand(String brand);

    List<ConditionerEntity> findAllByHairType(String hairType);

    String findScentById(int id);

    List<Double> getAllSize();

    List<String> getAllBrand();
}
