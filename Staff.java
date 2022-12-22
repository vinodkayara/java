package labexercise;

import java.util.Scanner;

public class Staff {
	//Data members of this class
	//States of this objects or fields or properties or attributes
	//instance variables
	int staffID;
	String name;
	long phone;
	float salary;
	//static variable or class variable
	static int totalStrength;
	
	public void getInvalid() {
		Scanner in=new Scanner(System.in);
		System.out.print("Staff ID:");
		staffID=in.nextInt();
		System.out.print("Phone :");
		phone=in.nextLong();
		System.out.print("Salary:");
		salary = in.nextFloat();
	}
	public void display() {
		System.out.println("StaffID    :" + staffID);
		System.out.println("Staff Name  :" +name);
		System.out.println("Phone Number :"+phone);
		System.out.println("Salary :"+salary);
		
		
		
	
	}

}
