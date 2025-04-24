package Lec38;

import Lec37.Stack;     //import Lec37.Stack; <- yha Stack class ko import kiya h taki usko use kr ske //Lec37 se Stack class ko import krna pd rha hai because Lec37 other package hai

public class DynamicStack extends Stack { //Lec 37 se Stack class ko inherit kiya hai eg:- "DynamicStack extends Stack" Taki Stack class ki properties ko use kr ske                                    
                                          //For understanding purpose for eg:- yha DynamicStack as a child class hai __&__ Stack as a parent class hai
	@Override
	public void push (int item) throws Exception{
	
		if(super.isfull()) { //agar stack full hogyi then below
			
			int [] arr = new int [2* super.data.length]; //(step 1) - yha Stack ka size double kr rhe h
			
			for (int i = 0; i < super.data.length; i++) {
				arr[i] = super.data[i]; // (step 2) - loop ki help se new stack or u can say new size wali stack me purana data copy krde 
			}
			super.data = arr; // ye line data me arr ka adderss daldega
		}
		super.push(item);// (step 3) - Stack class se push wale function chlega and input diya hua item stack me add hojaega see in notebook 
		                 //"super" likhna pdega wrna  agar sirf "push(item);" likhdenge toh recursive call lag jaegi
			             //"super" variable tb use krte h jb same name ka variable child and parent class me ho eg:-data
	                     //"super" ki help se always parent class ke variable get hoga
	}
}




// Dynamic Stack bnane ka purpose ye h ki Agar Stack ka size fix na ho for eg:-100 , and Stack ka size elements dalne ke sath increase hote jaye 
// Normal Stack ka size fixed hota h eg:- 100 and dynamic stack ka size elements input krne ke sath sath badhta h

//4 types ke access modifier hote hai eg:-
//1- default
//2- public 
//3- private 
//4- Protected

//eg 1st- default   --> see in Lec 37, Stack class --> int [] data; // ab ye default variable or access modifire h jo ki sirf same package me access ho stkta ho another packge me access nhi hoga and ise another class me inherit bhi nhi kr skte	
//eg 4th- Protected --> ye same default ki trh hota h but ise another package me inherit kiya ja skta hai 
//eg 4th- Protected --> see in Lec 37 Stack class --> protected int [] data; //  protected ko Lec38 ke liye use kiye hai see there wrna Stack wale code ke liye private hi better h






