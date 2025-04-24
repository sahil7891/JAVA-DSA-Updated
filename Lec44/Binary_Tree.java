package Lec44;

import java.util.Scanner; // tree ka data input dene ke liye

public class Binary_Tree { // sare methods ki "Complexity" -> O(N) ,  because every & each node ko ek br hi visit kr rhe hai
	
	Scanner sc = new Scanner(System.in); // data input dene ke liye
	
	public class Node{ // 3 information rkkne ke liye Node class bnai hai eg:- data , left , right
		
		//see in notebook
		int data;   // data int type ka h isliye usme integer vali value rkhenge 
		Node left;  // left  -> left Node type ka h isliye left me address rkhenge
		Node right; // right -> right Node type ka h isliye right me address rkhenge
		
	}
	private Node root;      //for starting point of tree //root ko private bnaya h taki koi dusri class se ise null na krde jisse pura binary tree loss hojaega             
	
	public Binary_Tree() {  //constructor bna diya   // 1st client class se iss constroctor ko call krenge then private Node CreateTree() method call hoga and return nn hokr CreateTree me root ka address aejaega
		
		root = CreateTree();// ye pehla Node ka address dega and ye CreateTree method se tree ko construct krega            
	}
	
	//-------------------------------
	
	private Node CreateTree() {  // see in notebook // iss method se Tree create krenge  // Complexity :- O(N) ,  because every & each node ko ek br hi visit kr rhe hai		
		
		int item = sc.nextInt(); // data enter kraenge eg:- 10  and item me data jaega eg:- 10 (step 1)
		Node nn = new Node();    // yha "nn" me pehle node ka address (1k) gya h where (nn)data - 0 , left - null , right - null //(step 2)
		nn.data = item;          // nn ke data me 10(item) ajaega  (step 3)
		
		boolean hasLeftSide = sc.nextBoolean(); // see in notebook
	  	 if (hasLeftSide == true) {
				 
			 nn.left = CreateTree(); // nn ke left me data rkhdenge // yha recursive call lg rhi h and jb recursive call lgti then function frame creat hota h  // this will create left subtree(left wale sare tree)
			 
		 }
		 boolean hasRightSide = sc.nextBoolean();  // see in notebook
		 if (hasRightSide == true) {
			 nn.right = CreateTree(); // this will create Right subtree (right wale sare tree)
		 } 
		 return nn;
		 
	}
	
	//-------------------------------
	
	public void Display() { //see in notebook / root node ko access krne ke liye ye method bnaya hai  // Complexity :- O(N) ,  because every & each node ko ek br hi visit kr rhe hai
		Display(this.root); // niche wale display wala call hoga and we can get root node
	}
	private void Display(Node nn) { //nn me root node ka address bhej rhe hai //private bna diya taki ko or access na kr pae
		
		if(nn == null) { //base case
			return;
		}
		String str = " ";    // pehle khali string lenge then  
		str = str + nn.data; // usme data 10 rkh denge
		str = "<----"+str+"---->"; // iss line se str  <----10----> esa bnjaega
		
		if(nn.left != null) { // nn ke left wala data agr null nhi h then 
			str = nn.left.data+str; //nn ke left me jo address h eg:- 10 ka left 2k(2k ka data - 20) eg:- 20+str ==> eg:- 20<----10---->
                                                                                                      //now ab "str" me = 20<----10----> ye store ho jaega
		}else {
			str = "." + str;    // nn ke left wala data agr null h then .+str  //eg:- .<----20 
		}
		//------------------------
		if(nn.right != null) { // nn ke right wala data agr null nhi h then 
			str = str+nn.right.data; //nn ke right me jo address h eg:- 10 ka righy 3k(3k ka data - 30) eg:- str+30// eg:- 20<----10---->30
		}else {
			str =str+"." ;    // nn ke right wala data agr null h then str+.  //eg:- 30----->. 
		}
		
		System.out.println(str); // string pritn krane ke liye eg:- 1st iteration me  "20<----10---->30"  print hoga
		Display(nn.left);  // ye left subtree ke liye recursive call h  // ye left subtree print krega
		Display(nn.right); //ye right subtree ke liye recursive call h  // ye right subtree print krega 	
		
	}
	
	//--------------------
	
	public int max() { //see in notebook // Complexity :- O(N) ,  because every & each node ko ek br hi visit kr rhe hai
		return max(this.root); //root ka adress bhejne ke liye
	}
	private int max(Node node) { //sabse bda node in tree find krne ke liye 
		
		if(node == null) {//base case
			return Integer.MIN_VALUE;
		}
		
		int Lmax = max(node.left);   //recusive call - ye left subtree ka ans dega //Lmax is for (Left max)
		int Rmax = max(node.right);  //recusive call - ye right subtree ka ans dega //Rmax is for (Right max)
		
		return Math.max(Lmax, Math.max(Rmax , node.data)); // ye root node ,, Left subtree ,, right subtree me se jo node sabse bda node hoga use return krega
		
	}
	//------------------------
	
	public boolean find(int item) { // item me jo node find krni h wo denge Client class se // Complexity :- O(N) ,  because every & each node ko ek br hi visit kr rhe hai
		return find(this.root , item); //root ka adress bhejne ke liye
	}
	private boolean find(Node nn, int item) {//client class se upr wala find function call hoga and usme root node ka address h and upr wala niche wale find method ko call krega 
		                                     //Node nn <-isme root node ka address bhejenge  //int item <- isme client class se bheja hua item bhejenge and ye method btaega ki item tree me h ya nhi eg:- true or false
		if(nn == null) {  // agar item nhi mila tree me then
			return false; // false return krde
		}
		if(nn.data == item) { // jha poin kr rhe hai agar wha item wala data mil gya then
			return true;	  // o/p = true
		}
		return find(nn.left, item) || find(nn.right , item); // ye dono recursive call hai // agar left subtree me item mil gya then iski -> " || " help se  right subtree ka call nhi lgega
		
	//---------------------------
	}
	public int height() {  //client class se height method ki call aegi // Complexity :- O(N) ,  because every & each node ko ek br hi visit kr rhe hai
		return height(this.root);	
	}
	private int height(Node node) { // upr wala height method iss wale method ko call dega esa isliye kr rhe hai taki root node ka address get kr ske
		
		if(node == null) { // base case jb node equal to null ho then
			return -1;     // return -1 krne se hm yha single node ki height ko 0 assume kr rhe hai // agar return 0 kiya hota then hm single node ki height ko 1 assume krte
		}
		int lt = height(node.left);  //recursive call for left subtree and ye left subtree ki height btaega
		int rt = height(node.right); //recursive call for right subtree and ye right subtree ki height btaega
		
		return Math.max(lt, rt)+1;   //last me left subtree and right subtree dono me se jiski height jada hogi usme +1 hokr o/p aega
	}
}













