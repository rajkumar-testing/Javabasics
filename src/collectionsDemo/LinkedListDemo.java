package collectionsDemo;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("hi");
		ll.add("how r u");
		ll.addFirst("i am new");
		ll.addLast("i am last");
		
		System.out.println(ll.size());
		
		for (int i=0;i<ll.size();i++){
			System.out.println(ll.get(i));
			
		}

		ll.add(1, "Raj here");
		
		for (int i=0;i<ll.size();i++){
			System.out.println(ll.get(i));
			
		}
		
		for (String str : ll){
			System.out.println(str);
		}
	}

}
