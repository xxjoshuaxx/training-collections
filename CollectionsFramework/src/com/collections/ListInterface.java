package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {
	public static void main(String args[]) {
		//Initializing the ArrayList using add()
		List <String> list = new ArrayList();	
		list.add("A");
		list.add("B");
		list.add("C");
		
		System.out.println("List 1 : "+ list);
		
		List <String> list2 = new ArrayList();
		
		list2.add("D");
		list2.add("E");
		list2.add("F");
		
		System.out.println("List 2 : "+ list2);
		
		list.add(1,"X");
		System.out.println("List 1 after adding X on position 1: "+ list);
		
		list.addAll(2, list2);
		System.out.println("List 1 after adding items in list 2 to list 1 at position 2 : "+ list);
		
		System.out.println("Element at position 2 : "+ list.get(2));
		System.out.println("Index of \"X\" : "+ list.indexOf("X"));
		
		list.add("X");
		System.out.println("Last Index of \"X\" after appending \"X\" to the list : "+ list.lastIndexOf("X"));
		
		String s = list.remove(2);
		System.out.println("List 1 after removing element at position 2: "+ list);
		System.out.println("Item removed was : "+ s);
		
		list.replaceAll(e->e.toLowerCase());
		System.out.println("List after applying unary operator to replaceAll: "+ list);
		
		String oldValue = list.set(1,"New");
		System.out.println("Old Value "+  oldValue + " replaced with \"New\" at index 1: "+ list);
		
		List<String> list3= list.subList(1, 3);
		System.out.println("Sub list from positions 1 to 3: "+ list3);


		//List<String> list3 = List.of("One", "Two"); // Java 9
		
		

	}

	
}
