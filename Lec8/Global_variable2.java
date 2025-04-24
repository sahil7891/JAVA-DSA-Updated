package Lec8;

public class Global_variable2 {

	static int val;     // In this the val is global variable which can be accessed in every function , Global variable bnane ke liye "Static" lgana pdta h    
	                    // GLOBAL VARIABLE KI VALUE "HEAP" MEMORY ME REHTI HAI
	public static void main(String[] args) {

		val = 50;       // val global variable bn gya hai then we can give it a value
		
		System.out.println("hey");
		int x = 90;
		System.out.println(val);   //Yha "val" ki value 50 hi rhegi bcoz ise function se pehle hi print krwaya h
		fun(x);
		System.out.println(val);   //140  
		val = 69;
		System.out.println(val);   //69
	}                                                                      
	public static void fun(int x) {//int x me 90 aega     
		
	  //int val= 18; //int lgane se "val" ab "LOCAL Variable" ban gya 
		
		val=140;     // Yha "val ki value change ho jayegi , or fir yehi rhegi jb tk val ko dobara update nhi krte
		int a = 190;
		System.out.println(x); //90
		System.out.println(val);//140

	}

}












