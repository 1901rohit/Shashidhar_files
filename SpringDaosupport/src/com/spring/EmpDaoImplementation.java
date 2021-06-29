package com.spring;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class EmpDaoImplementation extends JdbcDaoSupport implements EmpDao {
@Autowired
private DataSource datasource;
JdbcTemplate jdbctemplate=new JdbcTemplate();
	public DataSource getDatasource() {
	return datasource;
}

public void setDatasource(DataSource datasource) {
	this.datasource = datasource;
}

public JdbcTemplate getJdbctemplate() {
	return jdbctemplate;
}

public void setJdbctemplate(JdbcTemplate jdbctemplate) {
	this.jdbctemplate = jdbctemplate;
}

	@Override
	public Emp findEmployeeById(int empId) {

		Emp emp = null;
		String query = "select * from employee where empId=?";
		Object[] inputs = new Object[] { empId };
		emp = (Emp) getJdbcTemplate().queryForObject(query, inputs, new BeanPropertyRowMapper(Emp.class));
		return emp;
	}

	@Override
	public List<Emp> findAllEmployees() {

		List<Emp> empList = new ArrayList<Emp>();
		String query = "select * from employee";
		empList = getJdbcTemplate().query(query, new BeanPropertyRowMapper(Emp.class));
		return empList;
	}
}