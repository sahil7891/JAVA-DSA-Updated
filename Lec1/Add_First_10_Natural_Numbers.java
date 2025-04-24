package Lec1;

public class Add_First_10_Natural_Numbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int i=0;
		int sum = 0;
		while (i<=n) { // hr iteration me i = 1 2 3 4 5.... hote rhega
			sum += i; //OR we can write --> sum = sum+i;

			i =i +1;
		}
		System.out.print(sum); //Output:- sum of 1st 10 natural no. eg:- +1+2+3+4+5+6+7+8+9+10 =>55
    }
	
}