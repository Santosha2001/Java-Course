package com.xworkz.assignment35.app.services.curd;

import com.xworkz.assignment35.app.repositary.curd.CurdRepositary;

public class CurdServicesImpl implements CurdServices {

	private CurdRepositary curdRepositary;

	public CurdServicesImpl(CurdRepositary curdRepositary) {
		super();
		this.curdRepositary = curdRepositary;
	}

	@Override
	public boolean curdValidate(String curd) {
		if (curd != null && !curd.isEmpty() && curd.length() > 2) {
			System.out.println("Curd item is valid");
			this.curdRepositary.curd(curd);
		} else {
			System.out.println("Curd item is not valid");
		}
		return false;
	}

}
