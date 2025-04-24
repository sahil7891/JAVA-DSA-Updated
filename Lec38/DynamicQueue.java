package Lec38;

import Lec37.Queue; //import Lec37.Queue; <- yha Queue class ko import kiya h taki usko use kr ske //Lec37 se Queue class ko import krna pd rha hai because Lec37 other package hai   

public class DynamicQueue extends Queue { //To understanding purpose for eg:- yah DynamicQueue == child hai __&__ Queue == parent hai

	@Override
	public void Enqueue(int item) throws Exception {
		
		if(super.isfull()) {
		int[] arr = new int [2*super.data.length]; //(step 1)  Queue ka size double kr rhe h 
		                                           // same operation kr rhe h jese "DynamicStack" me kiya h stack ka size double krne ke liye Bs 2 (additional step) kr rhe h queue ke form me data rkhne ke liye 

			
			for(int i = 0; i<data.length; i++) {
				int idx = (this.front + i) % this.data.length; //queue ke form me data rkhne ke liye **(additional step)**
				arr[i] = data[idx]; //new size wale queue me purana data daldega (step 2)
			
			}
			this.data = arr; // ye line data me arr ka adderss daldega
			this.front = 0;  // front elements index no 0 pr set hojaega  (additional step)
		}
		super.Enqueue(item); //Enqueue ki help se Queue me element dalskte hai and "super" ki help se parent class(Queue class) me enqueue hoga (step 3)
		//now ye Queue dynamic h jisme elements ke according Queue ka size increase ho rha hai
	}
}


