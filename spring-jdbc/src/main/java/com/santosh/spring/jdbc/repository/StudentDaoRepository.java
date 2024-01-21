package com.santosh.spring.jdbc.repository;

import java.util.List;
import java.util.Map;

import com.santosh.spring.jdbc.dao.StudentDAO;

public interface StudentDaoRepository {

	int insert(StudentDAO dao);

	int update(StudentDAO dao);

	int delete(StudentDAO dao);

	StudentDAO selectById(int studentId);

	List<StudentDAO> selectAll();

	String selectNameById(int studentId);

	List<Map<String, Object>> selectNameCityById(int studentId);

}