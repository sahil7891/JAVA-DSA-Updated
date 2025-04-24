package Lec25;

public class Queen_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 4;  // size of array/board
		int tq = 2; // no. of queen
		boolean [] board = new boolean[n]; //upr n size ka boolean ka Array/board liya ab by defoult false fil hoga 
		                                   // boolean ke array  me by default false fill hota h// jis jis cell me queen present h wo true hoga baki array ke cell false

		Queen(board, tq,0," ",0);
	}
	public static void Queen(boolean [] board, int tq , int qpsf, String ans, int idx) {
   // tq = no. of queen (n) 2 
   // qpst = 0 means queen placed so far s
   // ans me khaliy string bhej rhe h
   // idx = index no. 0
		if(tq==qpsf) {
			System.out.println(ans);
			return;
		}
		for (int i=idx; i<board.length; i++) { // agr i = idx+1 krte h then recursion call me last me i+1 ke bdle sirf 1 type krna hoga
		 if(board[i]==false) { //if queen is not present // or queen is not placed means F in array cell
			
			board [i] = true;  //then we can place queen there
		    Queen(board,tq,qpsf + 1, ans+"b" +i+"q" +qpsf+" ",i+1); //and the queen is placed there //b is for board see in notebook // i+1 bcoz infinite supply nhi hai
		    board [i] = false;// un do (backtracking) krna  // true(T) ko wapas false(F) kr rhe h // queen is not present or placed krna wapis
		}
		//Queen combination same "/Queen permutation ki trh same h bs isme same permutation print nhi honi chahiye
		//EG. b0q0 b1q1  and b1q0 b0q1 in dono me se koi ek hi print hona chahiye
	}

  }

}











