package com.santosh.spring.jdbc.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.santosh.spring.jdbc.dto.StudentDTO;

public class RowMapperImpl implements RowMapper<StudentDTO> {

	@Override
	public StudentDTO mapRow(ResultSet rs, int rowNum) throws SQLException {

		StudentDTO dto = new StudentDTO();
		dto.setId(rs.getInt(1));
		dto.setStudentName(rs.getString(2));
		dto.setCity(rs.getString(3));
		dto.setMobileNo(rs.getLong(4));
		return dto;
	}

}
