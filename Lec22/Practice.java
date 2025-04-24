package Lec22;

public class Practice {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int n =3;
//		ct(n,"");
//		
//	}
//	public static void ct(int n, String ans) {
//		if (n==0) {
//			System.out.println(ans);
//		}
//		ct(n-1,ans+"H");
//		ct(n-1,ans+"T");
//		--------------------------
//		int n = 4;
//		System.out.println(bp(n,0," "));
//	}
//	public static int bp(int end, int cr, String ans ) {
//		
//		if(cr==end) {
//			System.out.println(ans);
//			return 1;
//		}
//		int fp = bp(end,cr+1, ans+1);
//		int sp = bp(end,cr+2, ans+2);
//		int tp = bp(end, cr+3, ans +3);
//		return fp+sp+tp;
		
		//---------------------
//		int n = 4;
//		System.out.println(bp(n,0," "));
//	}
//	public static int bp(int end, int cr, String ans ) {
//		
//		if(cr==end) {
//			System.out.println(ans);
//			return 1;
//		}
//		if(cr>end) {
//			return 0;
//		}
//		int count = 0;
//		for (int dice=0; dice<=3; dice++) {
//			count = count + bp(end, cr+dice, ans+dice);
//		}
//		return count;
//		}
//		
//	}
		//----------------------------
	

		int n = 3;
		bp(n,0,0,"");
	}
	public static void bp(int end, int op,int cl, String ans ) {
		
		if(op==end && cl==end) {
			System.out.println(ans);
			return;
		
		}
		if(op<end) {
			bp(end,op+1,cl,ans+"{");
		}
		if(cl<end) {
			bp(end,cl+1,op,ans+"}");
		}
		
		}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

