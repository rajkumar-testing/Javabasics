package demoPackage;

public class conditionStmtDemo {

	public static void main(String args[]){
	int i,j,k;
	i=10;
	j=20;
	k=50;
	if((i>j)&(i>k)){
		System.out.println("i is greater than j and k.");
	}else if(j > k){
		System.out.println("j is greater than i and k");
	}else{
		System.out.println("k is greater than i and j");
	}
}
}
