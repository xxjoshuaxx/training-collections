package com.collections.classes;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSize {
	public static void main(String args[]) {
		 ArrayList<String> list = new ArrayList<String>(2); 	
		 list.ensureCapacity(1);

		 list.add("A");
		 list.add("B");
		 list.add("C");
		 list.add("D");

		
		 System.out.println("Array Capacity" + list.size());
		 list.trimToSize();
		 System.out.println("Array Capacity" + list.size());
	}
}
