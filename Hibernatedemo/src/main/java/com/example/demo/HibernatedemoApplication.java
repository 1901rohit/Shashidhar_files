package com.example.demo;
import java.io.IOException;
import java.util.List;

import org.hibernate.MappingException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;


public class HibernatedemoApplication {


		private EmployeeDao empDao;
		   
	    public static void main(String[] args) throws MappingException, IOException {
	        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	        HibernateDaoMainClass hibernateDao = (HibernateDaoMainClass) context.getBean("hibernateDaoExample");
	       
	        hibernateDao.execute();
	    }
	        
	    @Transactional(readOnly=false)
	    public void execute() {
	        List<?> empList = empDao.findEmployees();
	      
	        empDao.deleteEmployees(empList);
	        empDao.createEmployee("mike"); 
	        
	        Employee empShashi = new Employee();
	        
	        empSam.setName("Shashi"); 
	        empDao.saveEmployee(empshashi);
	        System.out.println("List of employees: " + empDao.findEmployees()); 
	    }

	    public void setEmployeeDao(EmployeeDao empDao) {
	        this.empDao = empDao;
	    }     
	    
	}

}
