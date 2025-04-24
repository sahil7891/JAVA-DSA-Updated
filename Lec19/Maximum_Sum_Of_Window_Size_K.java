package Lec19;

public class Maximum_Sum_Of_Window_Size_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,7,5,11,3,2,1};
		int k =3;
		System.out.print(MaximumSum(arr,k));
	}
	public static int MaximumSum(int []arr, int k) {                   //----|
		int sum=0;                                                     //    |
		//1st window                                                   //    |- 1st step in fixed size sliding window 
		for(int i=0; i<k; i++) {                                       //    |
			sum+=arr[i];  // 1+2+7 = 10 // 10 is 1st window(subarray)  //----|
		}
		int ans=sum; // 2nd step -> ans = sum    //other steps as follows below
		for(int i=k; i<arr.length; i++) {        //yha i ko index no 3 se initialize kr rhe h bcause k=3 h and jbtk i<arr.length nhi hoga next window(sub-array) create honge
			sum+=arr[i];                         //window grow // isme index no. 3(5) add hoga 10 me then it will be 15
			sum-=arr[i-k];                       //window small// isme index no. 0(1) subtract hoga then next window(sub-array) wil be 14
			ans = Math.max(ans, sum);            //ans update hokr ans me  ans & sum ka maximum aega -> ans(previous value(int ans=sum; which is 10) && sum(recent value (14)) ka max ans me aega        
		}
		return ans; // end me jo no. ans me bchega wo o/p hoga then use return krdo main method me jha se call ayi h
		}
	}
// in this ques - maximum sum of 3 size subarray o/p dena hai eg:-> 7+5+11 = 23 output
// Fixed size sliding window ka ques h bcoz size of subarray fixed h which is 3

