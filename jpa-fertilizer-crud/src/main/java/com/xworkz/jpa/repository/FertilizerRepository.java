package com.xworkz.jpa.repository;

import java.util.List;

import com.xworkz.jpa.entites.FertilizerEntity;

public interface FertilizerRepository {

	Integer save(FertilizerEntity fertilizerEntity);

	void save(List<FertilizerEntity> fertilizerEntities);

	void findById(int fertilizerId);

	List<FertilizerEntity> findAll();

}