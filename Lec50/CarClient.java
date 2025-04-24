package Lec50;

import java.util.Comparator;
import java.util.*;

public class CarClient {
	
	public static void main(String[] args) {
		
//		int [] arr = new int [7]; // 7 size ka integer ka array h and ye object bnaya h 
		
		Cars [] cr = new Cars[5]; // 5 size ka Cars ka array and ye object bnaya h // iss line se 5 size ka array bna h jisme initially by default hr block me "null" hoga and hm isme hr ek block me "Cars type ka value/adress rkhenge" jha hr ek block ke address me (price , speed , color) ka data hoga //initially yha 0 cars hogi   
		System.out.println(cr[0]);// null
		
		cr[0] = new Cars(2000, 10, "White");  // it means Cars wale array ke 0th index pr (price-2000 , speed-10 , color-White) ye data rkhde jiska address 1k hoga
 		cr[1] = new Cars(1000, 20, "Black");  // new Cars(1000, 20, "Black"); <-- this line is called object
 		cr[2] = new Cars(3452, 30, "Yelow");  
 		cr[3] = new Cars(4189, 89, "Grey" );
 		cr[4] = new Cars(8907, 60, "Red"  );
 		
		//System.out.println(cr[0]); //address print hoga in case agar Cars class me toString method ko @Override nhi kiya ho
		
 		Display(cr); // now toString method ko Cars class me @Override kr diya h ab upr hmne jese i/p diya h wese hi print hoga
 		
 		System.out.println("********Niche Sort wala method run hone ke bd (eg:-Speed ke basis pr sort hokr print hoga(see in Cars class (♂ comparable) ) return speed wali line ko uncommenr krne pr) means jiski speed jitni jada wo utna niche hoga(Marks wala comparoson h -- see Cars class me -> return this.speed-o.speed; <- ye line likhi h speed ke basis pr sort krne ke liye) , [[ Rank]] wala comparison ke liye Cars class me ->return o.price-this.price <- iss line ko uncomment krna pdega*********");  
        
 		//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
// 		Sort(cr);   //♂all about the "Comparable Interface"
 		//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
 		
 		//=======================================
// 		Sort(cr , new CarCompareterSpeed());  // ♣ this code is for "CarCompareterSpeed" class     // jiski speed jada uski value km  // Cars class me ▬implements Comparable<Cars> - bina lidkhe agrument me changes mar skte h( that is the functionality of "comparator")   
// 		Sort(cr , new CarCompareterPrice());  // ☺ this code is for " CarCompareterPrice " class   // jiski price jada uski value km  // Cars class me ▬implements Comparable<Cars> - bina lidkhe agrument me changes mar skte h( that is the functionality of "comparator")   
// 		Sort(cr , new CarCompareterColor());  // ☻ this code is for "  CarCompareterColor  " class // jiski color jada uski value km  // Cars class me ▬implements Comparable<Cars> - bina lidkhe agrument me changes mar skte h( that is the functionality of "comparator")   
 		//=======================================
 		
 		//------------------------------
 		Arrays.sort(cr, new Comparator<Cars>() { // isme Arrays.sort krke sort krenge // this is the best & shortcut way for sorting and we will use this way  baki sare code sirf explanation ke liye likhe h  
 		@Override                               
 		public int compare(Cars o1, Cars o2) {   // compare krne ke liye logic dediya by @Override
 		return o1.speed - o2.speed;              // yha speed ke basis pr sorting kr rhe h but hm price and color ke basis pr b sort kr skte h "Cars class" se 
 		}
 		});
 		//------------------------------
 		Display(cr);
 		//
	}
	public static void Display(Cars[] cr) {
		for (int i = 0; i < cr.length; i++) {
			System.out.println(cr[i]); //address print hoga	because 2String method chl rha h because hr class ka - parent class object class hota h  //now toString methos ko @Override kr diya see in Cars class ab content print hoga
//			System.out.println(cr[i].price  +" "+ cr[i].speed +" "+ cr[i].color);         // hm ye line b likh skte bt Cars class me @Override likhna jada optimesed hoga br br print krane ke liye
		}
	}	
	
//------------------------------
	
//	 // Below code is for "Comparable Interface" and hme "Cars class" me - public int compareTo(Cars o) {- wali sari lines ko comment in krna hoga then  ♣"CarCompareterSpeed" class ,, ☺"CarCompareterPrice class"  ,, ☻"CarCompareterColor class" wali sari lines ko comment out krne pr ye line chlani hai and niche  "Comparator" wali lines ko comment out krna h for understanding  "Comparable Interface"
//	 // yha sorting ke liye bubbol sort wale code ka use kiya h but hm selection and insersion sort ka b use kr skte h
	
//		public static <T extends Comparable<T>> void Sort(T[] arr) { //T is for generics  // extends Comparable<T>  <- this line isliye likhi h to show comparison ka logic available h / or comparison(function) ka bound set krne ke liye // ye code bubble sort wala hai lec 10 se liya h
//
//			for (int turn = 1; turn < arr.length; turn++) {   // length ki value 5 h then ye 4 bar proceed krega
//				for (int i = 0; i < arr.length - turn; i++) { // ye wala i hr line(digit) ke liye 0 se start hoga, last me
//															  // 13 yhi line pahucha rhi hai
//					if (arr[i].compareTo(arr[i+1])>0) {  // arr[i].compareTo <- ese compare krnge because ab Comparable ka use kr rhe h comparison ke ke liye  // if o/p ko decreasing order me krna hai to "greater than wala sign change
//											             // hoga"(arr[i]<arr[i+1]) istrha
//						T temp = arr[i];                 // T is for generics
//						arr[i] = arr[i + 1];
//						arr[i + 1] = temp;
//				}
//			}
//       }
//   }
// }	
	//:::::::::::::::::::::::::::::::::::::::::::::
	
//	// • this code is for "Comparator" and  ♣"CarCompareterSpeed" class ,, ☺"CarCompareterPrice class"  and  ☻"CarCompareterColor class"  inn tine me se kisi ek ke liye chlega comment in krne pr//all about the "COMPARATOR"
//  // yha sorting ke liye bubbol sort wale code ka use kiya h but hm selection and insersion sort ka b use kr skte h
	
	public static <T > void Sort(T[] arr, Comparator<T> camp) { //T is for generics  // extends Comparable<T>  <- this line isliye likhi h to show comparison ka logic available h / or comparison(function) ka bound set krne ke liye // ye code bubble sort wala hai lec 10 se liya h

		for (int turn = 1; turn < arr.length; turn++) {   // length ki value 5 h then ye 4 bar proceed krega
			for (int i = 0; i < arr.length - turn; i++) { // ye wala i hr line(digit) ke liye 0 se start hoga, last me
														  // 13 yhi line pahucha rhi hai
				if (camp.compare(arr[i], arr[i+1])>0) {   // arr[i].compareTo <- ese compare krnge because ab Comparable ka use kr rhe h comparison ke ke liye  // if o/p ko decreasing order me krna hai to "greater than wala sign change -  hoga"(arr[i]<arr[i+1]) istrha
					T temp = arr[i];                      // T is for generics
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
	}
}













