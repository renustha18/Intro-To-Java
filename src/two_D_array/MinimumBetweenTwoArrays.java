package two_D_array;

public class MinimumBetweenTwoArrays {

	public static void main(String[] args) {
	
		int[][] matrix1 = new int[3][3];
		matrix1[0][0] = 1;
		matrix1[0][1] = 2;
		matrix1[0][2] = 1;
		matrix1[1][0] = 3;
		matrix1[1][1] = -1;
		matrix1[1][2] = 5;
		matrix1[2][0] = 6;
		matrix1[2][1] = 7;
		matrix1[2][2] = 8;
		
	
		int min = 100;
		for (int i = 0;i < 3; i++ ) {
			for(int j= 0; j<3; j++) {
				if (matrix1[i][j] < min) {
				 min = matrix1[i][j];
				}	
			}
		}
	 System.out.println("The min is " + min);
	 
	 	for (int i = 0;i < 3; i++ ) {
			for(int j= 0; j<3; j++) {
				if (matrix1[i][j]% 2 == 0) {
					System.out.println(matrix1[i][j]);
				}
			}
	 	}
	 	System.out.println("Now printing diagonal elements");
	 	
	 	for (int i = 0;i < 3; i++ ) {
			for(int j= 0; j<3; j++) {
				if(i == j) {
					System.out.println(matrix1[i][j]);
				}
			}	
	 	}
	 	System.out.println("Before replacing elements");
	 	for (int i = 0;i < 3; i++ ) {
			for(int j= 0; j<3; j++) {
				System.out.print(matrix1[i][j] + " ");
			}
			System.out.println();
		}
	 	
	 	System.out.println("After replacing elements");
	 	for (int i = 0;i < 3; i++ ) {
			for(int j= 0; j<3; j++) {
				if(i == 1 && j==2) {
					matrix1[i][j] = 10;	
				}
				System.out.print(matrix1[i][j] + " ");
				
			}
			System.out.println();
		}
	 	
	 	System.out.println("Reverse Order");
	 	for(int i = 2; i >= 0; i--) {
	 		for(int j = 2; j >= 0; j--) {
	 			System.out.print(matrix1[i][j] + " ");
	 			
	 		}
	 		System.out.println();
	 					
	 	}
	 	
		System.out.println("Reverse Row Order");
			for(int i = 2; i >= 0; i--) {
				for(int j = 0; j < 3; j++) {
					System.out.print(matrix1[i][j] + " ");
 			
				}
				System.out.println();
 					
			}
			
			
		System.out.println("test");
		for(int i= 2; i >=0; i--) {
			int sum = 0;
			for(int j = 2; j >= 0; j--) {
				sum += matrix1[i][j];
			}
			System.out.println(sum);
		}
 	}
			
			
	 
	
}
