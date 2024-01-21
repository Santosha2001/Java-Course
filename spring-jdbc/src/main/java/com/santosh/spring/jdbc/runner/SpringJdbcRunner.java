package com.santosh.spring.jdbc.runner;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.santosh.spring.jdbc.dao.StudentDAO;
import com.santosh.spring.jdbc.repository.StudentDaoRepositoryImpl;

public class SpringJdbcRunner {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/santosh/spring/jdbc/configuration/configuration.xml");

		StudentDaoRepositoryImpl bean = context.getBean("studentDao", StudentDaoRepositoryImpl.class);

		// insert
		/*
		 * StudentDAO student = new StudentDAO(5, "Kiran", "Hadagali", 8923674392L);
		 * 
		 * int insert = bean.insert(student); System.out.println(insert);
		 * System.out.println((insert > 0) ? "Inserted." : "Not inserted.");
		 */

		// update
		/*
		 * StudentDAO studentDAO = new StudentDAO(); studentDAO.setCity("Siraguppa");
		 * studentDAO.setStudentName("Basavaraj"); studentDAO.setId(5);
		 * 
		 * int updateQuery = bean.update(studentDAO); System.out.println(updateQuery);
		 * System.out.println((updateQuery > 0) ? "Updated." : "Not updated.");
		 */

		// delete
		StudentDAO dao = new StudentDAO();
		dao.setStudentName("Basavaraj");

		int deleteQuery = bean.delete(dao);
		System.out.println(deleteQuery);
		System.out.println((deleteQuery > 0) ? "Deleted." : "Can't delete");

		// select single row
		StudentDAO dao2 = bean.selectById(1);
		System.out.println(dao2);
		System.out.println("___________________________________________________________");

		// select all rows
		List<StudentDAO> selectAll = bean.selectAll();
		selectAll.forEach(a -> System.out.println(a));
		System.out.println("___________________________________________________________");

		String selectNameCityById = bean.selectNameById(1);
		System.out.println(selectNameCityById);
		System.out.println("***************************************************************");

		List<Map<String, Object>> selectNameCityById2 = bean.selectNameCityById(2);
		System.out.println(selectNameCityById2);

	}
}
