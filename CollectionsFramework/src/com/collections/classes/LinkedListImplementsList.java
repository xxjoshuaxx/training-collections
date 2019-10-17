package com.collections.classes;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListImplementsList {
	public static void main(String args[]) {
		 ArrayList<String> list = new ArrayList<String>(); 	

	list.add("A");
	 list.add("B");
	 list.add("C");
	 list.add("D");

	 
	 LinkedList a = new LinkedList(list);
	 System.out.println(a.getFirst());
	}
}
