package com.collections.interfaces;

import java.util.Set;
import java.util.TreeSet;
import java.util.NavigableSet; 


public class NavigableSetInterfaceExample {
	public static void main(String args[]) {
        NavigableSet<String> navigableSet = new TreeSet<>(); 
        navigableSet.add("A"); 
        navigableSet.add("B"); 
        navigableSet.add("C"); 
        navigableSet.add("D"); 
        navigableSet.add("E"); 
        navigableSet.add("F"); 
        
        System.out.println("The set : " + navigableSet);
        System.out.println("Ceiing C : " + navigableSet.ceiling("C"));
        System.out.println("Descending set : " + navigableSet.descendingSet());
        System.out.println("Floor C : " + navigableSet.floor("C"));
        System.out.println("Head Set at position 3 (including) : " + navigableSet.headSet("C", true));
        System.out.println("Head Set at position 3 (excluding) : " + navigableSet.headSet("C", false));
        System.out.println("Tail Set at position 3 (including) : " + navigableSet.tailSet("C", true));
        System.out.println("Tail Set at position 3 (excluding) : " + navigableSet.tailSet("C", false));
        System.out.println("Higher at C : " + navigableSet.higher("C"));
        System.out.println("Lower at C : " + navigableSet.lower("C"));
        System.out.println("Poll First : " + navigableSet.pollFirst() + " ,Remaining array " + navigableSet);
        System.out.println("Poll Last : " + navigableSet.pollLast() + " ,Remaining array " + navigableSet);
        System.out.println("Sub set between B & E " + navigableSet.subSet("B", false, "E", false));
	}
}
