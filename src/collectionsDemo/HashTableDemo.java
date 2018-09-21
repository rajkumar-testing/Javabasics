package collectionsDemo;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable h = new Hashtable();
		h.put(1, "sample");
		h.put(2, "values");

		System.out.println(h.get(1));
		System.out.println(h.get(2));
		
		System.out.println(h.size());
	}

}
