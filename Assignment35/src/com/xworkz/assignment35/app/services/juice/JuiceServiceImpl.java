package com.xworkz.assignment35.app.services.juice;

import com.xworkz.assignment35.app.repositary.juice.JuiceRepositary;

public class JuiceServiceImpl implements JuiceService {

	JuiceRepositary juiceRepositary;

	public JuiceServiceImpl(JuiceRepositary juiceRepositary) {
		super();
		this.juiceRepositary = juiceRepositary;
	}

	@Override
	public boolean saveAndStore(String juice) {
		if (juice != null && !juice.isEmpty() && juice.length() > 2 && juice.length() <= 20) {

			if (!this.juiceRepositary.isExist(juice)) {
				this.juiceRepositary.store(juice);
				System.out.println("data is valid");
				return true;
			} else {
				System.err.println("juice already exists..");
			}

		} else {
			System.err.println("data invalid");
		}
		return false;
	}

}
