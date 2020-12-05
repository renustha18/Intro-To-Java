package object_array;

import java.util.Scanner;

public class StudentDemo {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter the array size");
		int size = scr.nextInt();
		
		
		
		Student[] st = new Student[size];
		
		
		for(int i = 0; i < size; i++) {
			 st[i] = new Student();
			 System.out.println("Enter name");
			 String sname= scr.next();
			 System.out.println("Enter address");
			 String saddress = scr.next();
			
			 st[i].setName(sname);
			 st[i].setAddress(saddress);
			
		}
		for(int i = 0; i < size; i++) {
			String stname = st[i].getName();
			String staddress = st[i].getAddress();
			
			System.out.println();
			System.out.println("Student name is" + stname);
			System.out.println("Student address is" + staddress);
			
		}
	
	}

}
