package com.xworkz.newspaperdto.app.service;

import com.xworkz.newspaperdto.app.dto.AadharDTO;
import com.xworkz.newspaperdto.app.repository.AadharRepository;

public class AadharServiceImpl implements AadharService {

	private AadharRepository aadharRepository;

	public AadharServiceImpl(AadharRepository aadharRepository) {
		super();
		this.aadharRepository = aadharRepository;
	}

	@Override
	public boolean aadharValidate(AadharDTO aadharDTO) {
		if (aadharDTO != null) {
			long number = aadharDTO.getNumber();
			String holderName = aadharDTO.getHolderName();
			String addrs = aadharDTO.getAddrs();

			if (number >= 10000000000L && number <= 999999999999L) {
				System.out.println(aadharDTO.getNumber() + " is valid");
			} else {
				System.err.println("Number is not valid");
				return false;
			}

			if (holderName != null && !holderName.isEmpty() && holderName.length() > 2 && holderName.length() <= 20
					&& addrs != null && !addrs.isEmpty() && addrs.length() > 2 && addrs.length() <= 30) {
				System.out.println(aadharDTO.getHolderName() + " is valid");
				System.out.println(aadharDTO.getAddrs() + " is valid");
			} else {
				System.err.println("Holder name and Address is not valid");
			}

			this.aadharRepository.saveAadharInfo(aadharDTO);
			System.out.println("Aadhar is not null");
			System.out.println();
		}
		return false;
	}

}
