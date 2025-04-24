package Lec51;

public class Heap_Client {
	
	public static void main(String[] args) {
		Heap hp = new Heap();
		hp.add(10); // input me add method ko call kr rhe h and add method run hone pr upheapfy method b run hoga
		hp.add(20);
		hp.add(30);
		hp.add(40);
		hp.add(50);
		hp.add(60);
		hp.add(70);
		System.out.println(hp.getmin()); // getmin method call hoga
		hp.display();                    // display method call hoga
		
		System.out.println(hp.remove()); // remove method call hoga
		System.out.println(hp.remove());
		hp.display();

	}

}
