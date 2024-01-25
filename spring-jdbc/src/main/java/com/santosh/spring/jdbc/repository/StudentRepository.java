package com.santosh.spring.jdbc.repository;

import java.util.List;
import java.util.Map;

import com.santosh.spring.jdbc.dto.StudentDTO;

public interface StudentRepository {

	int insert(StudentDTO dto);

	int update(StudentDTO dto);

	int delete(StudentDTO dto);

	StudentDTO selectById(int studentId);

	List<StudentDTO> selectAll();

	String selectNameById(int studentId);

	List<Map<String, Object>> selectNameCityById(int studentId);

}