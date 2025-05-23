package Lec19;

public class Product_Less_Than_k { //leetcode 713

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4, 2, 3 };
		int k = 10;
		System.out.println(countnofSubarray(arr, k)); //output = how many subarayy will become
	}

	public static int countnofSubarray(int[] arr, int k) {
		int si = 0; // si = start index
		int ei = 0; // ei = end index
		//es and ei dono ko 0th index se start kr rhe h
		int ans = 0;
		int p = 1;   // p = product
		while (ei < arr.length) {
			// window grow
			p = p * arr[ei];

			// window small
			while (p >= k && si<=ei) { // jb "ei" index no. 4 pr ajayega tb ye code run hoga
				p = p / arr[si];       // for eg jb "si" index no. 2 pr ayega then p will be still 12(3*4) which is still more than k  
				                       // at the end si and ei same idex pr ajayenge fir 'window grow' wala code again chlega      
				si++;
			}
			// ans calculate
			ans = ans + ei - si + 1; // +1 bcoz 0 based indexing h  // ans no. of subarray store krega
			ei++;
		}
		return ans;
	}
}

// o/p me no. of subarray btana h jinka product less than k ho

//this ques is the type of variable size window
//three steps of variable size window
//1 window grow
//2 window small
//3 ans calculate







