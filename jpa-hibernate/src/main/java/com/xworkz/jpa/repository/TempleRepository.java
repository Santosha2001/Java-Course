package com.xworkz.jpa.repository;

import com.xworkz.jpa.entities.TempleEntity;

import java.time.LocalDate;
import java.util.List;

public interface TempleRepository {
    void save(TempleEntity templeEntity);

    List<TempleEntity> findAllByLocation(String location);
//
//    List<TempleEntity> findAllByEntryFeeGreaterThan(double fee);
//
//    List<TempleEntity> findAllByEntryFeeBetween(double startFee, double endFee);
//
//    List<TempleEntity> findAllByDateGreaterThan(LocalDate date);
//
//    List<TempleEntity> findAllByGodAndLocation(String god, String location);
//
//    TempleEntity findById(int id);
}
