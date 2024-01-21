package com.santosh.spring.jdbc.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.santosh.spring.jdbc.dao.StudentDAO;

public class RowMapperImpl implements RowMapper<StudentDAO> {

	@Override
	public StudentDAO mapRow(ResultSet rs, int rowNum) throws SQLException {

		StudentDAO dao = new StudentDAO();
		dao.setId(rs.getInt(1));
		dao.setStudentName(rs.getString(2));
		dao.setCity(rs.getString(3));
		dao.setMobileNo(rs.getLong(4));
		return dao;
	}

}
