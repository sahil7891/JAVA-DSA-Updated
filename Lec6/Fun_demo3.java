package Lec6;

public class Fun_demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hey");
		
		System.out.println(addtwonumber());//--| to use funtion write this
		int c1=addtwonumber();//               | 
		System.out.print("bye");//             |
        //                                     |
	}   //                                     |
	public static int addtwonumber() {//-------|addtwonumbers is a function name--by using this we dont need to rewrite program
		int a=9;
		int b=8;
		int c=a+b;
	    return c;
	

	}

}
