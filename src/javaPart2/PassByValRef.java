package javaPart2;

public class PassByValRef {

	int i=50,j=80;
	
	public static void main(String[] args) {

		PassByValRef pbv = new PassByValRef();
		int a,b;
		a=40;
		b=70;
		int sumval = pbv.sum(a, b);
		System.out.println(sumval);
		
		System.out.println("Before Swapping");
		System.out.println(pbv.i);
		System.out.println(pbv.j);
		
		pbv.swap(pbv);
		
		System.out.println("After Swapping");
		System.out.println(pbv.i);
		System.out.println(pbv.j);
		
			
	}
	
	public int sum(int x,int y){
		int z=x+y;
		return z;
	}

	public void swap(PassByValRef s){
		//int l = 0;
		//l=s.i;
		//s.i=s.j;
		//s.j=l;
		s.i=s.i+s.j;
		s.j=s.i-s.j;
		s.i=s.i-s.j;
	}
}
