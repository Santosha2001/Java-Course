package com.xworkz.newspaperdto.app.repository;

import com.xworkz.newspaperdto.app.dto.AadharDTO;

public class AadharRepositoryImpl implements AadharRepository {

	private AadharDTO[] dtos = new AadharDTO[NUMBER];
	private int position;

	@Override
	public void saveAadharInfo(AadharDTO aadharDTO) {

		if (this.position < NUMBER) {
			this.dtos[position] = aadharDTO;
			System.out.println(aadharDTO + " is at index " + position);
			this.position++;
		} else {
			System.err.println("ArrayIndexOutOfBoundException");
		}
	}

}
