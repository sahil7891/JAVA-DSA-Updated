package Lec37;

public class Stack_Client { //basically hm stack ko array ki help se bna rhe hai bt ye baat hmare client ko nhi pta chalni chahiye

	public static void main(String[] args) throws Exception {

	//	Stack s = new Stack(20); //yha stack ka size 20 h (** made by user**)
		
		Stack s = new Stack(); //yha Stack ka size 5  h//defaul size (**made by us**) in Stack class    //
		                       //** iss class me ye jo line line h eg:-> ""Stack s = new Stack();"" <-- iss line ko hmne "Stack class" me ""public Stack() {"" <--iss line ki help se likh pae h. and ye ->""public Stack() {"" -> jo contructor bnaya h Stack class me. jisme hmne 5 size ka Arayy bnaya tha then niche 
		                       //Stack s = new Stack(); <-- ye "s" name ka new Array bnaega jiski capacity 5 hogi
		                       //and hm iss "s" name ke new Array me jo b tasks perform krenge eg:-push ,pop etc  - wo sb issi "s" name ke arayy me store,insert-etc hoga **But hm ye sab iss-->""Stack s = new Stack();"" cunstroctor ki help se kr pa rhe h jha hm "Stack class" ke methods ko use kr pa rhe h upne push,pop-etc tasks task perform krne ke liye     
		
		s.push(10); //Stack class me "push method" ki help se data ko stack me push kr rhe h
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		
		System.out.println(s.pop()); // pop method ko call kr rhe h jha ye hmare "s" name ke stack se 50 ko nikal dega		
		s.Display();                 // stack print hogi  //ab stack me 10 20 30 40 bchega
		System.out.println(s.peek());// ab stack me peek 40 print hoga bcos 50 ko pop line me extract kr diya h means wo stack se ht gya h
		
		s.push(60); //stack me 40 ke baad 60 add ho jayega
		s.push(70); //stack ka size 5 hai and 60 ke bad 70 ko dalenge toh 'Stack' wale class me push wale code me 'Exception' wali line chl jaegi
		//s.push(70); => iska output => //Exception in thread "main" java.lang.Exception: Sun be pgl hai?, Stack full hogya hai
                                        //at Lec37.Stack.push(Stack.java:26)
                                        //at Lec37.Stack_Client.main(Stack_Client.java:20)

	}

}











