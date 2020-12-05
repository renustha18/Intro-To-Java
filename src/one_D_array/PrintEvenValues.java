package one_D_array;

public class PrintEvenValues {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6 ,7, 8};
		
		for(int i= 0; i< 8; i++) {
			
			if (numbers[i] % 2 == 0) {
				System.out.println(numbers[i]);
				
			}
				
		}
		
	}

}
