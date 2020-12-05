import java.util.Scanner;

public class DataTypeDemo {

	public static void main(String[] args) {
		//10
		//0.01
		//"message"
		//'a'
		//true
		//10000000000000000000000
		
//		int num = 10;
//		double num1 = 0.01;
//		String message = "message";
//		boolean result = true;
//		long num2 = 1000000000;
//		char alphabet = 'a';
		 
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter an integer");
		int num = scr.nextInt();
		
		System.out.println("Enter a double");
		double num1 = scr.nextDouble();
		
		System.out.println("Enter string");
		String message= scr.next();
		
		System.out.println("Enter a boolean");
		boolean result = scr.nextBoolean();
		
		System.out.println("Enter a long");
		long num2 = scr.nextLong();
		
		System.out.println("Enter a chararacter");
		String alphaString = scr.next();   //b
		char alpha = alphaString.charAt(0);
		 
	}

}
