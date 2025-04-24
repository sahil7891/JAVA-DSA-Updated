package Lec22;

public class DisePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 3;  //same Board_Path wale code ki trh h bs --> dice<=3;<-- means hmare pass 1,2,3 steps h and -- "n=3" means 1,2,3 ko use krke 3 bnana h o/p me all possible steps btana h    
		                                                                                                 //agar n=2 hota then 1,2   ko use krke 3 bnana hota o/p me all possible steps btana h
		
		System.out.println("\n" + DisePath(n, 0, "")); // "" is string

	}

	public static int DisePath(int end, int curr, String ans) {
		if (curr == end) {
			System.out.println(ans + " ");
			return 1;
		}
		if (curr > end) {
			return 0;
		}
//		int fp = BoardPath(end, curr + 1, ans + 1);//recursive call
//		int sp = BoardPath(end, curr + 2, ans + 2);//recursive call
//		int tp = BoardPath(end, curr + 3, ans + 3);//recursive call
//		
		int count = 0;
		for(int dice =1; dice<=3; dice++) { // loop me 1,2,3 recursive call ke bdle 3 ajayega and loop more than 3 recursive call ke liye use krte h
			
		count = count + DisePath(end, curr+dice, ans+dice); //end, curr + 3, ans + 3 // yha bs 3 ke bdle "dice" likhdenge
		}
		return count;
		}
	}


