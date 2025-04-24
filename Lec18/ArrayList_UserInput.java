package Lec18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList_UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> ll = new ArrayList<>();
		
		for (int i = 0; i < 4; i++) { // hmne loop me list ka size 4 set kiya h means 4 se jada elements i/p nhi de skte
			ll.add(sc.nextInt());     // ll means list me upto 4 iteration tk data input hoga // this loop is for getting user input
		}
		for (int i = 0; i < ll.size(); i++) { // this loop is for printing list ka data
			System.out.println(ll.get(i));    // upr loop index no 0 se initialize hua h and last index tk list print hogi

		}
	}

}

//ArrayList input --> 5 87 65 87  
//ouput me array print hoga
