package Lec9;
import java.util.Scanner;
public class Linear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt(); //i/p = length of arr
		int[] arr = new int[n];
		for (int i=0; i<arr.length; i++) {
			arr[i]= sc.nextInt(); // array i/p 
			
		}
		int item=sc.nextInt(); //i/p=search wala item
		for (int i=0; i<arr.length; i++) {
			
		}
		System.out.println();
		System.out.println(Search(arr,item));
	}

	public static int Search(int[] arr,int item) { // arr me array and item me find wala array ka data aega eg:-2
		for (int i=0; i<arr.length; i++) { // i++ means array me i ke index ko 1 se aage bdha hr iteration me
			if(arr[i]==item) { // i == item hote hi 
				return i; //   item return krde
			}
		}
		return -1; // for loop pura chlne ke bad bi then if the no. is not present in the array the o/p is -1
	}
}
//user input  = length of arr(eg=5)
//then give 5 array input (eg=  1 2 3 4 5 )
//then ask the number in array among(1,2,3,4,5) it will tell you the index no. and if the no. is not present in the array the o/p is -1







