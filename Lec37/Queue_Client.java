 package Lec37;

public class Queue_Client {

	public static void main(String[] args) throws Exception {

//		Queue qq = new Queue(14);       //size of array given by user or through Queue_client // isme 14 dalne se queue ka size 14 ho jayega
		Queue qq = new Queue();         //Yha Queue ka size by default 5 rhega bcoz hmne koi size nhi diya and 'queue class' me made by us wala size 5 rkha h

		qq.Enqueue(10); // Enqueue method ko call kr rhe h jha ye hmare "qq" name ke queue me 10 ko dal dega
		qq.Enqueue(20); // Queue class me "Enqueue method" ki help se data ko Queue me dal kr rhe h		
		qq.Enqueue(30); 
		qq.Enqueue(40);
//		qq.Enqueue(50);
		
		qq.Display(); //upr wale 4ro elements print honge
		
		System.out.println(qq.Dequeue());//10 nikl jayega
		System.out.println(qq.Dequeue());//20 nikl jayega
		
		qq.Display(); //ab 30 , 40 bchenge
		
		qq.Enqueue(60); // 30 , 40 ke bd 60 add hoga
		qq.Enqueue(70); // 30 , 40 ,60 ke bd 70 add hoga
		qq.Enqueue(80); // 30 , 40 , 60, 70 ke bd 80 add hoga
		
		qq.Display();   // 30 40 60 70 80 print hoga

	}

}
