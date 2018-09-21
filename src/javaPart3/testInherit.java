package javaPart3;

public class testInherit {

	public static void main(String[] args) {
		Honda honda = new Honda();
		honda.start();
		honda.stop();
		honda.refuel();
		honda.serving();
		
		Car c1=new Honda();
		c1.start();
		c1.stop();
		
		/*Honda h1 = (Honda) new Car();
		
		h1.start();*/

	}

}
