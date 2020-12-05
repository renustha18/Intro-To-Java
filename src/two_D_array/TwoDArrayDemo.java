package two_D_array;

public class TwoDArrayDemo {

	public static void main(String[] args) {
		int[][] matrix = new int[4][2];
		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[1][0] = 3;
		matrix[1][1] = 4;
		matrix[2][0] = 5;
		matrix[2][1] = 6;
		matrix[3][0] = 7;
		matrix[3][1] = 8;

//		for (int i = 0; i < 4; i++) { 
//			int sum = matrix[i][0] + matrix[i][1];
//			System.out.println(sum);
//		
//		}
		
		
//		int[][] matrix1 = new int[4][3];
//		matrix1[0][0] = 1;
//		matrix1[0][1] = 2;
//		matrix1[0][2] = 10;
//		matrix1[1][0] = 3;
//		matrix1[1][1] = 4;
//		matrix1[1][2] = 5;
//		matrix1[2][0] = 5;
//		matrix1[2][1] = 6;
//		matrix1[2][2] = 21;
//		matrix1[3][0] = 7;
//		matrix1[3][1] = 8;
//		matrix1[3][2] = 23;
//		
//		for (int i = 0; i < 4; i++) {
//			int sum = matrix1[i][0]+ matrix1[i][1];
//			if(sum < matrix1[i][2]) {
//				System.out.println(sum);
//			}
//		
//			
//		}
//		
		
		
		int[][] m =  new int[2][4];
		m[0][0] = 1;
		m[0][1] = 2;
		m[0][2] = 3;
		m[0][3] = 4;
		m[1][0] = 1;
		m[1][1] = 2;
		m[1][2] = 3;
		m[1][3] = 4;
		
		for (int j = 0; j<4; j++) {
			int sum = m[0][j] + m[1][j];
			System.out.println(sum);
		}
		
	}

}
