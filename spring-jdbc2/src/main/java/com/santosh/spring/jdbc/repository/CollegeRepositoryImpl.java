package com.santosh.spring.jdbc.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.santosh.spring.jdbc.dto.CollegeDTO;
import com.santosh.spring.jdbc.rowMapper.RowMapperImpl;

@Component("college")
public class CollegeRepositoryImpl implements CollegeRepository {

	@Autowired
	private RowMapperImpl rowMapper;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int save(CollegeDTO collegeDTO) {

		String query = "insert into college values(?,?,?,?,?,?)";
		int update = this.jdbcTemplate.update(query, collegeDTO.getId(), collegeDTO.getCollegeName(),
				collegeDTO.getCollegeCity(), collegeDTO.getUniversityName(), collegeDTO.getNoOfColleges(),
				collegeDTO.getNoOfStudents());
		System.out.println("Inserted.");
		return update;

	}

	@Override
	public void update(CollegeDTO collegeDTO) {
		String update = "update college set noOfStudents=? where id=?";
		this.jdbcTemplate.update(update, collegeDTO.getNoOfStudents(), collegeDTO.getId());
		System.out.println("Updated.");
	}

	@Override
	public void delete(CollegeDTO collegeDTO) {
		String delete = "delete from college where id=?";
		this.jdbcTemplate.update(delete, collegeDTO.getId());
		System.out.println("Deleted.");
	}

	@Override
	public CollegeDTO selectById(int collegeId) {
		String selectByID = "select * from college where id=?";
		CollegeDTO collegeDTO = this.jdbcTemplate.queryForObject(selectByID, rowMapper, collegeId);
		System.out.println(collegeDTO);
		return collegeDTO;
	}

	@Override
	public List<CollegeDTO> selectAll() {
		String selectAll = "select * from college";
		List<CollegeDTO> query = this.jdbcTemplate.query(selectAll, rowMapper);
		System.out.println("All rows.");
		return query;
	}
}
