package Lec20;

public class Print_Decreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		PD(n);
	}
	public static void PD(int n) { // void me last me return krne ki need nhi hai  //public static void -> in this automatic return hota h main method me
		if(n==0) {
			return; // return when n=0 then "return ki wjh se niche ki line nhi chalegi" and code end hojaega
		}
		System.out.println(n); //syso wali line recursion ke uder hai isliyre starting se print krta hua jayega
		
		PD(n-1);    //recursive call // this is "Tail recursion" bcoz recursive call ke niche koi code wali line nhi h 
		}
	}

//see in notebook
//output = 
//5
//4
//3
//2
//1

