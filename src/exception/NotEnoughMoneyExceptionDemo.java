package exception;

import java.util.Scanner;

public class NotEnoughMoneyExceptionDemo {
	
	public boolean checkIfCustomerHasMoney(int money) throws NotEnoughMoneyException {
		
		if (money > 0) {
			return true;
		}
		else {
			NotEnoughMoneyException ex = new NotEnoughMoneyException();
			throw ex;	
		}	
	}
	

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		System.out.println(" How much money do you have?");
		int money = scr.nextInt(); //0
		
		NotEnoughMoneyExceptionDemo obj = new NotEnoughMoneyExceptionDemo();
	
		//any expression that throws exception goes inside try block
		try {
			boolean result = obj.checkIfCustomerHasMoney(money); // new NotEnou...	
		}
		catch(NotEnoughMoneyException a) {
			System.out.println(a.message);
			
		}
		
		
		
		

	}

}
