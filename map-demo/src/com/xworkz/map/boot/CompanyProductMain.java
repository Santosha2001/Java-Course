package com.xworkz.map.boot;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.xworkz.map.app.dto.CompanyDTO;
import com.xworkz.map.app.dto.ProductDTO;

public class CompanyProductMain {

	public static void main(String[] args) {
		ProductDTO dto1 = new ProductDTO("Bag", 325, 500.0, 1, LocalDate.now());
		ProductDTO dto2 = new ProductDTO("Clothes", 100, 1500.0, 2, LocalDate.now());
		ProductDTO dto3 = new ProductDTO("Mobile", 762, 20000.0, 1, LocalDate.now());

		CompanyDTO companyDTO1 = new CompanyDTO("Flipkart", "Bengalore");
		CompanyDTO companyDTO2 = new CompanyDTO("Amazon", "Bengalore");
		CompanyDTO companyDTO3 = new CompanyDTO("Flipkart", "Mumbai");

		Map<ProductDTO, CompanyDTO> map = new HashMap<ProductDTO, CompanyDTO>();
		map.put(dto1, companyDTO1);
		map.put(dto2, companyDTO3);
		map.put(dto3, companyDTO2);

		System.out.println(map.size());
		Set<ProductDTO> keySets = map.keySet();
		keySets.forEach(a -> System.out.println(a));

		System.out.println("Product names");
		keySets.forEach(a -> System.out.println(a.getProductName()));

		Collection<CompanyDTO> valuesSet = map.values();
		System.out.println("\nCompany name:");
		valuesSet.forEach(a -> System.out.println(a.getCompanyName()));

	}
}
