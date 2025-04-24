package Lec20;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = 2;
//		 int b =5;
//		 System.out.println(pow(a,b));
//	}
//	public static int pow(int a, int b) {
//		if (b==0) {
//			return 1;
//			
//		}
//		 int ans = pow(a, b-1);
//		 return ans*a;
		
//		---------------------------
		
//		int n =5;
//	}
//	public static int fac( int n) {
//		if (n==0) {
//			return 1;
//		}
//		int fn = fac(n-1);
//		return fn*n;
		int n =5;
		pd(n);
	}
	public static void pd(int n) {
		if (n==0) {
			return;
		}
		System.out.println(n);
		pd(n-1);
		
	}
		
	}
	
	



