package com.xworkz.springdemo.configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.springdemo.configuration.dto.CompanyDTO;
import com.xworkz.springdemo.configuration.dto.ProductDTO;

@Configuration
@ComponentScan("com.xworkz.springdemo")
public class BeanConfiguration<Mock> {
	public BeanConfiguration() {
		System.out.println("BeanConfiguration created using Configuration..");
	}

	@Bean
	public String str() {
		System.out.println("String class created..");
		return new String();
	}

	@Bean
	public Long number() {
		Long long1 = 7022590205L;
		System.out.println("Mobile number: " + long1);
		return long1;
	}

	@Bean
	public Long[] numbers() {
		Long[] long2 = { 7022590205L, 9019770673L, 8152010705L, 6361207670L, 9986687398L };
		for (Long l : long2) {
			System.out.println(l);
		}
		return long2;
	}

	@Bean
	public String[] emails() {
		System.out.println("****************************");
		String[] emails = { "santosh@gmail.com", "rathod@gamil.com", "amruth@gmail.com", "bindhu@gmail.com",
				"xworkz@gmail.com" };
		for (String mail : emails) {
			System.out.println(mail);
		}
		return emails;
	}

	@Bean
	public String names() {
		System.out.println("****************************");
		String[] names = { "James", "Steffen", "RObert", "Smith", "Carter" };
		for (String name : names) {
			System.out.println(name);
		}
		return new String();
	}

	@Bean
	public String collectionItems() {
		System.out.println("*****************************");
		List<String> list = new ArrayList<String>(Arrays.asList("Laptop", "Mobile", "Charger", "Cable", "Earphones"));
		list.forEach(a -> System.out.println(a));

		return new String();
	}

	@Bean
	public ArrayList<String> itmes() {
		System.out.println("******************************");
		ArrayList<String> arrayList = new ArrayList<String>(
				Arrays.asList("Bengalore", "Mangalore", "Mysore", "Hosapete", "Davanagere"));
		arrayList.forEach(a -> System.out.println(a));

		return new ArrayList<String>();
	}

	@Bean
	public HashMap<String, String> keyValueMapings() {
		System.out.println("*************************");

		ProductDTO dto1 = new ProductDTO("Laptop", 1, "HP");
		ProductDTO dto2 = new ProductDTO("Mobile", 1, "Asus");
		ProductDTO dto3 = new ProductDTO("Clothes", 2, "CK");
		ProductDTO dto4 = new ProductDTO("Shoes", 2, "Puma");
		ProductDTO dto5 = new ProductDTO("Bag", 1, "V-Three");

		CompanyDTO companyDTO1 = new CompanyDTO("Amazon", "Bengalore", "Karnataa");
		CompanyDTO companyDTO2 = new CompanyDTO("Ajio", "Bengalore", "Karnataa");
		CompanyDTO companyDTO3 = new CompanyDTO("Amazon", "Munbai", "Maharastra");
		CompanyDTO companyDTO4 = new CompanyDTO("Flipkart", "Bengalore", "Karnataa");
		CompanyDTO companyDTO5 = new CompanyDTO("Myntra", "Dehli", "Dehli");

		Map<ProductDTO, CompanyDTO> map = new HashMap<ProductDTO, CompanyDTO>();
		map.put(dto5, companyDTO5);
		map.put(dto4, companyDTO3);
		map.put(dto3, companyDTO4);
		map.put(dto2, companyDTO1);
		map.put(dto1, companyDTO2);

		System.out.println("**************keys***************");
		map.keySet().forEach(a -> System.out.println(a.getProductName()));

		System.out.println("*************values**************");
		map.values().forEach(a -> System.out.println(a.getCompanyName()));

		return new HashMap<String, String>();
	}

	@Bean
	public TreeSet<String> treeSet() {
		System.out.println("*****************************");
		TreeSet<String> set = new TreeSet<String>();
		set.add("Lion");
		set.add("TIger");
		set.add("Leopard");
		set.add("Cheeta");
		set.add("Hyna");
		// duplicate values not print
		set.add("Hyna");

		set.forEach(a -> System.out.println(a));

		return new TreeSet<String>();
	}

}
