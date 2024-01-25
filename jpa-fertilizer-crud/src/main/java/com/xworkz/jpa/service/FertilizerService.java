package com.xworkz.jpa.service;

import com.xworkz.jpa.entites.FertilizerEntity;

public interface FertilizerService {

	boolean saveAndValidate(FertilizerEntity entity);
}
