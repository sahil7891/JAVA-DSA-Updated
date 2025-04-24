package Lec18;
import java.util.ArrayList;
import java.util.Collections;
public class Arralist_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();  // ArrayList Dynamic hota h means iska input ke sath size bhi increase hota hai
		System.out.println(list); //[]
		
		// Add -- last me add karega
		list.add(10);
		list.add(20);
		System.out.println(list); //[10, 20]
		
		
		// range 0 to size
		list.add(0,30); //add at index means index 0 pr 30 print hoga
		System.out.println(list); //ArrayList print hogi
		System.out.println(list.size()); //ArrayList ka size pta krn ke liye
		
		list.add(2,90); // index 2 pr 90 add hokr 2nd index pr 90 print hoga
		System.out.println(list);
		
		//delete
		//range 0 to size -1
		System.out.println(list.remove(1)); // index no 1(10) List se delete hoga and 1 is index
		System.out.println(list); // rest of the arrayList printed accept 10 because use hmne delete kr diya h

		list.add(60);
		list.add(-20);
		System.out.println(list); // it will include 60,-20 in arraylist
		
		
		//get
		//range 0 to size -1
		System.out.println(list.get(3));//index no 3 pr 60 then it will print 60
		System.out.println(list);
		
		//"set --> update" index pe jaa kr
		list.set(1, -5);  // index 1 pr 90 ke badle -5 print hoga
		System.out.println(list);
		
		for (int i = 0; i<list.size(); i++) { //list ko for loop se print kra rhe h
			System.out.print(list.get(i)+" ");//arr[i] index no 0 se print hona start hoga and upr for loop me i++ ki help se ek index agge jaega then 
		}                                     //firse syso wali line chlegi and 2nd index print hoga so on
		System.out.println();
		
	
         for(int i = list.size()-1; i>=0; i--) { // list ko reverse se print krane ke liye loop ko last index se start kr rhe h and i-- se backward a rhe h
	       System.out.print(list.get(i)+" ");//list.get(i) last index se print hoga start hoga bcause upr loop ko last index se initialize kiya h and it will print in reverse order
        }
         System.out.println();
         
         // Enhance for loop(EFL)
         for (int val : list) {
        	 System.out.print(val+" ");
         }
         System.out.println();
        
         int [] arr = {10,20,30};
         for(int Sumaiya:arr) {
        	 System.out.print(Sumaiya+" ");
         }
         System.out.println();
         
         //Array.sort(arr)
         Collections.sort(list);//sort  , it will sort out the arraylist
         System.out.println(list);
         }
	}	
		
		
		
		
		
		
		
		
		
		
	


