package Lec7;

public class Data_Type_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch = '9';
		System.out.println(ch); //9
		System.out.println((int)(ch)); //57//It is typecased to print integral value of 9 
	
		char c= '0';
		System.out.println((int)(c));//48 //integral value of 0
	
		int i=78;
		System.out.println((char)(i));//N // int ko char me typecast kiya h
	
		
		char chh = 'c';
		System.out.println(chh);//c
		chh = (char) (chh+1); // next numeric value add hogi
		System.out.println(chh); //d
		chh++;
		System.out.println(chh);// chh++ se d ke baad e print hoga
		
		System.out.println(ch+chh);// dono ka ASCII(unicode) value add hoke print hoga eg:-158
		
		
		
	}

}
