package com.xworkz.engineer.app.service;

import com.xworkz.engineer.app.dto.EngineerDTO;
import com.xworkz.engineer.app.repository.EngineerRepository;

public class EngineerServiceImpl implements EngineerService {

	private EngineerRepository repo;

	public EngineerServiceImpl(EngineerRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public boolean saveAndValidate(EngineerDTO dto) {

		if (dto != null) {

			int id = dto.getId();
			String name = dto.getName();
			String collegeName = dto.getCollegeName();

			if (id > 1) {
				System.out.println(dto.getId() + " Id is valid");
			} else {
				System.err.println("Id is in-valid");
				return false;
			}

			if (name != null && !name.isEmpty() && name.length() >= 3 && name.length() <= 20 && collegeName != null
					&& !collegeName.isEmpty() && collegeName.length() > 3 && collegeName.length() <= 20) {
				System.out.println(dto.getName() + " is valid");
				System.out.println(dto.getCollegeName() + " is valid");

			} else {
				System.err.println("Name and college name are in-valid");
				return false;
			}

			if (!this.repo.isExist(dto)) {
				this.repo.save(dto);
				System.out.println();
				return true;
			}

		}

		return false;
	}

}
