package com.collections.classes;

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String args[]) {
		 ArrayList<String> list = new ArrayList<String>(); 	
		 list.add("A");
		 list.add("B");
		 list.add("C");
		 list.add("D");

		 String array[] = new String[list.size()];
		 array = list.toArray(array);
		 for(String str:array)System.out.print(str);	
		 
	
	}


}
