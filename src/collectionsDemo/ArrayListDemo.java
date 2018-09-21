package collectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		
		ar.add(10);
		ar.add(40);
		System.out.println(ar.size());
		
		System.out.println(ar.get(0));
		
		for (int i=0;i<ar.size();i++){
			System.out.println(ar.get(i));
		}
		
		ArrayList<Integer> intar= new ArrayList<Integer>();
		
		intar.add(5);
		
		intar.remove(0);
		System.out.println(intar.size());
		
		//intar.add("se");
		
		//ArrayList<E> ar4=new ArrayList<E>();
		
		Employees emp1 = new Employees(1,"Raj",35);
		Employees emp2 = new Employees(2,"vijay",39);
		Employees emp3 = new Employees(3,"abc",41);
		
		ArrayList<Employees> ar1= new ArrayList<Employees>();
		
		ar1.add(emp1);
		ar1.add(emp2);
		ar1.add(emp3);
		
		Iterator<Employees> it = ar1.iterator();
		
		while(it.hasNext()){
			
			Employees emp= it.next();
			System.out.println(emp.age);
			System.out.println(emp.empid);
			System.out.println(emp.empname);
			
			
		}
		
		
		Employees emp4 = new Employees(1,"Rajkumar",35);
		Employees emp5 = new Employees(2,"vijayarangan",39);
		Employees emp6 = new Employees(3,"def",41);
		

		ArrayList<Employees> ar2 = new ArrayList<Employees>();
		
		ar2.add(emp4);
		ar2.add(emp5);
		ar2.add(emp6);
		
		
		Iterator<Employees> it1 = ar2.iterator();
		
		while(it1.hasNext()){
			Employees emp8 = it1.next();
			
			System.out.println(emp8.empid);
			System.out.println(emp8.empname);
			System.out.println(emp8.age);		
		}
		
		ar2.addAll(ar1);
		
		ar2.retainAll(ar1);
		
		System.out.println("-------------------------");
		
		it1 = ar2.iterator();
		
		while(it1.hasNext()){
			Employees emp8 = it1.next();
			
			System.out.println(emp8.empid);
			System.out.println(emp8.empname);
			System.out.println(emp8.age);		
		}
		
		
		
	}

}
