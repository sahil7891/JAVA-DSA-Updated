package Lec3;

import java.util.Scanner;

public class Count_Pattern_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int space = n-1;
		int star  = 1;
		int row = 1;
		
		while (row<=n) {
			 
			int i=1;
			while (i<=space) {
				System.out.print("\t");
				i=i+1;
			}
			int val=1;    //by this every line will start from 1
			int j=1;
			while (j<=star) {
				System.out.print(val+"\t");
				j=j+1;
				val++;
			}
			row = row+1;
			space =space-1;
			star = star+2;
			System.out.println();
		}

	}

}


	
