package Lec3;

import java.util.Scanner;

public class Mirror_Pattern_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int space = n - 1;
		int star = n;
		int row = 1;

		while (row <= 2 * n - 1) {
			
			int i =1;
			while(i<=space) {
				System.out.print("  ");
				i++;  //it mans i=i+1;
			}
			int j=1;
			while(j<=star) {
				System.out.print("*"+" ");
				j++;
			}
			if(row<n) {
				star--;
				space--;
				
			}
			else {
				star++;
				space++;
			}
			row++;
			System.out.println();
			
		}

	}

}




