package com.xworkz.jpa.repository;

import com.xworkz.jpa.entites.DiseaseEntity;

public interface DiseaseRepository {

	Integer saveDisease(DiseaseEntity diseaseEntity);

}