package com.objects;

public class StudentDetailsMain {

	public static void main(String[] args) {
		
		Student st1 = new Student();
		
		//System.out.println(st1);
		
		st1.setStudentId(100);
		st1.setStudentName("suman");
		st1.setStudentDepartment("IT");
		
		Student st2 = new Student();
		
		//System.out.println(st2);
		
		st2.setStudentId(200);
		st2.setStudentName("charan");
		st2.setStudentDepartment("IT");
			
		System.out.println("Sname\t Sid \t Depatment");
		System.out.println("---------------------");
		
		System.out.println(st1.getStudentName()+"\t"+st1.getStudentId()+"\t"+st1.getStudentDepartment());
		System.out.println(st2.getStudentName()+"\t"+st2.getStudentId()+"\t"+st2.getStudentDepartment());

	}

}
