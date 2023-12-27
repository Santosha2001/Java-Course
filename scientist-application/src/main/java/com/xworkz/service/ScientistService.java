package com.xworkz.service;


import com.xworkz.dto.ScientistDTO;

public interface ScientistService {

	boolean saveAndValidate(ScientistDTO dto);
}