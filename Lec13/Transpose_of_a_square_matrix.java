package Lec13;

import java.util.Scanner;

public class Transpose_of_a_square_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int [][] arr = new int [n][n];
		for (int i= 0; i <arr.length; i++) {
			for (int j=0; j<arr.length; j++) {
				arr[i][j]= sc.nextInt();
			}
		}
		Transpose(arr);
		//print
		for (int i= 0; i <arr.length; i++) {
			for (int j=0; j<arr[0].length; i++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void Transpose(int [][] arr) {
		
		for (int row =0; row<arr.length; row++) {
			for (int col = row+1; col<arr.length; col++) {
				int temp = arr[row][col];
				arr[row][col]= arr[col][row];
				arr[col][row]=temp;
			}
		}
	}
}
	
// Input=   5 bcos ye 5*5 ki matrix hogi
//5
//1 46 4 61 100 
//28 52 97 80 59
//6 33 62 42 12 
//57 31 56 89 47
//1 50 73 53 99


//output
//5
//1 28 6 57 1
//46 52 33 31 50 
//4 97 62 56 73 
//60 80 42 89 53 
//100 59 12 47 99


