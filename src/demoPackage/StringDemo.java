package demoPackage;

import java.text.StringCharacterIterator;

public class StringDemo {

	public static void main(String[] args) {
		String str = "Sample";
		
		int stringLength=str.length();
		System.out.println(stringLength);
		
		String str1 = "Sample1";
		
		if (str1 == str){
			System.out.println("Both are same"+str1 + str);
		}
		
		if (str1.equals(str))
		{
			System.out.println("Ok");
		}else
		{
			System.out.println("Nok");
		}
	

	}

}
