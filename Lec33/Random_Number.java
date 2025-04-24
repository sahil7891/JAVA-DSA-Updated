package Lec33;

import java.util.Random;

//in this code 10 to 50 ke b/t  2 digit ke 10 random no. generate ho rha hai

public class Random_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int si= 10;  //start index
		int ei = 50; //end index
		Random_number(si,ei);
	}
	public static void Random_number(int si,int ei) {
		
		Random rand = new Random();    // " new Random(); " this is the inbuilt class to generate random no. 
		int lo = si;
		int hi = ei;
		for (int i = 0; i < 10; i++) {
			int item = rand.nextInt(hi-lo+1)+lo; // formula to generate random no.
			System.out.print(item+ " ");            // Random number b/t 10 to 50
		}
	}
}

//------------------------------

//Niche bhi same code likha h upr wale ki trh bina method call kiye ise chlane ke liye upr wale code ko comment out krna hoga

//			int si = 10;
//			int ei = 100;
//			Random r = new Random();
//			for (int i = 0; i < 10; i++) {
//				int item = r.nextInt(ei - si + 1) + si;
//
//				System.out.print(item + " ");
//	   }		
//   }
// }







