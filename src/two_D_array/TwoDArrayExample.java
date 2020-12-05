package two_D_array;

import java.util.Scanner;

public class TwoDArrayExample {

	public static void main(String[] args) {
		Scanner  scr = new Scanner(System.in);
		
		System.out.println("Enter the matrix size");
		int size = scr.nextInt();
		
		int[][] matrix = new int [size][size];
		
		for (int i = 0; i < size; i++) {
			for(int j = 0; j< size; j++) {
				System.out.println("Enter the number");
				matrix[i][j]= scr.nextInt();
			}
		}
		for (int i = 0; i< size; i++) {
			for(int j= 0; j< size; j++) {
				int	square = matrix[i][j] * matrix[i][j];
					System.out.print(square + " ");
			}
			System.out.println();
		}
		

	}

}
