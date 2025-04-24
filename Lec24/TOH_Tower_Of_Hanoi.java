package Lec24;

import Lec20.print_Dec_Inc;

public class TOH_Tower_Of_Hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3; //no. of disk
		printSteps(n,"src","hlp","dst");

	}

	public static void printSteps(int n, String s, String h, String D) { //s is src , h is helper , d is destination // n --> no. of disk
		
		if(n==0) {
			return;
		}
		printSteps(n-1, s, D, h); //ye line n-1 disk ko src to hel tk phuchayegi  //s,h,d ke bdle s,d,h(reference swap ho rha h) suppos rod ko interchange krdiya
		                                                                          // ye line n-1 disk ko src to hel tk phuchayegi // type 'print'-->cnt+space-->enter - to write full method name automatically       
		System.out.println("Move " +n+ " th disc from " +s+ " to " +D);
		printSteps(n-1, h, s, D); //ye line n-1 disk ko hlp to des tk phuchayegi 
	}
	
}
