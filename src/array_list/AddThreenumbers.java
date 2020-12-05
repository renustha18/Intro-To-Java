package array_list;

import java.util.ArrayList;
import java.util.Scanner;

public class AddThreenumbers {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList();
		
		Scanner scr = new Scanner(System.in);
		
		for (int i= 0; i< 3; i++) {
			System.out.println("Enter the number");
			int number = scr.nextInt();
			
			num.add(number);
		}
		int sum = 0;
		for (int i= 0; i< 3; i++) {
			sum = num.get(i) + sum;
		}
		System.out.println(sum);
		
		
	}

}
