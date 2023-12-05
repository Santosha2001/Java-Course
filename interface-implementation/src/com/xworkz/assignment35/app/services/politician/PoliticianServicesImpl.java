package com.xworkz.assignment35.app.services.politician;

import com.xworkz.assignment35.app.repositary.politician.PoliticianRepositary;

public class PoliticianServicesImpl implements PoliticianServices {

	private PoliticianRepositary politicianRepo;

	public PoliticianServicesImpl(PoliticianRepositary politicianRepo) {
		super();
		this.politicianRepo = politicianRepo;
	}

	@Override
	public boolean politicianValidate(String politician) {
		if (politician != null && !politician.isEmpty() && politician.length() > 2) {
			System.out.println("data is valid");
			this.politicianRepo.politician(politician);
		} else {
			System.out.println("data is not valid");
		}
		return false;
	}

}
