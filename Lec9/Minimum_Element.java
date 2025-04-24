package Lec9;

public class Minimum_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {10,-3,90,7,-9,79,-18,902};
		System.out.print(Minimum(arr));
	}
	public static int Minimum(int[] arr) {
		int min = arr[0];                    // min me pehle hi 0th index wala element rkh liya isliye
		for (int i=1; i <arr.length; i++) {  // for loop me i ko index no 1 se initialize kr rhe h   //yha "i" ko 10 assume kiya h,means i 10 h
			if (arr[i]<min) {      //yha "i" se min wale element compare ho rhe h  // Maximum find krme ke liye ">" ajayega yha bs //arr and min me jo element bda hoga wo      
				min=arr[i];        //element min me a jaega means yha i update hoga
			}
		}
		return min; //last me jo element min me pda hoga wo lowest element hoga and jha se Minimum method ko call ayi h wha return hojaega
	}

}
