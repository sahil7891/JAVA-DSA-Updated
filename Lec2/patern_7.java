package Lec2;

import java.util.Scanner;

public class patern_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = n;
		int space = 1;
		while (row <= n) {
			
             //loop for space
			int i = 2;
			while (i <= space) {
				System.out.print("  ");

				i = i + 1;
			}
			//loop for star
			int j = 1;
			while (j <= star) {
				System.out.print("*"+" ");
				j = j + 1;
			}
			row = row + 1;
			star = star - 1;
			space = space+2;
			System.out.println();

		}


	}

}
//* * * * * 
//    * * * * 
//        * * * 
//            * * 
//                * 
