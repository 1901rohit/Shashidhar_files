package com.spring;

public class Studentclass {
	private String studentname;
	private int studentid;
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public void display()
	{
		System.out.println("Student details are: ");
		System.out.println(studentname+"\n"+studentid);
	}
}
