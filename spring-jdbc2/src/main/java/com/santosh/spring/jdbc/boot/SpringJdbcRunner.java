package com.santosh.spring.jdbc.boot;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.santosh.spring.jdbc.configuration.SpringJdbcConfiguration;
import com.santosh.spring.jdbc.dto.CollegeDTO;
import com.santosh.spring.jdbc.repository.CollegeRepository;

public class SpringJdbcRunner {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				SpringJdbcConfiguration.class);

		CollegeRepository collegeRepository = context.getBean("college", CollegeRepository.class);

		// insert
		CollegeDTO collegeDTO = new CollegeDTO(6, "gfgc", "davanagere", "davanagere", 20, 10000);

		int save = collegeRepository.save(collegeDTO);
		System.out.println(save);
		System.out.println("_____________________________________________________________");

		// update
		CollegeDTO collegeDTO2 = new CollegeDTO();
		collegeDTO2.setNoOfStudents(2200);
		collegeDTO2.setId(1);

		collegeRepository.update(collegeDTO2);
		System.out.println("_____________________________________________________________");

		// delete
		collegeDTO2.setId(2);
		collegeRepository.delete(collegeDTO2);
		System.out.println("_____________________________________________________________");

		// select by id
		CollegeDTO selectById = collegeRepository.selectById(1);
		System.out.println(selectById);
		System.out.println("_____________________________________________________________");

		List<CollegeDTO> selectAll = collegeRepository.selectAll();
		selectAll.forEach(a -> System.out.println(a));

		context.close();
	}
}
