package com.members;

public class ClassMembers {

	
	static int count;  //static variable doesn't come under object
	
	long contactNo;
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		System.out.println("count" + ClassMembers.count++);
		
		
		ClassMembers cm1 = new ClassMembers();
		System.out.println(cm1);
		System.out.println(++cm1.contactNo);
		
		ClassMembers cm2 = new ClassMembers();
		System.out.println(cm2);
		
		
		System.out.println(cm2.contactNo);
		
		System.out.println("count" + ClassMembers.count);
		
	}
	}
