package Lec21;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {2,3,4,5,46,7,44,2,6,9,78,5,64};
	System.out.println(fc(arr,0,9));
	}
	public static int fc(int [] arr , int i, int item) {
		if (i==arr.length) {
			return -1;
		}
		if (i==item) {
			return i;
		}
		return fc(arr,i+1,item);
		
	}
}
	
			

