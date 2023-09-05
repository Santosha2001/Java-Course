package com.xworkz.assignment35.app.services.jacket;

import com.xworkz.assignment35.app.repositary.jacket.JacketRepositary;

public class JacketServicesImpl implements JacketServices {

	private JacketRepositary jacketRepo;

	public JacketServicesImpl(JacketRepositary jacketRepo) {
		super();
		this.jacketRepo = jacketRepo;
	}

	@Override
	public boolean jacketValidate(String jacket) {
		if (jacket != null && !jacket.isEmpty() && jacket.length() > 2) {
			System.out.println("jacket is valid");
			this.jacketRepo.jackets(jacket);
		} else {
			System.out.println("data is not valid");
		}
		return false;
	}

}
