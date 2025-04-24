package Lec38;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		//Case 1   Parent  Parent    see in notebook
		
//		Parent obj = new Parent();   //new Parent(); <-- yha parent class ---> "Parent obj" parent class ki properties ko access kr pa rha h //yha obj b parent class ka h && instanse b parent class ka h isliye sari parent class ki properties access hogi
//		
//		System.out.println(obj.d);  //1
//		System.out.println(obj.d1); //10
//		
//		obj.fun();  //parent class me fun wala function call hoga
//		obj.fun1(); // parent class me fun wala function call hoga

		
//-------------------------------------------------------------------------------
		
//		//Case 2   parent  child    see in notebook
		
		
//		Parent obj = new Child();   // jb ye code chlega then sbse phle JBM me ye ->" new Child();" line chlaegi and STACK me dono class ka blueprint bnega eg:- parent class ka blueprint eg:- d=1 d1=10 ,fun ,fun1   _AND_   child class ka blueprint eg:- d=2 d1=20 ,fun ,fun1  __ dono ki properties HEAP me ajayegi
//		                            // new Child(); <-- yha child class ---> "Parent obj" parent class ki properties ko access kr pa rha h 
//		System.out.println(obj.d);  // 1 //upe wali line me obj parent type ka hai(eg- Parent obj ) isliye parent class me jo "d" ki value hai whi print hogi eg =1 //obj parent class type ka h isliye ye parent class ka sara variable access krega
//		System.out.println(obj.d1); //10 //variable me @Override ko use nhi krte eg-( d d1 d2 ) me , @Override only ( function ) me work krta hai eg- fun , fun1 , fun2
//		
//		System.out.println(((Child) (obj)).d2); //20 //yaha obj ko Child type ka bna diya isliye error nhi de rha (referance ko typecast kiya h)  //esa hmse isliye likha h bcos "run time(JBM) pr child class and parent class dono ko access mil rha hai"
//		System.out.println(((Child) (obj)).d);  // 2 //or u can say yaha obj ko Typecast krke child me convert kr diya wrna pehle obj parent type ka th isliye typecast krna pda wrna error ata // child class ke variables ko run time me JBM ke through access kiya ja skta h***		
//		
//		obj.fun();                  // yha sbse phle "new child();" wali line chlegi and and Child class ke blueprint me check krega ki wha fun name ka function h ki nhi and hoga toh @Override ki help se child class ka fun wala function chlega and pritn hoga//yha "methode overriding" ka concept use ho rha hai isliye child class ko reflect kr rha h 
//	              	                // see child class me fun wale function me commente out wali line me @Override ko explain kiya h
//		obj.fun1();                 // child class me jb @Override check kraga ki usme fun1 name ka function h ki nhi then child class me fun1 function nhi h isliye parent class me check krke fun1 fuction print krega 
//		
//		((Child) (obj)).fun2();     // yaha bhi obj ko Typecast krke child me convert kr diya //typecast kiya bcos child class me @Override kiya h and parent class me fun2 name ka function nhi h 
		                            // Typecast krna pd rha h wrna compilation error dega because code likhte time control compiler ke ps hota h and code run hote time control jbm ke ps isliye jbm code chla dega // agar code likhte time control complier ke ps nhi hota then ""obj.fun2"" ye bhi likh sakte th      
		
//Case 2 //jb hm code likhte h then pura control compiler ke pas hota hai
//Compiler always LHS(Left hand side) dekhta hai eg:- Parent obj  // isliye obj parent type ka h
//Compiler code ka grrametical error dekhta hai  eg- synthetic error eg:- e==c  and etc..
		
//Case 2 // and jb hm code run krte hai then pura control jbm ke pass hota hai
//JBM always RHS(Right hand side) dekhta hai eg:- new Child();
		
// Methode "@Override" INHERITANSE ke case me use hota h two different class ke bich me //Rule 1 -> same name ka function child and parent class me hona chahiye // child class ka function parent class ke function ko @Override krta h bcoz child class me "Child extends Parent" likha h
//List<> ll = new Arraylist   // ye 2nd case ka eg h//yha List ==> PARENT h &&  Arraylist ==> CHILD hota h

				
//--------------------------------------------------------------

		
//		//Case 3  seen in notebook  //******* this case is invalid -- see below
		
//		Child obj = new Parent();   // new Parent(); <-- idhar Parent class ---> "Child obj" child class ki properties ko access Nhi kr skta isliye ye case invalid h
//		
//		System.out.println(obj.d);
//		System.out.println(obj.d1); //parent class ko access kr rha hai  //10
//		System.out.println(obj.d2); //child class ko access kr rha hai   //20  // **yha run time error ajaega bcos "new Parent();"<-- ye child class ki property access nhi kr skta bcos "Child extends Parent" sirf child class hi parent class ki property access kr skta hai -- now that is the reason this case is not possible
//		                            //compile time error is always better than run time error  //******* this case invalid
//		obj.fun();                    
		 
	
//------------------------------------------------------------------	
	
		//Case 4  seen in notebook  
		
		Child obj = new Child();
		System.out.println(obj.d);   //2
		System.out.println(obj.d1);  //10 , new Child(); yha child class parent class ko inherit(parent ki property access) kr rha h eg:-" new Child();" isliye d1 me 10 print hoga
		System.out.println(obj.d2);  //20
		System.out.println(((Parent)obj).d);  // (((Parent)obj).d)  yha obj ko typecast krke parent type ka bna diya ab parent class wala d print hoga eg:->1

		obj.fun();   // new Child() isliye child wala fun name ka function call hoga
		obj.fun1();  // child me fun1 name ka function nhi h isliye parent class me check krke fun1 ko print krega
		obj.fun2();  // child class ka fun2
	
	}

}































