package Lec13;

import java.util.Scanner;

public class Jagged_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();    //row //eg:- 3
		int [][] arr = new int [n][];  //Jagged Array me hr column ka length d/f d/f hoga isliye sirf row ko fix kiya h
		//take input
		for (int i = 0; i<arr.length; i++) {//for Row 
			int c = sc.nextInt();      //eg:=  then 1st row me kitne column h uska i/p denge
			arr[i] =new int [c];
			for (int j=0; j<arr[i].length; j++) {
				arr[i][j] = sc.nextInt(); //eg:= then 2 column ki values = 12 34
			}
		}
		//print
		for (int i = 0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}

	}

}

//input me pehle row dalna h then column then column ki value
//eg:- sbse pehle enter Row = 3
  
// then 1st row me kitne column h uska i/p denge eg enter = 2
// then 2 column ki values = 12 34

//then 2nd row me kitne column h uska i/p denge eg enter = 1
//then 1 column ki values = 23

//then 3rd row me kitne column h uska i/p denge eg enter = 4
//then 4 column ki values = 14 67 89 8

//overall i/p below copy past it
//3
//2
//12 3
//1
//23
//4
//14 67 89 5






