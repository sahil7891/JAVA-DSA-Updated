package Lec3;

import java.util.Scanner;

public class Pattern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();  // int n = 5;
		int row = 1;
		int star = 1;
		while (row <= n) {
			int i = 1;
			while (i <= star) {
				System.out.print("*"+" ");
				i++;
			}
			row++;  //next now ki preparation
			star++; //next now ki preparation
			System.out.println();  //next now ki preparation
		}

	}

}

//* 
//* * 
//* * * 
//* * * * 
//* * * * * 


	