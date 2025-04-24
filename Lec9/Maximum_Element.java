package Lec9;

public class Maximum_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,-3,90,7,9087,-9,79,-18,902};
		System.out.print(Maximum(arr));
	}
	public static int Maximum(int[] arr) {
		int min = arr[0];                   // min me pehle hi 0th index wala element rkh liya isliye
		for (int i=1; i <arr.length; i++) { // for loop me i ko index no 1 se initialize kr rhe h
			if (arr[i]>min) { //arr and min me jo element bda hoga wo
				min=arr[i];   //element min me a jaega
			}
		}
		return min; //last me jo element min me pda hoga wo greatest element hoga and jha se Maximum method ko call ayi h wha return hojaega
 
	}

}
//o/p = biggest no. present in the array