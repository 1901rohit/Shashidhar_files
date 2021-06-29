package com.spring;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 public class Main {
 
    public static void main(String a[]){
         
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        EmpDao empDao = (EmpDao) context.getBean("employeeDAO");
        
        Emp emp = empDao.findEmployeeById(1);
        
        System.out.println(emp.getName()+" | "+emp.getSalary()+" | "+emp.getDept());
        
        System.out.println("-----------------------------------------------");
        List<Emp> empList = empDao.findAllEmployees();
        
        for(Emp em:empList){
        	
            System.out.println(em.getName()+" | "+em.getSalary()+" | "+em.getDept());
        }
    }
}