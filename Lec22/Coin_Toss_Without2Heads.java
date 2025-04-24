package Lec22;

public class Coin_Toss_Without2Heads { //means 3no coins ko ek sath toss krne pr 3 me se 2 coin ek sath "H" na ho - with all possiblities

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 3;
		CoinToss(n, "");
	}
	public static void CoinToss(int n , String ans) {
		if (n == 0) {
			System.out.println(ans); // subsequence wale code ki trh print hoga base case hit hone pr
			return;
		}
		
      //if( ans.charAt(ans.length()-1) !='H'){   // iss case me string ka lenght 0 h isliye error dega
		if(ans.length()==0 || ans.charAt(ans.length()-1) !='H') {//!='H' //this line is to check ki last index "H" h ya nhi //length-1 -> last character ko get krne ke liye use krte h  
		
	    CoinToss(n-1, ans +"H");
	    }
	    CoinToss(n-1, ans +"T");
		
	}
}
//in this code 3 coins ko ek sath toss krne pr 2 br head nhi ana chahi <- iski all possibilities ptani h