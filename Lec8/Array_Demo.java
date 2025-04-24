package Lec8;

public class Array_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[5]; // arr me 5 length ka 1D array bna diya

		System.out.println(arr[0]); // arr[0] is index no. and it's default value = 0
		System.out.println(arr[1]); // arr[1] is index no. and it's default value = 0
		System.out.println(arr[2]); // arr[2] is index no. and it's default value = 0
		System.out.println(arr[3]); // arr[3] is index no. and it's default value = 0
		System.out.println(arr[4]); // arr[4] is index no. and it's default value = 0

		arr[0] = 10;  // now index no 0 me 10 rkh diya
		arr[1] = 20;  // now index no 0 me 10 rkh diya
		arr[2] = 30;  // now index no 0 me 10 rkh diya
		arr[3] = 40;  // now index no 0 me 10 rkh diya
		arr[4] = 50;  // now index no 0 me 10 rkh diya

		System.out.println(arr[0]);// 10
		System.out.println(arr[1]);// 20
		System.out.println(arr[2]);// 30
		System.out.println(arr[3]);// 40
		System.out.println(arr[4]);// 50

		System.out.println(arr.length);// "arr.length" to check the size of the array //5

		 for(int i=0; i<arr.length; i++) { //loop 5 times chlega because array ki lenght 5 h
		 arr[i]=(100) * (i+1);             //here array ki values ko change kr rhe h // here 100*1 then 100*2 then 100*3 and so on
		 
		}
		for (int i = 0; i < arr.length; i++) { // i=0 means index no. 0 se initialize kr rhe h //loop 5 times chlega because array ki lenght 5 h
			System.out.println(arr[i]);        // i=0 means i index no. 0 se print hoga start hoga 
		}

	}

}
//Upr wale for loop ke bdle ye niche wala for loop b likh skte h
//     for (int i = 0; i < arr.length;) {
//	   arr[i]=(100) * (i+1); // here 100*1 then 100*2 then 100*3 and so on
//	   i++;




