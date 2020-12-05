package com.objects;

public class Student {
	
		private int studentId;
		private String studentName;
		private String studentDepartment;
		private String lastName;
		public int rollNum; 
	
		public void setlastName(String lastName) {
			this.lastName = lastName; 
		}
		
		public String getlastName() {
			return lastName; 
		}
		
		public int getStudentId() {
			return studentId;
		}
		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}
		public String getStudentName() {
			return studentName;
		}
		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}
		public String getStudentDepartment() {
			return studentDepartment;
		}
		public void setStudentDepartment(String studentDepartment) {
			this.studentDepartment = studentDepartment;
			
		}
//		@Override
//		public String toString() {
//			return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentDepartment="
//					+ studentDepartment + "]";
//		}
		
		public static class Students {
			public static void main(String[] args) {
				Student st1 = new Student();
				st1.setStudentId(1);	
				st1.setStudentName("sujan");
				st1.setlastName("shrestha");
				st1.setStudentDepartment("IT");
		
			
				
				System.out.println(st1.getStudentId());
				System.out.println(st1.getStudentName());
				System.out.println(st1.getlastName());
				System.out.println(st1.getStudentDepartment());
				
				System.out.println();
				
				Student st2 = new Student();
				st2.setStudentId(2);
				st2.setStudentName("renu");
				st2.setStudentDepartment("Science");
				st2.rollNum =1;
				
				System.out.println(st2.getStudentId());
				System.out.println(st2.getStudentName());
				System.out.println(st2.getStudentDepartment());
				System.out.println(st2.rollNum);
				
			}
		}	

}


