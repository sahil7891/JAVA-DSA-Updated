package Lec36;

public class Student_Client {  
	
//	    public static void main(String[] args)throws  Exception{    //1st way -> "throws  Exception" - it tells exception might be generated and we have to write throws  Exception - bcoz stdent class me bhi throws exception likha hai
	    
	    public static void main(String[] args) {                    //2nd way wale code run krne ke liye yha se "throws Exeption" ko htana pdega 

		Student s = new Student ("Rohit", 24); //constructor
//      s.setAge(-22);  //setAge <- student wale code me if,syso and return, wali ki wjh se -22 print nhi ho rha iske bdle constructor ki value print hogi which is 24  //if , syso and return wali line comment out kiya hai islye ise b krna pdega student wale class se        
		s.setName("Kumar"); //name update hokr Rohit ke bdle Kumar ho jaega
//		s.setAge( 22);  //1st way-> if we put -22 then code will not run bcos hmne student class wale code me throws exception dala hai
		s.setAge(-22);  //2nd way-> hmara khudka bnaya exception dega  and age -22 ke bdle pehle se pda hua age print hoga eg:-24
		System.out.println(s.getAge()+" "+s.getName()); //age and name print hoga

	}
}
