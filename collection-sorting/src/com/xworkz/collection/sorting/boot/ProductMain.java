package com.xworkz.collection.sorting.boot;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import com.xworkz.collection.sorting.dto.ProductDTO;

public class ProductMain {
	public static void main(String[] args) {
		List<ProductDTO> dtos = new LinkedList<ProductDTO>();
		dtos.add(new ProductDTO(1, 1, 90, 76, 98, 54, 25, "HP Laptop", "HP India Sales Pvt. Ltd.", "Electronics",
				"HP India Sales Pvt. Ltd.", "Charger", "Laptop", "China", 52230.00, 2530.0, 4.6, 1690.0,
				LocalDate.of(2023, 2, 12), LocalDate.of(2030, 11, 5), LocalDate.of(2023, 11, 23),
				LocalDate.of(2023, 11, 24), LocalDate.of(2023, 12, 2), true, false, true, true, true, 7022590204L,
				"15s-fy5007TU"));

		dtos.add(new ProductDTO(2, 3, 2589, 2543, 1389, 197, 98, "Mobile", "Realme", "Electronics",
				"Realme Mobile Telecommunications India", "Charger", "Smartphone", "India", 7999.0, 1000.0, 3.9, 182.0,
				LocalDate.of(2022, 2, 23), LocalDate.of(2030, 12, 23), LocalDate.of(2023, 12, 2),
				LocalDate.of(2023, 12, 3), LocalDate.of(2022, 2, 23), true, true, true, true, true, 9019770673L,
				"‎RMX3761"));

		dtos.add(new ProductDTO(5, 1, 3983, 1265, 3984, 235, 294, "Mobile", "MI", "Electronics",
				"Xiomi Mobile Telecommunications India", "Charger", "Smartphone", "India", 12999.0, 1300.0, 4.3, 192.0,
				LocalDate.of(2021, 12, 23), LocalDate.of(2021, 12, 23), LocalDate.of(2021, 12, 26),
				LocalDate.of(2021, 12, 29), LocalDate.of(2021, 12, 31), false, false, true, true, true, 8152010705L,
				"‎B0C45N5VPT"));

		dtos.add(new ProductDTO(8, 5, 2783, 2893, 1283, 2433, 183, "Men Shirts", "U.S.POLO", "Clothes",
				"MULTI CLOTHINGS", "Shirt", "SHIRTS", "India", 1499.0, 240.0, 4.7, 350.0, LocalDate.of(2023, 5, 3),
				LocalDate.of(2023, 5, 8), LocalDate.of(2023, 5, 26), LocalDate.of(2023, 5, 29),
				LocalDate.of(2023, 5, 29), true, true, false, false, true, 8152018705L, "‎MULTI CLOTHINGS"));

		dtos.add(new ProductDTO(1, 1, 3878, 2874, 3847, 193, 24, "BackPack", "Arctic Fox", "BackPack", "BackPack",
				"Bag", "Anti-Theft Laptop Backpack", "India", 799.00, 110.0, 4.0, 172.0, LocalDate.of(2022, 5, 12),
				LocalDate.of(2030, 1, 3), LocalDate.of(2022, 6, 3), LocalDate.of(2022, 6, 4), LocalDate.of(2022, 6, 12),
				true, true, true, false, false, 7982590204L, "AT90TD78"));

		Comparator<ProductDTO> proId = (a, b) -> a.getId().compareTo(b.getId());
		dtos.stream().sorted(proId).forEach(a -> System.out.println(a));
		System.out.println();

		Comparator<ProductDTO> proQuantity = (a, b) -> a.getQuantity().compareTo(b.getQuantity());
		dtos.stream().sorted(proQuantity).forEach(a -> System.out.println(a));
		System.out.println();

		Comparator<ProductDTO> proFiveRate = (a, b) -> a.getPeopleRatedFive().compareTo(b.getPeopleRatedFive());
		dtos.stream().sorted(proFiveRate).forEach(a -> System.out.println(a));
		System.out.println();

		Comparator<ProductDTO> proFourRate = (a, b) -> a.getPeopleRatedFour().compareTo(b.getPeopleRatedFour());
		dtos.stream().sorted(proFourRate).forEach(a -> System.out.println(a));
		System.out.println();

		Comparator<ProductDTO> proThreeRate = (a, b) -> a.getPeopleRatedThree().compareTo(b.getPeopleRatedThree());
		dtos.stream().sorted(proThreeRate).forEach(a -> System.out.println(a));
		System.out.println();

		Comparator<ProductDTO> proTowRate = (a, b) -> a.getPeopleRatedTwo().compareTo(b.getPeopleRatedTwo());
		dtos.stream().sorted(proTowRate).forEach(a -> System.out.println(a));
		System.out.println();

		Comparator<ProductDTO> proOneRate = (a, b) -> a.getPeopleRatedOne().compareTo(b.getPeopleRatedOne());
		dtos.stream().sorted(proOneRate).forEach(a -> System.out.println(a));
		System.out.println();

		Comparator<ProductDTO> proName = (a, b) -> a.getName().compareTo(b.getName());
		dtos.stream().sorted(proName).forEach(a -> System.out.println(a));

		Comparator<ProductDTO> proCompany = (a, b) -> a.getCompany().compareTo(b.getCompany());
		dtos.stream().sorted(proCompany).forEach(a -> System.out.println(a));

		Comparator<ProductDTO> proDiscr = (a, b) -> a.getDiscription().compareTo(b.getDiscription());
		dtos.stream().sorted(proDiscr).forEach(a -> System.out.println(a));

		Comparator<ProductDTO> proPacker = (a, b) -> a.getPacker().compareTo(b.getPacker());
		dtos.stream().sorted(proPacker).forEach(a -> System.out.println(a));

		Comparator<ProductDTO> proIncluded = (a, b) -> a.getIncluded().compareTo(b.getIncluded());
		dtos.stream().sorted(proIncluded).forEach(a -> System.out.println(a));

		Comparator<ProductDTO> proGeneric = (a, b) -> a.getGenericName().compareTo(b.getGenericName());
		dtos.stream().sorted(proGeneric).forEach(a -> System.out.println(a));

		Comparator<ProductDTO> proCouOrigin = (a, b) -> a.getCountryOfOrigin().compareTo(b.getCountryOfOrigin());
		dtos.stream().sorted(proCouOrigin).forEach(a -> System.out.println(a));

		Comparator<ProductDTO> proPrice = (a, b) -> a.getPrice().compareTo(b.getPrice());
		dtos.stream().sorted(proPrice).forEach(a -> System.out.println(a));

		Comparator<ProductDTO> proDiscount = (a, b) -> a.getDiscount().compareTo(b.getDiscount());
		dtos.stream().sorted(proDiscount).forEach(a -> System.out.println(a));

		Comparator<ProductDTO> proRating = (a, b) -> a.getRating().compareTo(b.getRating());
		dtos.stream().sorted(proRating).forEach(a -> System.out.println(a));

		Comparator<ProductDTO> proWeight = (a, b) -> a.getItemWeight().compareTo(b.getItemWeight());
		dtos.stream().sorted(proWeight).forEach(a -> System.out.println(a));

		Comparator<ProductDTO> proManuDate = (a, b) -> a.getManfDate().compareTo(b.getManfDate());
		dtos.stream().sorted(proManuDate).forEach(a -> System.out.println(a));

		Comparator<ProductDTO> proExDate = (a, b) -> a.getExpDate().compareTo(b.getExpDate());
		dtos.stream().sorted(proExDate).forEach(a -> System.out.println(a));

		Comparator<ProductDTO> proAvaiDate = (a, b) -> a.getAvailableDate().compareTo(b.getAvailableDate());
		dtos.stream().sorted(proAvaiDate).forEach(a -> System.out.println(a));

		Comparator<ProductDTO> proDelExpe = (a, b) -> a.getDelivaryExceptedDate()
				.compareTo(b.getDelivaryExceptedDate());
		dtos.stream().sorted(proDelExpe).forEach(a -> System.out.println(a));

		Comparator<ProductDTO> proRetunDate = (a, b) -> a.getReturnByDate().compareTo(b.getReturnByDate());
		dtos.stream().sorted(proRetunDate).forEach(a -> System.out.println(a));

		Comparator<ProductDTO> proPeoRated = (a, b) -> a.getPeopeRated().compareTo(b.getPeopeRated());
		dtos.stream().sorted(proPeoRated).forEach(a -> System.out.println(a));

		Comparator<ProductDTO> proDamged = (a, b) -> a.getDamaged().compareTo(b.getDamaged());
		dtos.stream().sorted(proDamged).forEach(a -> System.out.println(a));

		Comparator<ProductDTO> proRetunable = (a, b) -> a.getReturnable().compareTo(b.getReturnable());
		dtos.stream().sorted(proRetunable).forEach(a -> System.out.println(a));

		Comparator<ProductDTO> proWarre = (a, b) -> a.getWarrenty().compareTo(b.getWarrenty());
		dtos.stream().sorted(proWarre).forEach(a -> System.out.println(a));

		Comparator<ProductDTO> proPriDeli = (a, b) -> a.getPrimeDelivary().compareTo(b.getPrimeDelivary());
		dtos.stream().sorted(proPriDeli).forEach(a -> System.out.println(a));

		Comparator<ProductDTO> proMobile = (a, b) -> a.getMobileNumber().compareTo(b.getMobileNumber());
		dtos.stream().sorted(proMobile).forEach(a -> System.out.println(a));

		Comparator<ProductDTO> proSerialNo = (a, b) -> a.getSerialNumber().compareTo(b.getSerialNumber());
		dtos.stream().sorted(proSerialNo).forEach(a -> System.out.println(a));

		Comparator<ProductDTO> proIdDesc = (a, b) -> b.getId().compareTo(a.getId());
		dtos.stream().sorted(proIdDesc).forEach(a -> System.out.println(a));
		System.out.println();

		Comparator<ProductDTO> proQuantityDesc = (a, b) -> b.getQuantity().compareTo(a.getQuantity());
		dtos.stream().sorted(proQuantityDesc).forEach(a -> System.out.println(a));
		System.out.println();

		Comparator<ProductDTO> proFiveRateDesc = (a, b) -> b.getPeopleRatedFive().compareTo(a.getPeopleRatedFive());
		dtos.stream().sorted(proFiveRateDesc).forEach(a -> System.out.println(a));
		System.out.println();

		Comparator<ProductDTO> proFourRateDesc = (a, b) -> b.getPeopleRatedFour().compareTo(a.getPeopleRatedFour());
		dtos.stream().sorted(proFourRateDesc).forEach(a -> System.out.println(a));
		System.out.println();

		Comparator<ProductDTO> proThreeRateDesc = (a, b) -> b.getPeopleRatedThree().compareTo(a.getPeopleRatedThree());
		dtos.stream().sorted(proThreeRateDesc).forEach(a -> System.out.println(a));
		System.out.println();

		Comparator<ProductDTO> proTowRateDesc = (a, b) -> b.getPeopleRatedTwo().compareTo(a.getPeopleRatedTwo());
		dtos.stream().sorted(proTowRateDesc).forEach(a -> System.out.println(a));
		System.out.println();

		Comparator<ProductDTO> proOneRateDesc = (a, b) -> b.getPeopleRatedOne().compareTo(a.getPeopleRatedOne());
		dtos.stream().sorted(proOneRateDesc).forEach(a -> System.out.println(a));
		System.out.println();

		Comparator<ProductDTO> proNameDesc = (a, b) -> b.getName().compareTo(a.getName());
		dtos.stream().sorted(proNameDesc).forEach(a -> System.out.println(a));

		Comparator<ProductDTO> proCompanyDesc = (a, b) -> b.getCompany().compareTo(a.getCompany());
		dtos.stream().sorted(proCompanyDesc).forEach(a -> System.out.println(a));

		Comparator<ProductDTO> proDiscrDesc = (a, b) -> b.getDiscription().compareTo(a.getDiscription());
		dtos.stream().sorted(proDiscrDesc).forEach(a -> System.out.println(a));

		Comparator<ProductDTO> proPackerDesc = (a, b) -> b.getPacker().compareTo(a.getPacker());
		dtos.stream().sorted(proPackerDesc).forEach(a -> System.out.println(a));

		Comparator<ProductDTO> proIncludedDesc = (a, b) -> b.getIncluded().compareTo(a.getIncluded());
		dtos.stream().sorted(proIncludedDesc).forEach(a -> System.out.println(a));

		Comparator<ProductDTO> proGenericDesc = (a, b) -> b.getGenericName().compareTo(a.getGenericName());
		dtos.stream().sorted(proGenericDesc).forEach(a -> System.out.println(a));

		Comparator<ProductDTO> proCouOriginDesc = (a, b) -> b.getCountryOfOrigin().compareTo(a.getCountryOfOrigin());
		dtos.stream().sorted(proCouOriginDesc).forEach(a -> System.out.println(a));

		Comparator<ProductDTO> proPriceDesc = (a, b) -> b.getPrice().compareTo(a.getPrice());
		dtos.stream().sorted(proPriceDesc).forEach(a -> System.out.println(a));

		Comparator<ProductDTO> proDiscountDesc = (a, b) -> b.getDiscount().compareTo(a.getDiscount());
		dtos.stream().sorted(proDiscountDesc).forEach(a -> System.out.println(a));

		Comparator<ProductDTO> proRatingDesc = (a, b) -> b.getRating().compareTo(a.getRating());
		dtos.stream().sorted(proRatingDesc).forEach(a -> System.out.println(a));

		Comparator<ProductDTO> proWeightDesc = (a, b) -> b.getItemWeight().compareTo(a.getItemWeight());
		dtos.stream().sorted(proWeightDesc).forEach(a -> System.out.println(a));

		Comparator<ProductDTO> proManuDateDesc = (a, b) -> b.getManfDate().compareTo(a.getManfDate());
		dtos.stream().sorted(proManuDateDesc).forEach(a -> System.out.println(a));

		Comparator<ProductDTO> proExDateDesc = (a, b) -> b.getExpDate().compareTo(a.getExpDate());
		dtos.stream().sorted(proExDateDesc).forEach(a -> System.out.println(a));

		Comparator<ProductDTO> proAvaiDateDesc = (a, b) -> b.getAvailableDate().compareTo(a.getAvailableDate());
		dtos.stream().sorted(proAvaiDateDesc).forEach(a -> System.out.println(a));

		Comparator<ProductDTO> proDelExpeDesc = (a, b) -> b.getDelivaryExceptedDate()
				.compareTo(a.getDelivaryExceptedDate());
		dtos.stream().sorted(proDelExpeDesc).forEach(a -> System.out.println(a));

		Comparator<ProductDTO> proRetunDateDesc = (a, b) -> b.getReturnByDate().compareTo(a.getReturnByDate());
		dtos.stream().sorted(proRetunDateDesc).forEach(a -> System.out.println(a));

		Comparator<ProductDTO> proPeoRatedDesc = (a, b) -> b.getPeopeRated().compareTo(a.getPeopeRated());
		dtos.stream().sorted(proPeoRatedDesc).forEach(a -> System.out.println(a));

		Comparator<ProductDTO> proDamgedDesc = (a, b) -> b.getDamaged().compareTo(a.getDamaged());
		dtos.stream().sorted(proDamgedDesc).forEach(a -> System.out.println(a));

		Comparator<ProductDTO> proRetunableDesc = (a, b) -> b.getReturnable().compareTo(a.getReturnable());
		dtos.stream().sorted(proRetunableDesc).forEach(a -> System.out.println(a));

		Comparator<ProductDTO> proWarreDesc = (a, b) -> b.getWarrenty().compareTo(a.getWarrenty());
		dtos.stream().sorted(proWarreDesc).forEach(a -> System.out.println(a));

		Comparator<ProductDTO> proPriDeliDesc = (a, b) -> b.getPrimeDelivary().compareTo(a.getPrimeDelivary());
		dtos.stream().sorted(proPriDeliDesc).forEach(a -> System.out.println(a));

		Comparator<ProductDTO> proMobileDesc = (a, b) -> b.getMobileNumber().compareTo(a.getMobileNumber());
		dtos.stream().sorted(proMobileDesc).forEach(a -> System.out.println(a));

		Comparator<ProductDTO> proSerialNoDesc = (a, b) -> b.getSerialNumber().compareTo(a.getSerialNumber());
		dtos.stream().sorted(proSerialNoDesc).forEach(a -> System.out.println(a));

		// 3 properties in ascending order
		dtos.stream().sorted(proId.thenComparing(proQuantity).thenComparing(proRating)).collect(Collectors.toList())
				.forEach(a -> System.out.println(a));
		System.out.println();

		dtos.stream().sorted(proFiveRate.thenComparing(proFourRate).thenComparing(proThreeRate))
				.collect(Collectors.toList()).forEach(a -> System.out.println(a));
		System.out.println();

		dtos.stream().sorted(proFiveRate.thenComparing(proFourRate).thenComparing(proOneRate))
				.collect(Collectors.toList()).forEach(a -> System.out.println(a));
		System.out.println();

		dtos.stream().sorted(proThreeRate.thenComparing(proFourRate).thenComparing(proTowRate))
				.collect(Collectors.toList()).forEach(a -> System.out.println(a));
		System.out.println();

		dtos.stream().sorted(proName.thenComparing(proCompany).thenComparing(proCouOrigin)).collect(Collectors.toList())
				.forEach(a -> System.out.println(a));
		System.out.println();

		dtos.stream().sorted(proDiscr.thenComparing(proQuantity).thenComparing(proName)).collect(Collectors.toList())
				.forEach(a -> System.out.println(a));
		System.out.println();

		dtos.stream().sorted(proManuDate.thenComparing(proExDate).thenComparing(proAvaiDate))
				.collect(Collectors.toList()).forEach(a -> System.out.println(a));
		System.out.println();

		dtos.stream().sorted(proRetunable.thenComparing(proDamged).thenComparing(proWarre)).collect(Collectors.toList())
				.forEach(a -> System.out.println(a));
		System.out.println();

		dtos.stream().sorted(proPeoRated.thenComparing(proSerialNo).thenComparing(proManuDate))
				.collect(Collectors.toList()).forEach(a -> System.out.println(a));
		System.out.println();

		dtos.stream().sorted(proName.thenComparing(proDiscount).thenComparing(proPrice)).collect(Collectors.toList())
				.forEach(a -> System.out.println(a));
		System.out.println();

		// descending order
		dtos.stream().sorted(proNameDesc.thenComparing(proDiscountDesc)).collect(Collectors.toList())
				.forEach(a -> System.err.println(a));
		System.out.println();

		dtos.stream().sorted(proPriceDesc.thenComparing(proDiscountDesc)).collect(Collectors.toList())
				.forEach(a -> System.err.println(a));
		System.out.println();

		dtos.stream().sorted(proFiveRate.thenComparing(proRatingDesc)).collect(Collectors.toList())
				.forEach(a -> System.err.println(a));
		System.out.println();

		dtos.stream().sorted(proExDateDesc.thenComparing(proManuDateDesc)).collect(Collectors.toList())
				.forEach(a -> System.err.println(a));
		System.out.println();

		dtos.stream().sorted(proNameDesc.thenComparing(proDiscountDesc)).collect(Collectors.toList())
				.forEach(a -> System.err.println(a));
		System.out.println();

		dtos.stream().sorted(proAvaiDateDesc.thenComparing(proRetunableDesc)).collect(Collectors.toList())
				.forEach(a -> System.err.println(a));
		System.out.println();

		dtos.stream().sorted(proRetunableDesc.thenComparing(proWarreDesc)).collect(Collectors.toList())
				.forEach(a -> System.err.println(a));
		System.out.println();

		dtos.stream().sorted(proDamgedDesc.thenComparing(proRetunableDesc)).collect(Collectors.toList())
				.forEach(a -> System.err.println(a));
		System.out.println();

		dtos.stream().sorted(proFourRateDesc.thenComparing(proOneRateDesc)).collect(Collectors.toList())
				.forEach(a -> System.err.println(a));
		System.out.println();

		dtos.stream().sorted(proNameDesc.thenComparing(proCompanyDesc)).collect(Collectors.toList())
				.forEach(a -> System.err.println(a));
		System.out.println();

		List<String> list = new LinkedList<String>();
		dtos.stream().sorted(proNameDesc.thenComparing(proCompanyDesc))
				.forEach(a -> list.add(a.getName() + ", " + a.getDiscription()));
		list.forEach(a -> System.out.println(a));
	}
}
