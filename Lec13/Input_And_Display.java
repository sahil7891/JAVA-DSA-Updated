package Lec13;

import java.util.Scanner;

public class Input_And_Display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// row
		int m = sc.nextInt();//collum
		int[][] arr = new int[n][m];

		// Take input
		for (int i = 0; i < arr.length; i++) {         //this is for row ,   eg [3],[4], row= 3 //ye loop 3 br chlega
			for (int j = 0; j < arr[0].length; j++) {  //this is for column, eg:- 1,2,3,4    //ye loop 4 br chlega
				arr[i][j] = sc.nextInt();              //i,j eg:- 0,1  0,2  0,3  0,4  int this 0 is column and 1234 is elements(index) in column			
			}
		}

		// print
		for (int i = 0; i < arr.length; i++) {  
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();  //for next line(next row)
		}
	}
}

////in this code give row and colum as input eg:- 2(row) --> enter    3(column)---enter
//  then enter values eg 2 5 6
//                       7 8 2
//                       then it will print that matrix








