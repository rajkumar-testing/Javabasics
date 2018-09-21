package javaPart2;

public class OverloadingDemo {

	public static void main(String[] args) {
		OverloadingDemo od = new OverloadingDemo();
		od.calculate();
		od.calculate(10);
		int result = od.calculate(10,20);
		System.out.println(result);

	}
	
	public void calculate(){
		System.out.println("function without any return value and parameters");
	}
	
	public int calculate(int i){
		System.out.println("function with one return value and one parameters");
		System.out.println(i);
		return i;
	}
	
	public int calculate(int i,int j){
		System.out.println("function with one return value and two parameters");
		j=i+j;
		System.out.println(j);
		return j;
		
	}
	

}
