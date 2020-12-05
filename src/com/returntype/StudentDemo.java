package com.returntype;

public class StudentDemo {

	public static void main(String[] args) {
		
		
		Student st1 = new Student();
		st1.name = "Renu";
		st1.age= 28;
		
		String result = st1.getStudentInfo();
		System.out.println(result);
//		System.out.println(st1.getStudentInfo());
		
		st1.printStudentInfo();
		
		int result1 = st1.calculateMonths();
		System.out.println("student is " + result1 + " months old");
		
		System.out.println("before: " + st1.months);
		st1.months = 300;
		System.out.println("after: " + st1.months);
		
		// Standalone methods
		st1.calculateDays();
		
		
	}
}

