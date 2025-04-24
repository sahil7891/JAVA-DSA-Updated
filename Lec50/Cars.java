package Lec50;

  //public class Cars implements Comparable<Cars> { // Comparable ye 2 chijo ko compare krta hai  //♂all about the " Comparable Interface" // implements Comparable<Cars>  - likhne ke bd change nhi kr skte

    public class Cars { // Comparable ye 2 chijo ko compare krta hai  //all about the " Comparable Interface"  // ♣ this code is for "CarCompareterSpeed" class //all about the "COMPARATOR"  // ▬implements Comparable<Cars> - bina lidkhe agrument me changes mar skte h(comparator)   
	
	int price;      // data member
	int speed;      // data member
	String color;   // data member
	
	public Cars() { // constructor	
	}	
	public Cars(int price, int speed, String color) { //parameterized constructor	
		this.price = price;
		this.speed = speed;
		this.color = color;	
	}
	                // jb address ke bdle content print krana hota h then 2 string method ko override krte h
	@Override       // toString methos ko @Override kr diya ab content print hoga
	public String toString() {
		return "Price :"+this.price   +  "  Sd:"+this.speed+    "  Color:"+this.color;
		
	 }
 }
    
//----------------------------
	  
//CarClient class me |||||Sort(cr , new CarCompareterSpeed());|||| wali and ese hi price and color sari lines ko comment out krne pr ye niche wali lines chlani hai for understanding  Comparable Interface

//    	@Override                     //implements Comparable<Cars> { <- upr yel likhne ke bad - add unimplemented method - pr click krke - (compareTo) iss method ko body dedi
//	public int compareTo(Cars o) {    //compareTo interface ka kam h ki kisi class me impllemnt krke kisi class me comparable ka logic dalte h taki jb ko i kisi class do sort kr then uske ps comparison ka logic ho        
//		// TODO Auto-generated method stub
//		
		// return this.speed-o.speed;            //** Speed ke basis pr sorting krne ke liye  means jiski speed jada uski priority jada hogi and wo below pr ayega // this.speed   <- is for "This"   &&&&&   o.speed      <- is for "Other"  // Marks wala comparison see in notebook
		// return o.price-this.price;            //** price ke basis pr sorting krne ke liye  means jiski "price" jada uski priority jada hogi and wo top pr aega  // o.price      <- is for "Other"  &&&&&   this.price   <- is for "This"   //"Rank" wala comparison see in notebook
		// return this.color.compareTo(o.color); //yha color ke alphabatic letter ke basis pr sort hoga
//	  }
// }










