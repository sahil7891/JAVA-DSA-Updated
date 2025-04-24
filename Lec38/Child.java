package Lec38;
  
public class Child extends Parent {  //****extends Parent - ye line likhne se child class parent class ki properties ko access kr paega
	int d= 2;     //data member  
	int d2 = 20;  //data member  
	
	@Override            //@override likhane se ye ensure hota h ki same name ka function parent class me bhi exist krta h  wrna error dega for  eg:- fun name ka function also exist in parent class // agr fun ke bdle kuch or likhenge then error dega
	                     //@override ki helip se ye "fun" name ka function  ko client me jb call krenge then child and parent class me se @override hokr  child class ka "fun" wala function call hoga isliye @Override fun wale function ke upr likha h
	                     //@Override sirf "fun" function ko check krega fun2 ko nhi krega because @Override fun function ke upr likha h && it will also check ki ye fun function dono child and parent class me exist krta h ya nhi 
	
	public void fun() {  //parent class me bhi same function h isliye @Override hokr Client class me fun wale function parent class ke bdle child class wala method call hoga eg:- client class me fun function me ye print hoga->"Fun In Child" print hoga  
		System.out.println("Fun In Child"); 
		
	}
	public void fun2() {
		System.out.println("Fun2 In Child");
		
	}

}
