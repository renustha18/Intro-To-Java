package for_loop;

public class PrintSumFrom1To10 {

	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 1; i< 11; i++) {
			sum = i+ sum;
		}
		System.out.println(sum);
		
	}

}
