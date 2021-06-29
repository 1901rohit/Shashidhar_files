package com.spring;

public class Car {
	Audi b;
	Car(){
		System.out.println("Car class is created");
	}
	
	void print()
	{
		System.out.println("Contents of Car class is printed");
	}
	void display() {
		print();
		b.print();
	}

}
