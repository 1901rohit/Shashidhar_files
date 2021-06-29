package com.spring;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCDaoImp implements StudentDAO {
	
	@Autowired
	private DataSource datasource;
	JdbcTemplate jdbcTemplateObject = new JdbcTemplate();



	public void setDatasource(DataSource d) {

		this.datasource = d;
		this.jdbcTemplateObject = new JdbcTemplate(datasource);
		
	}
	
	public JdbcTemplate getJdbcTemplateObject() {
		return jdbcTemplateObject;
	}


	public void setJdbcTemplateObject(JdbcTemplate jdbcTemplateObject) {
		this.jdbcTemplateObject = jdbcTemplateObject;
	}


	public DataSource getDatasource() {
		return datasource;
	}
	
// user defined method
	public List<Student> listStudent() {
		
		String sql="select * from test";
		jdbcTemplateObject.setDataSource(getDatasource());
		List<Student> student = jdbcTemplateObject.query(sql, new StudentJDBCRowMapper());
	
		return student;
	}

	public void create(int id ,String name, String age) {
		
		String sql ="insert into Student(id,name,age) values(?,?,?)";
		jdbcTemplateObject.update(sql,id,name,age);
		return;
		
	}






}
