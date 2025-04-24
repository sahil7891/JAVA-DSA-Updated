package Lec43;

import java.util.LinkedList;

public class LinkedList_Java { // inbuilt linked list (class) ko storage ke liye use krenge , data rkhne ke liye 
	                           // linked list inbuilt class hai java me and hme (java.util.LinkedList;) wali class ko use krna h          
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> list = new LinkedList<>(); // list name ka new linked list bna liya
		
		list.add(10); //ye last me add krta h
		list.add(20);
		list.add(30);
		list.add(40);
		
		list.addFirst(90); //ye 1st index pr add krta hai
		
		list.add(50);
		list.add(60);
		
		list.add(2,170); //isse 2nd index pr 170 add hoga
		
		System.out.println(list);
		System.out.println(list.remove()); // ye 1st index ko remove krega
		System.out.println(list.removeLast()); // ye last index ko remove krega
		System.out.println(list.remove(5)); // ye 5th index ko remove krega             
		System.out.println(list);


	}

}
// interview question   :- Linked list se stack kese bnaoge 

// addFirst and removeFirst krne se linkedList "STACK" ki trh behave krega
// complexity :- addFirst and removeFirst inn dono ki complexity - O(1) hogi

//----------------------------------------------------------------------------

//interview question    :- Linked list se Queue kese bnaoge 

//addLast and removeFirst krne se LinkedList "QUEUE" ki trh behave krega
// complexity :- addFirst and removeFirst inn dono ki complexity - O(1) hogi














