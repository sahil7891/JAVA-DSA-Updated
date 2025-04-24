package Lec29;

public class N_Qeens {  //LeetCode 52

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		boolean [][] board = new boolean[n][n];  //boar n*n ki matrix h
	
		PrintPath(board,0,n);
	}
	public static void PrintPath(boolean [][] board, int row , int tq) { // row - 0 // tq - 4queen
		//tq(total queen) = n(4)
		if(tq==0) { //base case where tq 0 hote hi possible o/p ayega
			Display(board); //base case where tq 0 hote hi "Display(board)" ki call jyegi and possible o/p ayega then wapas recursive call ke ps return ho jayega
			return; //then wapas recursive call ke ps return ho jayega
		}
		if (row==board.length) { //range ke bhr na aye place queen
			return;
		}

		for (int col = 0; col < board.length; col++) { //bloard ki jitni length hogi utni recursive call lgegi
			if(isitpossible(board,row,col) == true) {  //see in isitposible methode //agr yha queen place kr skte h then agar ye true hoga then niche wali line chlegi
				board[row][col]=true;       //agr 1 queen place ho gyi then niche
				PrintPath(board,row+1,tq-1);// queen -1 hoga //upr ke 4ro line and upr wali dono if wali line itreat ho rhi hai code understand krne ke liye upr ki 4line dekna call stack bhi 4ro line se bnegi
		
				board[row][col]=false; //undo//backtracking bcoz 1st possible o/p ke bd next possible o/p ke liye empty matrix chahiye hogi
			}
		
	}		
}
	public static boolean isitpossible(boolean[][] board, int row, int col) { //see in notebook

		//upper case
		int r =row;
		while(r>=0) {                 // queen ke uper in every row
			if(board[r][col]==true) { // board[r][col]==true -> agr queen ke upr dusri queen ka area hua then ye true hoga and return false hojayega and arg nhi hui then furthe age ka code process hoga
				return false ;
			}
			r--;
		}
		//left diagnol
		 r =row;
		int c =col;
		while(r>=0 && c>=0) {
			if(board[r][c]==true) {
				return false ;
			}
			c--;
			r--;
		}
		//right diagnol
				 r =row;
				 c =col;
				while(r>=0 && c<board.length) {
					if(board[r][c]==true) {
						return false ;
					}
					c++;
					r--;
    	}
				return true;
	}
	public static void Display(boolean[][] board) {
		// TODO Auto-generated method stub
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
			}
			System.out.println("*******************");
			}
		}
	

// o/p me jah jha true h wha wha queen place kr skte hai
//niche o/p me 4/4 ki matrix h jha true and false every cell ko denote kr rhe hai
//false true false false 
//false false false true 
//true false false false 
//false false true false 
//*******************
//false false true false 
//true false false false 
//false false false true 
//false true false false 





