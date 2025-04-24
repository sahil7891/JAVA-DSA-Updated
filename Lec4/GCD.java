package Lec4;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int divident= sc.nextInt();
		int divisor = sc.nextInt();
		
		while (divident%divisor !=0) { //not equal to 0
			int rem = divident % divisor;
			divident = divisor;
			divisor = rem;
		}
		System.out.println(divisor);
		}

	}

//se in notebook
// i/p = 36 and 60  // o/p = 12
//---------------------------
           // hard code below 1st commentout above code


//int divisor=36;
//int divident=60;
//while(divident%divisor!=0) {
//	int rem = divident%divisor;
//	divident = divisor;
//	divisor = rem;
//	
//}
//System.out.println(divisor);	
//
//}
//
//}