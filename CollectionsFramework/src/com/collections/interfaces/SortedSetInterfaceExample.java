package com.collections.interfaces;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetInterfaceExample {
	public static void main(String args[]) {
		SortedSet<String> sortedSet = new TreeSet();
		sortedSet.add("A");
		sortedSet.add("B");
		sortedSet.add("C");
		sortedSet.add("D");
		sortedSet.add("E");
		
		System.out.println("The Set : " + sortedSet);
		System.out.println("First : " + sortedSet.first());
		System.out.println("Last : " + sortedSet.last());
		System.out.println("Subset : " + sortedSet.subSet("A","D"));
		System.out.println("Head Set ending \"D\" : " + sortedSet.headSet("D"));
		System.out.println("Head Set starting \"C\" : " + sortedSet.tailSet("C"));



	}
}
