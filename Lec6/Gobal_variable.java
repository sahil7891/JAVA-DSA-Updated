package Lec6;

public class Gobal_variable {
	static int val=100;      //In this the "val" is Global variable which can be accessed in every function, Global variable bnane ke liye "Static" lgana pdta h       
 

	public static void main(String[] args) {

		System.out.println("hii"); //hi
		int a= 5;
		System.out.println(val);    //100
		System.out.println(add(a,45)); //50-3= 47
		System.out.println("Bye");
		System.out.println(val);//105
		
	}
	
	public static int add(int a,int c) {
		int x=a+c;             //50
		System.out.println(c); //45
		int val = 90;
		Gobal_variable.val +=5;//Gobal_variable used //105
		return x-3;            //50-3 = 47
	}

}
