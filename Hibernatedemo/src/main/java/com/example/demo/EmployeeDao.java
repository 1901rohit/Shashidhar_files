package com.example.demo;

import java.util.List;

public interface EmployeeDao {
	
	
    List<?> findEmployees();

    void deleteEmployees(List<?> empList);

    void createEmployee(String Name);

    void saveEmployee(Employee employee);
}
