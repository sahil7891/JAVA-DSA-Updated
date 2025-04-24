package Lec15;

public class String_Demo1 { // Dimo 1 Recorded video h

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "hellow";
		String str1 = "hellow";  //str and str1 both have same address in pull
		System.out.println(str); //hellow
		System.out.println(str1);//hellow
		String st = new String("hellow");  //out of pull bcause new keyword use hua h
		System.out.println(st);  //hellow  
		String st1 = new String("hello");  //out of pull
		System.out.println(st1); //hello
		str = str+"bye";         //now str is out of pull and have diffrent address
		st1 = st1+"bye";
		System.out.println(str);//hellowbye
		System.out.println(st1);//hellobye
		System.out.print(str.length()); //str.length() is the function , the lenght of str will be 9 bcoz bye is added
				
				
				
				

	}

}
