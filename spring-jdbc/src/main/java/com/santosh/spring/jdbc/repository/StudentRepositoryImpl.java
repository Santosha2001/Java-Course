package com.santosh.spring.jdbc.repository;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.santosh.spring.jdbc.dto.StudentDTO;
import com.santosh.spring.jdbc.rowmapper.RowMapperImpl;

import lombok.Data;

@Data
public class StudentRepositoryImpl implements StudentRepository {

	private JdbcTemplate jdbcTemplate;

	// insert query
	@Override
	public int insert(StudentDTO dto) {

		String insertQuery = "INSERT INTO student VALUES(?,?,?,?)";
		int update = this.jdbcTemplate.update(insertQuery, dto.getId(), dto.getStudentName(), dto.getCity(),
				dto.getMobileNo());

		return update;
	}

	// update query
	@Override
	public int update(StudentDTO dto) {
		String updateQuery = "UPDATE student SET city=?, studentName=? WHERE id=?";
		int update = this.jdbcTemplate.update(updateQuery, dto.getCity(), dto.getStudentName(), dto.getId());
		return update;
	}

	// delete
	@Override
	public int delete(StudentDTO dao) {
		String deleteQuery = "DELETE FROM student WHERE studentName=?";
		int delete = this.jdbcTemplate.update(deleteQuery, dao.getStudentName());
		return delete;
	}

	// select single student by id.
	@Override
	public StudentDTO selectById(int studentId) {
		String selectSingleStudentById = "select * from student where id=?";

		RowMapper<StudentDTO> rowMapperImpl = new RowMapperImpl();
		StudentDTO dto = this.jdbcTemplate.queryForObject(selectSingleStudentById, rowMapperImpl, studentId);
		return dto;
	}

	// select all rows
	@Override
	public List<StudentDTO> selectAll() {
		String selectAll = "select * from student";
		RowMapper<StudentDTO> mapper = new RowMapperImpl();
		List<StudentDTO> selectAllQuery = this.jdbcTemplate.query(selectAll, mapper);
		return selectAllQuery;
	}

	@Override
	public String selectNameById(int studentId) {
		String selectNameCityId = "select studentName from student where id=?";
		String queryForList = this.jdbcTemplate.queryForObject(selectNameCityId, new Object[] { studentId },
				String.class);
		return queryForList;
	}

	@Override
	public List<Map<String, Object>> selectNameCityById(int studentId) {
		String selectNameCityByID = "select studentName,city from student where id=?";
		List<Map<String, Object>> queryForList = this.jdbcTemplate.queryForList(selectNameCityByID,
				new Object[] { studentId });

		return queryForList;
	}

}
