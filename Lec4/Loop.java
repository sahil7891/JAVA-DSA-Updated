package Lec4;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1 = 0, n2 = 1, n3, i, count = 6;
		System.out.print(n1 + " " + n2);// Step1 -> First printing 0 and 1

		for (i = 2; i < count; ++i) // i=2 and i is less than count(6) 
		{
			n3 = n1 + n2; //Step3 -> 2
			System.out.print(" " + n3); // Step2 ->print 1  //Step4 -> print 2  and so on
			n1 = n2; //now n1 = 1
			n2 = n3; //now n2 = 1
		}
	}
}
