package Lec38;

public class Student {
	
	String name;
	int age;
	static int count = 0;
	
	public  Student() {
		count++;
	}
	public  Student(String name, int age) {
		
		this.age = age;
		this.name = name;
		count++;

		
	}
	@Override
	public String toString() { //yha toString methode ko override kiya hai // ye likhne se Student_Client class me- syso(s) me jo print ho rha tha (eg:- " Lec38.Student@4517d9a3") wo print nhi hoga  , ab iske bdle content print hoga(eg:-Ram Lal 78) 
		return this.name +" " + this.age;
		
	}
	public static void Hellow() {
		System.out.println("Hey");
		//Static method sare object ke liye common ho jara h
		//static function ko override nhi kr skte

		
	}
	static {       //****this is called = "static block"
		System.out.println("In Static"); // ** programm me sbse phle jbm "static block" wale code ko exicute krta h means isme jo code likha hoga wo pehle print hoga(chlega)
		
	}

}






















