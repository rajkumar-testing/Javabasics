package javaPart2;

public class WrapperClassDemo {

	public static void main(String[] args) {
		
		String str="100";
		System.out.println(str+20);
		
		int l = Integer.parseInt(str);
		
		System.out.println(l+10);
		
		String str1="true";
		boolean c=Boolean.parseBoolean(str1);
		System.out.println(c);
		
		String str2="10.01";
		double d=Double.parseDouble(str2);
		System.out.println(d);
		
		int i=5;
		boolean s=true;
		char se='c';
		double dd=99.99;
		float ff= (float) 3.2;
		String.valueOf(i);
		String.valueOf(s);
		String.valueOf(se);
		String.valueOf(dd);
		String.valueOf(ff);
		
		String chk= "d";
		
		int val= chk.indexOf(chk);
		
		String.valueOf(val);
		
		System.out.println(chk.indexOf(chk));
		
		String myval="123ta";
		
		Integer.parseInt(myval);
		

		
		
		
		
		
		
		
		
		

	}

}
