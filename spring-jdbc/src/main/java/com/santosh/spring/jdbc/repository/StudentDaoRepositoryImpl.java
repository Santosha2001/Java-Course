package com.santosh.spring.jdbc.repository;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.santosh.spring.jdbc.dao.StudentDAO;
import com.santosh.spring.jdbc.rowmapper.RowMapperImpl;

import lombok.Data;

@Data
public class StudentDaoRepositoryImpl implements StudentDaoRepository {

	private JdbcTemplate jdbcTemplate;

	// insert query
	@Override
	public int insert(StudentDAO dao) {

		String insertQuery = "INSERT INTO student VALUES(?,?,?,?)";
		int update = this.jdbcTemplate.update(insertQuery, dao.getId(), dao.getStudentName(), dao.getCity(),
				dao.getMobileNo());

		return update;
	}

	// update query
	@Override
	public int update(StudentDAO dao) {
		String updateQuery = "UPDATE student SET city=?, studentName=? WHERE id=?";
		int update = this.jdbcTemplate.update(updateQuery, dao.getCity(), dao.getStudentName(), dao.getId());
		return update;
	}

	// delete
	@Override
	public int delete(StudentDAO dao) {
		String deleteQuery = "DELETE FROM student WHERE studentName=?";
		int delete = this.jdbcTemplate.update(deleteQuery, dao.getStudentName());
		return delete;
	}

	// select single student by id.
	@Override
	public StudentDAO selectById(int studentId) {
		String selectSingleStudentById = "select * from student where id=?";

		RowMapper<StudentDAO> rowMapperImpl = new RowMapperImpl();
		StudentDAO dao = this.jdbcTemplate.queryForObject(selectSingleStudentById, rowMapperImpl, studentId);
		return dao;
	}

	//select all rows
	@Override
	public List<StudentDAO> selectAll() {
		String selectAll="select * from student";
		RowMapper<StudentDAO> mapper=new RowMapperImpl();
		List<StudentDAO> selectAllQuery = this.jdbcTemplate.query(selectAll, mapper);
		return selectAllQuery;
	}

	@Override
	public String selectNameById(int studentId) {
		String selectNameCityId="select studentName from student where id=?";
		String queryForList = this.jdbcTemplate.queryForObject(selectNameCityId, new Object[] {studentId},String.class);
		return queryForList;
	}

	@Override
	public List<Map<String, Object>> selectNameCityById(int studentId) {
		String selectNameCityByID="select studentName,city from student where id=?";
		List<Map<String, Object>> queryForList = this.jdbcTemplate.queryForList(selectNameCityByID,new Object[] {studentId});
		
		return queryForList;
	}

}
