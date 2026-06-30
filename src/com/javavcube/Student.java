package com.javavcube;

public class Student {
	String StudentName;
	int rollno;
		static int age=20;
	static String address="hyderabad";
	//System.out.println("welcome");

	public static void main(String[] args) {
		
		Student std1= new Student();
		std1.StudentName="nithin";
		std1.rollno=34;
		System.out.println("studentname: "+ std1.StudentName);
		System.out.println("student Rollno:"+std1.rollno);
		System.out.println("student Age:"+age);
		System.out.println("student Address:    "+address);
		
		System.out.println("object2 creation");
		Student std2= new Student();
		std2.StudentName="hemanth";
		std2.rollno=35;
		System.out.println("studentname: "+ std2.StudentName);
		System.out.println("student Rollno:"+std2.rollno);
		System.out.println("student Age;"+age);
		System.out.println("student Add:ess:    "+address);
		
		age=20;
		address="nizamabad";
		System.out.println("object3 creation");
		Student std3= new Student();
		std3.StudentName="vijay";
		std3.rollno=36;
		System.out.println("studentname: "+ std3.StudentName);
		System.out.println("student Rollno:"+std3.rollno);
		System.out.println("student Age:"+age);
		System.out.println("student Address:    "+address);
		
		
		
		
		
		

	}

}
