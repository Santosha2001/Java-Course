package com.xworkz.collection.boot;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.collection.app.dto.ApplicationDTO;

public class ApplicationMain {

	public static void main(String[] args) {
		ApplicationDTO applicationDTO = new ApplicationDTO();

		ApplicationDTO applicationDTO2 = new ApplicationDTO("WhtasApp", "12.3", "Meta", LocalDate.of(2000, 2, 12), 4.7);
		ApplicationDTO applicationDTO3 = new ApplicationDTO("Instagram", "43.2", "Meta", LocalDate.of(2001, 4, 22),
				4.1);
		ApplicationDTO applicationDTO4 = new ApplicationDTO("Facebook", "12.3", "Meta", LocalDate.of(2005, 2, 12), 4.4);
		ApplicationDTO applicationDTO5 = new ApplicationDTO("Twitter", "12.3", "Tesla", LocalDate.of(2010, 5, 12), 4.2);
		ApplicationDTO applicationDTO6 = new ApplicationDTO("Google", "13.3", "Google", LocalDate.of(2000, 12, 12),
				4.9);

		Collection<ApplicationDTO> applicationDTOs = new ArrayList<ApplicationDTO>();
		applicationDTOs.add(applicationDTO2);
		applicationDTOs.add(applicationDTO3);
		applicationDTOs.add(applicationDTO4);
		applicationDTOs.add(applicationDTO5);
		applicationDTOs.add(applicationDTO6);

		Iterator<ApplicationDTO> iterator = applicationDTOs.iterator();
		while (iterator.hasNext()) {
			ApplicationDTO applicationDTO7 = (ApplicationDTO) iterator.next();
			System.out.println(applicationDTO7.getName());
		}
		
//		for (ApplicationDTO applicationDTO7 : applicationDTOs) {
//			System.out.println(applicationDTO7);
//		}
		
//		for (Iterator iterator = applicationDTOs.iterator(); iterator.hasNext();) {
//			ApplicationDTO applicationDTO8 = (ApplicationDTO) iterator.next();
//			System.out.println(applicationDTO8);
//		}

	}
}
