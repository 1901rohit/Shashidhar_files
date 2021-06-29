package com.spring;

public class Audi{
	Audi b;
	public Audi(){
		System.out.println("Audi model of Car class is created");
		
	}
	
	public Audi getB() {
		return b;
	}

	public void setB(Audi b) {
		this.b =b;
	}

	public void print()
	{
		System.out.println("prints the model of Audi Car");
	}

}
