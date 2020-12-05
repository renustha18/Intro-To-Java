package object_array;

import class_examples.Restaurant;

public class RestaurantDemo {

	public static void main(String[] args) {
		Restaurant r1 = new Restaurant();
		r1.setFoodType("Chinese");
		r1.setNoOfEmployee(10);
		r1.openDays = "Monday - Friday";
				
		Restaurant r2 = new Restaurant();
		r2.setFoodType("Indian");
		r2.setNoOfEmployee(5);
		r2.openDays= "Saturday - Sunday";
		

	
//		String message = r1.message();
//		
//		System.out.println(message);
//		
//		String foodType = r1.getFoodType();
//		System.out.println("We serve " + foodType + " food ");
//		
//		int numOfEmp = r1.getNoOfEmployee();
//		System.out.println("We have " + numOfEmp + " employees");
//		
//		String daysOpen = r1.openDays;
//		System.out.println("We are open " + daysOpen);
//		
//		String message1 = r2.message();
//		
//		System.out.println(message1);
//		
//		String foodType1 = r2.getFoodType();
//		System.out.println("We serve " + foodType1 + " food ");
//		
//		int numOfEmp1 = r2.getNoOfEmployee();
//		System.out.println("We have " + numOfEmp1 + " employees");
//		
//		String daysOpen1 = r2.openDays;
//		System.out.println("We are open " + daysOpen1);
		
		
		
		Restaurant[] r = new Restaurant[2];
		r[0]= new Restaurant();
		r[0].setFoodType("Chinese");
		r[0].setNoOfEmployee(10);
		r[0].openDays = "M - F";
		
		r[1] = new Restaurant();
		r[1].setFoodType("Indian");
		r[1].setNoOfEmployee(5);
		r[1].openDays = "Sat - Sun";
		
		for (int i = 0; i < r.length; i++) {
			String fT= r[i].getFoodType();
			int emp = r[i].getNoOfEmployee();
			String days = r[i].openDays;
			
			String m = r[i].message();
			
			System.out.println(m);
			System.out.println("We serve " + fT + " food ");
			System.out.println("We have " + emp + " employees");
			System.out.println("We are open " + days);
			
			
		}
	}

}
