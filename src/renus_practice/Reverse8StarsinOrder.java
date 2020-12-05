package renus_practice;

public class Reverse8StarsinOrder {

	public static void main(String[] args) {
		for (int i =1; i<=8; i++) { //i = 2
			for(int j=8; j>=i; j--)  { //j =2
				System.out.print(" * ");
			}
			System.out.println();
		}
	
	}

}
