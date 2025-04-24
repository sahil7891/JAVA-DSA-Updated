package Lec36;

public class Person {

//	         int age = 23;            //parsing
//	         String name = "kriti" ;  //parsing
     private String name = "kriti" ;  //parsing   // 'private'  banane pr within the class hi access hoga another class me access nhi kr skte // another class me access krne ke liye encapsulation ka use krna pdega 
     private int age = 23;            //parsing   // 'private' => scope ,' access modifier' means isko kha kha access kiya ja skta hai

	// agar private wale code ko comment out krte hai then  upr wali name and age wali line ko non commetin krna pdega and "prson client" me bhi private wale part ko commentout  krke uske upr wale code ko non comment krna pdega
 
//----------------------------------
	 //1 Non parameterised CONSTRUCTOR
	
//	 public Person() {                       // 1 Non parameterised CONSTRUCTOR  // CONSTRUCTOR = iska koi return type nhi hota means isme void and static use nhi hota, constructer ko private nhi bnaya ja skta 
//		                                                                         // jo class ka name h wahi constructo ka name hoga(person)  its just like a function , and ye class ke data member ko initialise krne me help krta hai         
//		this.name = "Motu";  //default name
//		this.age  = 24;      //default age
//		
//	}
//	//iss class me hmne ye -->public Person() {  ek Non parameterised CONSTRUCTOR bna diya and ab hm iski help se "person_client" class me new name ka Non parameterised CONSTRUCTOR constuctor bnake usse use kr skte h eg:- name and age kuch b rkh skte h
//-----------------------------------
	
	//2 Parameterised CONSTRUCTOR
	         
	    public Person(String name , int age) { // 2 parameterisec constructor    (String name , int age) // ese hi kitne b constroctor bna skete h 
		this.name = name; // class ke data member me set krne ke liye  //agar "Person_Client" wali class se "parameterised CONSTRUCTOR" wala code commentin krde then 'name' me " Kunal" print hoga 'fun' function call hokr
		this.age = age;   // class ke data member me set krne ke liye  //agar "Person_Client" wali class se "parameterised CONSTRUCTOR" wala code commentin krde then 'age'  me   "45"   print hoga 'fun' function call hokr
	}
	
//-----------------------------------
	
	public void fun() {
		String name = "Neelu";  // if we use 'this' key word here (eg -> this.name) then 'person client' sb jgh name me Nilu hi ayega
		int Adhar_no = 8739370; // isme this. nhi lgega bcos ye function ka local veriable h and // 'name and age' class ke data member h isliye usme 'this.' lgega //Adhar_no ye function ka local veriable h
		System.out.println(this.name +" "+ this.age+" "+Adhar_no); //this. keyword is used to get the class ka data member
	}
	
	//	ENCAPSULATION -> see in notebook //iski help se hm person client ke data members ko access kr skte hai even wo private ho fir bhi // upr source pr click krke generate getter and setter pr click krna hai then getter and setter wala code generate or write ho jayega
	
	public void SetName(String name) {   //setter -> set name ka setter
		this.name = name;
		
	}
	public void SetAge(int age) {        //setter -> set age ka setter
		this.age = age;                  
		
	}
	public String getname() {            //Getter -> get name ka getter
		return this.name; 
	}
	public int getAge() {
		return this.age;                 //Getter -> get age ka getter
       // encapsulation ends here
	}
}
//--------------------------------------

//jbtk hm apne behalf pr java me constroctor nhi bnate then java khudse  ek default constructor bnake deta hai
//3 DEFAULT CONSTROCTOR =>  
//                        public Person(){
//                         }
// // Person() -> ye apne ap me default constructor hai
// and jab hm consteroctor bnate hai then java apne behalf pr constroctor  nhi bnaata

//  Tasks performed befor Constructor :-
// Step 1 Memory Allocation
// Step 2 Parsing
// Step 3 Constructor


// access modifier => private and public












