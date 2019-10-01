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
	}
}
