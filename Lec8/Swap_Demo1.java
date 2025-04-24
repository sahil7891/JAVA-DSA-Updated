package Lec8;

public class Swap_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int[] arr= {10,20,30,40,50};
		System.out.println(arr[0]+" "+arr[1]); // index no 0 and 1 print hoge 
		
		swap(arr , 0,1); // swap function ko call kr rhe h // index no 0 and 1 ko swap kr rhe h
		
		System.out.println(arr[0]+" "+ arr[1]); // updated array
	}
	public static void swap(int[] arr, int a, int b) {
		int temp =arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
 
}
// index no 0 & 1 ke b/t swaping hori h