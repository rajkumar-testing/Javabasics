package samples;

public class FinalConcepts {
	
	//Final is a keyword
	//Over variable, it acts as constant which is nonchangeable value
	//Over Method, it acts to prevent from overriding
	//Over class, it acts to prevent from extending
	//Finally is the block of statement that will be executed once the try with catch or try is executed.
	//Finalize is the method which will be automatically called while there is any 
	//non-referencing object is found in current class to release the memory
	public void finalize(){
		System.out.println("finalize");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		division();
		
		FinalConcepts f1 = new FinalConcepts();
		f1=null;
		
		System.gc();

	}

	
	public static void division(){
		int i=10;
		try{
			System.out.println("Inside the try block");
			int k=i/10;
		}/*catch(Exception e){
			System.out.println("Inside catch");
		}*/
		finally
		{
			System.out.println("inside the finally block");
		}
	}
}
