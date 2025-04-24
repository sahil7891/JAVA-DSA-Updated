package Lec13;

public class Two_Arrays_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = new int [3][4];
		System.out.println(arr[1]); //address print hoga 
		System.out.println(arr[2]); //address print hoga 
		
		int [][] ar = new int [3][];//see in notebook
		System.out.println(ar[0]);  //null //see in notebook
		System.out.println(ar);     //address print hoga 
		System.out.println(arr);    //address print hoga 
		
		int [][] other = arr;
		System.out.println(other);  //arr and other dono ka same address hoga isliye same o/p aega
		
		System.out.println(arr.length); //3 rows
		System.out.println(arr[0].length); //4 columns 

		int [] arr9 = null; //1D Array
		System.out.println(arr9); //null

	}

}
