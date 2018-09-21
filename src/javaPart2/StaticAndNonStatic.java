package javaPart2;

public class StaticAndNonStatic {

	int i;
	static String str="hello";
	
	public static void main(String[] args) {
		
		getVal();
		StaticAndNonStatic.getVal();
		
		StaticAndNonStatic san= new StaticAndNonStatic();
		san.printVal();
		System.out.println(san.i);
		System.out.println(str);
		san.getVal();

	}
	
	public void printVal(){
		System.out.println("printing values...");
	}
	
	public static void getVal(){
		System.out.println("Getting value...");
	}

}
