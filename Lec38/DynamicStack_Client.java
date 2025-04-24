package Lec38;

public class DynamicStack_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DynamicStack ds = new DynamicStack();  // DynamicStack<-- ye --> Stack class ki properties use kr rhe h and hmara wala --> ( ds ) --> DynamicStack ki properties ko use kr rha h means 3no apas me linked h      
		ds.push(10);
		ds.push(20);
		ds.push(30);
		ds.push(40);
		ds.push(50);
		System.out.println(ds.peek()); //stack me peek pr 50 h yha tk
		ds.push(60);
		
		ds.Display();
		
		ds.push(100);
		ds.push(200);
		ds.push(300);
		ds.push(400);
		ds.push(500);
		
		ds.Display(); // now stack me 60 ke bad 100 200 300 400 500 add hojaega

	}
}
// now ye stack dynamic h jisme elements ke according stack ka size increase ho rha hai



