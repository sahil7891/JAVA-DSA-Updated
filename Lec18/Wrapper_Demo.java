package Lec18;

public class Wrapper_Demo {

	public static void main(String[] args) {

		Integer a = 100; //ye wrapper class h then the address created in "heap" memory
		int a1 = 10;     //ye primitive data type h then adress created in "stack" memory
		System.out.println(a); //100
		System.out.println(a1);//10
		
		Short s1 = 78;//Class
		Byte d1 = 19; //class
		System.out.println(s1); //78
		System.out.println(d1); //19
		
//		AutoBoxing and Unboxing automatically converts primitive to objects and vice versa //Wrapper class objects are immutable
		a=a1; //[[Integer(a)---> int(a1) ]] => when primitive ko uske wrapper class me rakhte h then it is called "AutoBoxing" 
		System.out.println(a);//10
		
		Integer ii = 110;
		int i = 10;
		i=ii;// int(i) --> Integer(ii) =>  when wrapper class ko uske primitive me rakhte h then it is called "Unboxing"
		System.out.println(i);//110
		
		//Important
		Integer b1 = 19;
		Integer b2 = 19;
		System.out.println(b1==b2); //true - because their corresponding values(19 and 19) are under "cache" && they points same address for their corresponding - see notebook
		
		Integer c1 = 190;
		Integer c2 = 190;
		System.out.println(c1==c2);// false because the value(190) is out of cache // the value should be b/t -128 to 127
		
		Byte bb=12;
		Byte bb1=12;
		System.out.println(bb==bb1);//true
		
		Long L1 = 128l;
		Long L2 = 128l;
		System.out.println(L1==L2);//false because the value(190) is out of cache
		

	}

}
