package Lec50;

import java.util.Comparator;

public class CarCompareterSpeed implements Comparator<Cars>{ // Cars class me implement kr rhe h 

	@Override   // CarCompareterSpeed pr click krke add unimplemented method pr click krke niche "compare" wale method ko "bode" mil jaegi  
	
	public int compare(Cars o1, Cars o2) { // Cars o1 <--  "This"   //  Cars o2 <-- "Other"      see in notebook
		// TODO Auto-generated method stub
		return o1.speed - o2.speed;  // This - other   kr rhe h// speed ke basis pr sort hoga
	}
	
}
