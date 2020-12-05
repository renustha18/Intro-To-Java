package com.inheritance;


public class Student extends Person {

	public int studentId; // int variable is public
	public String major;  // String variable is public
	
	public Student() { //default constructor
		
	}
	
	public Student(int studentId, String major, String name, String address, int phoneNumber, String gender) {  //para constructor
		super(name, address, phoneNumber, gender); // we don't have to use setter and getter if we use super constructor
		this.studentId= studentId;
		this.major= major;
//		this.name=name;  				// not needed if used super constructor
//		this.setAddress(address);
//		this.setPhoneNumber(phoneNumber);
	}
	
	public String toString() {
		String result = super.toString();
		return result + "students major is " + this.major + " " + this.studentId + " ";
	}
	
	public static void main(String[] args) {
		System.out.println("Student 1");
		// Calling default constructor
		Student st1 = new Student();
		st1.studentId = 100;
		st1.major = "CS";
		st1.name = "sujan";
		st1.setAddress("Lincoln");
		st1.setPhoneNumber(1);
		st1.setGender("male");
		
		
//		System.out.println(st1.studentId);
//		System.out.println(st1.major);
//		System.out.println(st1.name);
//		System.out.println(st1.getAddress());
//		System.out.println(st1.getPhoneNumber());
//		System.out.println(st1.getGender());
		
		System.out.println("Student 2");
		// Calling parameterized constructor
		Student st2 = new Student(101, "nursing", "renu", "omaha", 123, "female");
		
		System.out.println(st2.toString());
		

	}

}
