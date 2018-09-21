package javaPart2;

public class Car {
	int model;
	int wheel;

	public static void main(String[] args) {
		Car a= new Car();
		Car b= new Car();
		Car c= new Car();

		a.model=2004;
		a.wheel=4;
		
		b.model=2005;
		b.wheel=5;
		
		c.model=2006;
		c.wheel=6;
		
		System.out.println("Before reference change");
		
		System.out.println(a.model);
		System.out.println(a.wheel);
		
		System.out.println(b.model);
		System.out.println(b.wheel);
		
		System.out.println(c.model);
		System.out.println(c.wheel);
		
		a=b;
		b=c;
		c=a;
		
		System.out.println("After reference change");
		
		System.out.println(a.model);
		System.out.println(a.wheel);
		
		System.out.println(b.model);
		System.out.println(b.wheel);
		
		System.out.println(c.model);
		System.out.println(c.wheel);
		
	}

}
