package while_loop;

import java.util.Scanner;

public class CheckIfStoreyedofBuildingIs13 {

	public static void main(String[] args) {
		int numberOfStoreyed = 5;
		
		Scanner scr = new Scanner(System.in);
		
		while (numberOfStoreyed < 13) {
			System.out.println("Enter the num of storeys");
			int num = scr.nextInt();
			numberOfStoreyed = (numberOfStoreyed + num);
		}
		System.out.println(" You have max storeys limit");

	}

}
