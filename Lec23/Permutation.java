package Lec23;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		printPermutation(str,"");
	}
	public static void printPermutation(String ques, String ans) { //ques me str bhej rhe h // ans me khali string
		//base case
		if (ques.length()==0) {
			System.out.println(ans);
			return;
		}
		
		for(int i =0; i<ques.length(); i++) { // i = 0(a) then pehle ye "a" ke liye sare permutation run krega i++ hokr -- then i=1(b)ke liye alg se purmitation run hoga then -- i++ hokr "c" ke liye           
			                                  //instead of 3 recursive call hmne for loop lga diya     
			char ch = ques.charAt(i); // isme 0th char ajayega eg:-a
			
			String ros = ques.substring(0,i) + ques.substring(i+1); //a ke bad wale char ayenhe eg " bc " // to get ques 
			
			printPermutation(ros, ans +ch); //ros=bc & ans =a then it will be bc,a   where b=0th index and c is 1st index     //bc ,a -- seen in notebook                         
		}

	}

}



