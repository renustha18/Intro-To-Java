package two_D_array;

import java.util.Scanner;

public class ReplacingElementInMatrix {

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
		
		Scanner scr = new Scanner(System.in);
		System.out.print("Enter row position");
		int row = scr.nextInt();
		
		System.out.print("Enter column position");
		int column = scr.nextInt();
		
		System.out.print("Enter new element");
		int element = scr.nextInt();
		
		for( int i = 0; i < 3; i++) {
			for(int j= 0; j< 3; j++) {
				if( i== row && j== column ) {
					matrix1[i][j] = element;
					
				}
				System.out.print(matrix1[i][j] + " ");
			}
			System.out.println();
		}
	}
		
}
