package Lec50;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Employees {

	String name;
	int salary;

	public Employees(String name, int salary) { // constructor bna diya
		this.name = name;
		this.salary = salary;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();    //for i/p of x
		int n = sc.nextInt();    //for i/p of n
		
		Employees[] emp = new Employees[n];    // emp name ka new object bna liya n size ka
		for (int i = 0; i < emp.length; i++) { // jb tk i emp ke length times nhi chlta tb tk niche wala task perfor kr
			String str = sc.next();            // name ka i/p lene ke liye
			int s = sc.nextInt();              // salary ka i/p lene ke liye 
		
			emp[i] = new Employees(str, s);    // hr iteration pr employee ka name and salry ka data aega
		}
		//----------------
		Arrays.sort(emp, new Comparator<Employees>() { //Arrays.sort krke sort krenge  // new Comparator  <- is for iss method ko comparison ka logic dene ke liye and ye 2 chijo ko compare krta h // <Employees>  <- it means ki Employees class ka data compare krna h jisme  (name(int) and salary(String)) given hogi        
			@Override
			public int compare(Employees o1, Employees o2) {  // compare krne ke liye logic dediya by @Override //o1  and  o2 employee h jinke b/t comparison honge
				if (o1.salary == o2.salary) {         //agar 2 bando ki salary same h then
					return o1.name.compareTo(o2.name);//name ke basis pr compare kr
				} else {                              //warna
					return o2.salary - o1.salary;     //jiski salary jada h use pehle rkhde rank wise
				}
			}
		});
        //----------------
		for (int i = 0; i < emp.length; i++) { // print krne ke liye loop
			if (emp[i].salary >= x) {          // jin employee ki salary x se greater h 
				System.out.println(emp[i].name + " " + emp[i].salary); // unka name and salary print krde
			}
		}
	}
}
// input below
//79
//4
//Eysha 78
//Bob 99
//Susuka 86
//Akash 86

// Question explanation
// i/p me x and n denge jisme x max salary btaega jha jinki salary x se jada hogi sirf unhe print krna h & "n" number of i/p of employee btaega, jitna n hoga utne hi employees honge
// then n ki jitni value hogi utne employee ka name and salary i/p dena h 
// then o/p me jiski salay sbse jada hogi usko top pr rkhna h ranking wise
// and agar same salary wale do bnde h then unko name ke according lexical count wise sort krna h and print krna h

//79        -> ye (X) h means agar kisi ki salary 79 se km h then use add/print nhi krna
//4         -> it means 4 employees ke name and salary ka data i/p denge niche
//Eysha 78  -> employee name and salary
//Bob 99
//Susuka 86
//Akash 86










