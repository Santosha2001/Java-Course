package com.santosh.spring.jdbc.repository;

import java.util.List;

import com.santosh.spring.jdbc.dto.CollegeDTO;

public interface CollegeRepository {

	int save(CollegeDTO collegeDTO);

	void update(CollegeDTO collegeDTO);

	void delete(CollegeDTO collegeDTO);

	CollegeDTO selectById(int collegeId);

	List<CollegeDTO> selectAll();
}