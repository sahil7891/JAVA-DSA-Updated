package Lec3;

import java.util.Scanner;

public class Count_Pattern_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int val = 1;
		int star = 1;
		int space = n - 1;
		while (row <= n) {
			// space
			int i = 1;
			while (i <= space) {
				System.out.print(" \t ");
				i=i+1;
			}
			// star
			int j = 1;
			while (j <= star) {
				System.out.print(val + "\t "); // " \t " is used for 4 space   
				j=j+1;
				val++; //instead of "val=val+1;" we write val++
			}
			// next Row Prep
			star += 2;// star= star+2;
			space--;
			row++;
			System.out.println();
		}
	}

}
