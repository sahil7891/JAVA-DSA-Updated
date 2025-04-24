package Lec8;

import java.util.Scanner;

public class Array_UserInput_Display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();        //i/p => 5
		int[] arr = new int[n];      //upr i/p - 5 diya means 5 lenght ka array bnade
		
		for (int i = 0; i < n; i++) {// now i 0th index se initialize hoga and upto 5 iteration tk chlega bcos upr 5 length ka i/p diya h  
			                         //for  (int i=0; i<arr.length; i++){ <-- ye line b likh skte h
			arr[i] = sc.nextInt();   //i/p =>   1 45 5 87 15
		}
		Display(arr); // Display method ko call kr rhe h Array ko print krne ke liye
	}

	public static void Display(int[] arr) { // argument me arr(array) bheja h
		for (int i=0; i <arr.length; i++) { // now i 0th index se initialize hoga and upto 5 iteration tk chlega bcos upr 5 length ka i/p diya h
			System.out.print(arr[i] + " "); //arr i array ke 0th index se print hona start hoga
		}
	}
}

// 1st i/p = length of array - Enter -> 5 // then input the data for upto 5 length --> 1 5 47 8 68








