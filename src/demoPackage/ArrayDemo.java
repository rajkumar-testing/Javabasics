package demoPackage;

import java.util.Iterator;

import collectionsDemo.Employees;

public class ArrayDemo {

	public static void main(String[] args) {
		int i[] = new int[3];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		
		System.out.println(i[0]);
		
		boolean c[] = new boolean[2];
		
		c[0]=true;
		c[1]=false;
		
		System.out.println(c[0]);
		
		
		String strval[] = new String[2];
		
		strval[0]= "Hello";
		strval[1]= "world";
		//strval[2]= "Mine";
		
		System.out.println(strval[0]+" "+strval[1]);
		
		for (int k=0;k<strval.length;k++)
		{
			System.out.println(strval[k]);
		}
		
		Object ob[] = new Object[7];
		ob[0] ="Rajkumar";
		ob[1] =1277;
		ob[2] = true;
		ob[3] = 12.44;
		ob[4] = 'c';
		ob[5] = "yes";
		ob[6] = new Employee(1277,"Rajking");
		
		//Employee emp=(Employee)ob[6];
		//Employee emp=new Employee(1277,"Rajking");
		//System.out.println("King values :" + emp.id);
		
		
		
		//System.out.println("King values :" + emp.id + "Name" + emp.name);
		
		System.out.println("Ob length is:"+ob.length);
		
		
		for (int l=0;l<ob.length;l++)
		{
			System.out.println("Object values are :"+ob[l]);
		}
		
		
		//Two-dimesion Array
		
		String x[][] = new String[3][4];
		
		System.out.println("No of Rows :"+x.length);
		System.out.println("No of columns :"+x[0].length);

		for (int a=0;a<x.length;a++)
		{
			for (int b=0;b<x[0].length;b++)
			{
				String value= "X"+a+""+b;
				x[a][b] = value;
				//System.out.println(x[a][b]);
			}
		}
		
		for (int e=0;e<x.length;e++)
		{
			for (int f=0;f<x[0].length;f++)
			{
				System.out.println(x[e][f]);
			}
		}
		
		
		
		

	}

}
