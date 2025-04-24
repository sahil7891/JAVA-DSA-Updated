package Lec36;

import java.util.Scanner;

public class Person_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//"1 Non parameterised CONSTRUCTOR"
//		Person p = new Person();              //iss Non parameterised CONSTRUCTOR wale code ko comment in krne pr ye line uncomment krni pdegi bcoz Fir CONSTRUCTOR KI NEED HOGI and // upr wale string and int wali line ko uncomment krna hoga and private string and int ko comment out krdo      
//		p.name= "Kaju"; //updated -> kaju print hoga
//		p.age = 23;     //updated -> 23 print hoga
//		p.fun();        //funtion call
//		
		
////-------------------------------------
		
		//"2 parameterised CONSTRUCTOR"
//		Person p1 = new Person("Krishu",24);  //For running this Parameterised CONSTRUCTOR wale code ko chlane ke liye "person" class se 'private int age'   and   'private String name' wali line ko commentout krke Non private walo lines ko commentin krna pdega //agar niche wali dono line ko commentout krde then name me Kumar and age me 24 print hoga
		                                      //****** person class me "person" name ka "Parameterised constructor" bnaya h jiski help se hm iss class me "p name" ka new constructor bna pa rhe h*********
//		p1.name= "Kunal";// name Krishu se update hokr Kunal hojaega
//		p1.age = 45;     // age 24 se update hokr 45 hojaega
//		p1.fun();        //Adhar_no same ayaga
//	}
//}
//iss code ko chlane ke liye niche wala code commentout krna pdega
		
//--------------------------------------
		
		// private name and age wale code ke liye uper wale code ko comment out krke  niche wale code write kiya hai
		// Eg:- private String name = "kriti" ; 
		// Eg:-private int age = 23;
		
		
		Person p = new Person("karan",23); //constructor //****** person class me "person" name ka "Parameterised constructor" bnaya h jiski help se hm iss class me "p name" ka new constructor bna pa rhe h*********
		p.SetName("Nikita");  //encasulation wale methode ke throgh set kr rhe hai
	  //p.SetAge(-9);         //comment out na krne pr age -9 print hogi
		
		System.out.println(p.getAge()); //23 ->first p ka age print hoga
		p.fun();  //o/p - Nikita 23 8739370
		
		Person p1 = new Person("Kumar",24); //constructor
		p1.fun(); //o/p - Kumar 24 8739370
	}
}

//   Tasks performed before CONSTRUCTOR :-
//Step 1 Memory Allocation  -->//Person p = new Person("karan",23); --> In this --> **new Person("karan",23);** 1st idhr name me null and age me 0 agyega <- memory allocation
//Step 2 Parsing
//Step 3 Constructor

//Scanner sc = new Scanner(System.in); //'Scanner(System.in)' ye bhi constructor hai // and puri line object hai ******
//Person p = new Person();  // Person() - ye part CONSTROCTOR ko call krne ke liye use kiye hai  
//Use of constructor :- kisi default value pr data member ko initialize krane ke liye instead of null or 0









