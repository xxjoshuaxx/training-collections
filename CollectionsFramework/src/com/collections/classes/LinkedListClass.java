package com.collections.classes;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListClass {
	public static void main(String args[]) {
		 LinkedList list= new LinkedList();

		 list.add("A");
		 list.add("B");
		 list.add("C");
		 list.add("D");
		 
		 System.out.println("Before add " + list);
		 list.add(2,"BC");

		 System.out.println("After add " + list);
		 list.set(2, "Max");
		 System.out.println("After set " + list);

		 
	}
}
