package com.spring;

import java.util.List;

public interface EmpDao {
	 
	    public Emp findEmployeeById(int empId);
	    
	    public List<Emp> findAllEmployees();
	    
	

}
