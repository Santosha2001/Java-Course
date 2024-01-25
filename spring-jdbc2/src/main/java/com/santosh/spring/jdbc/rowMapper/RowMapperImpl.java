package com.santosh.spring.jdbc.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.santosh.spring.jdbc.dto.CollegeDTO;

@Component
public class RowMapperImpl implements RowMapper<CollegeDTO> {

	@Override
	public CollegeDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		CollegeDTO collegeDTO = new CollegeDTO();
		collegeDTO.setId(rs.getInt(1));
		collegeDTO.setCollegeName(rs.getString(2));
		collegeDTO.setCollegeCity(rs.getString(3));
		collegeDTO.setUniversityName(rs.getString(4));
		collegeDTO.setId(rs.getInt(5));
		collegeDTO.setId(rs.getInt(6));
		return collegeDTO;
	}

}
