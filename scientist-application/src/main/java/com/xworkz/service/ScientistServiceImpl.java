package com.xworkz.service;

import org.springframework.stereotype.Service;

import com.xworkz.dto.ScientistDTO;

@Service
public class ScientistServiceImpl implements ScientistService {

	public ScientistServiceImpl() {
		System.out.println("ScientistServiceImpl");
	}

	@Override
	public boolean saveAndValidate(ScientistDTO dto) {
		System.out.println("saveAndValidate created in ServiceImpl");
		return true;
	}
}
