package Lec4;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();  
		//            For   ""HARDCODE""   instead of "int n= sc.nextInt();"  write --> ****int n=3;*****
		int fact = 0;
		for(int i=2; i<n; i++) {
			if(n%i==0) {  // agr ye line true hui then 'fact++' wali line chlegi
				fact++; // fact 1 hote hi loop ki itration stop hogi and'else' wali line print hogi otherwise a nhi hui toh 'if' wali line print hogi
			}
		}
		if(fact>=1) {
		System.out.println("Not prime");
		}
		else {
			System.out.println("Prime");
			System.out.println(n);
			}
		}
	}
//Entere the i/p eg:-13 and this will tell u the no. is  prime or not 






