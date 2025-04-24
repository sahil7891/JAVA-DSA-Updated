package Lec12;

public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 5, 8, 9, 12, 14, 15, 16, 17 };
		
		System.out.print(Search(arr, 14)); // o/p me 14 ka index no. aega eg:- 5
	}
	public static int Search(int[] arr, int item) { // arr me array pass hoga // item me 14
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == item) {
				return mid;

			} else if (arr[mid] > item) {
				high = mid - 1;

			} else {// arr[mid]<item
				low = mid + 1;
			}
		}
		return -1;  //this is for if the given element(item) is wrong or not exist 
	}

}




