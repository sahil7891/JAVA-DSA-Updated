package Lec51;

import java.util.ArrayList;

public class Heap {  // This code is for creating "Min Heap"

	private ArrayList<Integer> data = new ArrayList<>(); // ek data name ka Integer ka ArrayList leliya 
	
	public void add(int item) {// item add krne ke liye 
		
		this.data.add(item);   // ye ArrayList me piche piche add krega
		
		upheapfy(this.data.size()-1); // ye method input wale data ko "Min Heap" wale format me lane ke liye likhe h // data.size()-1 <- it means ki Last wala "index number" pass kr rhe h argument me
	}
	private void upheapfy(int ci) {   // ye method input wale data ko "Min Heap" wale format me lane ke liye likhe h
		
		int pi = (ci-1)/2; // to know parent ka index no. //see in notebook
		if(this.data.get(pi)>this.data.get(ci)) { // agar parent(pi) ka data is Bigger than Child(ci) ka data then swaping krenge see below
			Swap(pi, ci);  // niche Swap wale method me pi and ci ka index bhejenge
			upheapfy(pi);  // recursive call // pi again upr "if" wali statement me pass hoga to check ki still parent(pi) ka data Child(ci) ke data se bda h ki nhi and agar true hua then again Swap wala code chlega  // iss recursive call me "base case" ka need nhi h   
		}
	}
	public void Swap(int i , int j) {//Swap krne ka code alag se likha because ye code freaquently use hoga // i= pi  , j= ci
		  //niche pi & ci wale index ke data ko ith and jth me yad rkh liya
		int ith = this.data.get(i);  // pi(i) th index ko yad rkhne ke liye
		int jth = this.data.get(j);  // ci(j) th index ko yad rkhne ke liye
          //niche dono index ke data ko swap kr diya 
		this.data.set(i, jth);       // it means pi(i) wale index pr jth wala data set krde
		this.data.set(j, ith);       // it means ci(j) wale index pr ith wala data set krde	
	}
	
	//------------------------------
	
	public int remove() {
		Swap(0, this.data.size()-1); //yha Swap method ki help se 0th index and last index ki swapping krdi because esa krne se comlexity - "O(log N)"  hojaegi and agar esa nhi krte then comlexity "O(N) hoti
		int rv = this.data.remove(this.data.size()-1); //and last wale index ke date ko remove kr diya
		downheapify(0); // now downheapify method ko call kiya h //and "0th" index argument me bheja h
		return rv;      // remove kiya hua data ko return krdiya 
	}
	private void downheapify(int pi) { //pi 0th index h see upr se "0th" index argument me bheja h
		
		int leftchild =  2*pi+1; //to know  left child no. //see in notebook
		int rightchild = 2*pi+2; //to know right child no. //see in notebook
		
		int mini = pi;  // mini me "pi" wala index rkh diya eg:- 0th index
		
		if(leftchild<this.data.size()  &&  this.data.get(leftchild)<this.data.get(mini)){   //agar leftchild ka data mini se less hai then
			mini = leftchild; // mini me leftchild rkhde
		}
		if(rightchild<this.data.size()  &&  this.data.get(rightchild)<this.data.get(mini)){ //agar rightchild ka da data updated mini se less hai then
			mini = rightchild;// mini me rightchild rkhde	
		}	
		if(mini != pi) {      //agar mini jo pehle "pi" tha mini "pi" ke equal nhi h ,, agar mini - pi ke equal nhi h then it means dono child me se koi ek child "pi" se chota h  and mini ki value update hogyi h - see if wali lines now swapping hogi see below
			
			Swap(mini, pi);   //Swap method ki help se "mini" and "pi" ki Swapping krdi
			downheapify(mini);//now downheapify wale method me argument me "mini" ka index bhejdiya to check ki parent ka data child ke data se small h ki nhi// recursive call and iss recursive call me "base case" ka need nhi h   
		}
	}
	//--------------------------
	public int getmin() {
		return this.data.get(0); // min heap me minimum data 0th index pr hota h isliye - Complexity - O(1)  hogi
	}
	//--------------------------
	public int size() {
		return this.data.size(); // Heap me jitna data hoga Heap ka size bhi utna hi hoga
	}
	//--------------------------
	public void display() {
		System.out.println(this.data); // Heap ka data print krne pr heap print ho jaegi 
	}
}














