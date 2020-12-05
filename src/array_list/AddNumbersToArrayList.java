package array_list;

import java.util.ArrayList;

public class AddNumbersToArrayList {

	public static void main(String[] args) {
		
		//ArrayList<Type of Value> variable = new ArrayList();
		ArrayList<Integer> num = new ArrayList();
		//num[0]= 1; this is for array
		num.add(1); // saves 1 in 0 position of num arraylist
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
	
		//System.out.println(num[0]); this is only for array
		
		System.out.println(num.get(0));
		System.out.println(num.get(1));
		System.out.println(num.get(2));
		System.out.println(num.get(3));
		System.out.println(num.get(4));
	}

}
