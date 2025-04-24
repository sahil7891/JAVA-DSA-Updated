package Lec37;

public class Stack {       // How to imlement STACK (interview ques) // STACK kese banana hai yha below ye code me hm stack bna rhe hai
      
//  int [] data;           // ab ye default variable or access modifier h jo ki sirf same package me access ho stkta ho another packge me access nhi hoga means another class me inherit nhi kr skte	
	protected int [] data; // protected ko Lec38 ke liye use kiye hai see there wrna Stack wale code ke liye private hi better h iss code ke liye ye wali line comment out krdena and niche private wale ko chlana
	
//	private int [] data;   // data name ka array   // ise private bnaya hai taki other class me diricty access na ho and jisse kisi bhi index pr LIFO SIMETRY ORDER mentain ho pae means client class lifo ko change na krpae ,see in oops
	private int top =0;    // class ka data member // top ye bataega ki konse index pr element rkhna hai taki STACK mentain rhe , top 0 se start hoga means (eg - 0th index)

	public Stack() {       //stack constructor  //*********iss line ki help se "Stack_Client" class me ye line-->  "Stack s = new Stack();"  likh pa rhe he
		this.data = new int [5]; // 5 size ka array or capacity is 5  **made by us**
	}
	
	public Stack(int cap) {      // agar user intially hme koi capacity dega client class se then            //*********iss line ki help se "Stack_Client" class me ye line-->  "Stack s = new Stack();"  likh pa rhe he
		this.data = new int[cap];// ham utne size or capacity ka array bna denge          ** made by user**  //**made by us** and ** made by user** dono me se ek use hoga
	}
	
	
	 //-------------------------
	public boolean isEmpty() {   //isEmpty see in notebook
		return top == 0;         //TOP data member hai or u can say 'pointer' & ye btaega ki value or element kha rkhni hai , TOP == peek (see in note book) and top ke upr konsa data ya element rkhna hai ye Top ki help se rkhte h
	}                            //agar top==0 means top 0th index pr hai then it means stack empty hai
	 //-------------------------
	public boolean isfull() {    // see in notebook
		return this.top == this.data.length;      // jab top array ke last index pr pahuck jayega then stack full h
	}
	 //-------------------------
	public void push(int item) throws Exception { // see in notebook(function) //item as a i/p element or data entered by client class hoga 
		
		if(isfull()) { //if stack is full//ye true or false dega stack_Client ko push wali line me
			throw new Exception("Sun be pgl hai?, Stack full hogya hai");  //Exception line likhi h bcos agar stack ke size se jada elements input de diye then ye exception ayga
		}
		
		this.data[this.top] = item; //stack me data rkhenge then
		this.top++;  // top ko ek index age bdha denge taki agla element rkh ske means top ka index increase hote rhega eg 1,2,3.. until limit is reached
	}
	 //-------------------------
	public int pop ()  throws Exception {  // see in notebook(function)
		
		if(isEmpty()) { //yha bhi Exception lgana pdega bcos agr Stack khali hui then stack Client wali class me fir bhi pop ka code likhne Exception a jaye
			throw new Exception("Sun be pgl hai?, Stack Empty hai"); 

		}
		this.top--;      //top= toop-1// top ka 1 index waps jana pdege bcos push wale code TOP++ horha h // TOP jis index pr present hoga wo index khali assume hota hai means waha kuch bhi data dal skte h and privious data apne ap ht jaega(overwriting)
		return this.data[this.top]; // then top ka present index wala data return hojauga
	}
	 //-------------------------
	public int peek () throws Exception{  // see in notebook(function)
		
		if(isEmpty()) { //yha bhi Exception lgana pdega bcos agr Stack khali hui then stack Client wali class me fir bhi peek ka code likhne Exception a jaye
			throw new Exception("Sun be pgl hai?, Stack Empty hai"); 

		}
		return this.data[this.top-1];  // ye btaga ki top pr konsa data hai, top -1 hokr(ek index peche akr) //bcos top++ hokr next index pr chla jata hai and wo index khali hota hai isliye top-1 krne se sabse top pr jo element hota h wo mil jata h

	}
	 //-------------------------
	public int size() {  // see in notebook(function) 
		return this.top;  //top ke index no se pta chl jaega ki kitna size h stack ka bcos top jis index pr hota utne hi element bhi honge
	}
	 //-------------------------
	public void Display() { 
		for (int i = 0; i < top; i++) { //i < top; means if top is 5 then it print 5 times elements
			System.out.print(this.data[i]+" "); //index no. one se print hona start hoga and top wale index tk print hoga bcos i upr 0 h and i top ko represent kr rha h
		}
		System.out.println();
	}

}
//ye static Stack hai means isme Stack ka size fix hai eg:- 5 size ka Stack

//This code is for How to imlement STACK // STACK kese banana hai se below ye code me hm stack bna rhe hai

//Stack -> Stack is the data structure means way to store the data and isme data ko "last in and first out"(LIFO) manner RKHTE HAI
//Array-> me contigius manner me data store krte hai jo ki homoginious type ka hota hai, homoginius mean integer,string,float type ka data





 