package object_array;

import java.util.Scanner;

public class CustomerRecordPreview {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter the array size");
		int size = scr.nextInt();
		
		
		
		CustomerRecord [] cust = new CustomerRecord[size];
		
		for(int i = 0; i < size; i++) {
			 cust[i] = new CustomerRecord();
			 System.out.println("Enter name");
			 String custName= scr.next();
			 System.out.println("Enter rem balance");
			 int remBalance = scr.nextInt();
			 
			 cust[i].setCustName(custName);
			 cust[i].setRemBalance(remBalance);
		}
		
		for(int i = 0; i < size; i++) {
			String cName = cust[i].getCustName();
			int cRemBal = cust[i].getRemBalance();
			
			if (cRemBal > 0 && cRemBal < 10000) {
			System.out.println();
			System.out.println("Customer name is " + cName + " and has balance less than 10000");
			}
			if (cRemBal > 10000 && cRemBal < 50000) {
				System.out.println();
				System.out.println("Customer name is " + cName + " and has balance less than 50000");
			}
			if (cRemBal > 50000) {
				System.out.println();
				System.out.println("Customer name is " + cName + " balance exceeded the max allowed credit limit");		
			}
		}

}
}

	

