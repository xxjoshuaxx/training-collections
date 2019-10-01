package com.collections;

//Demonstrating the methods in the collection interface using the ArrayList Class

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.TreeSet;

public class CollectionInterface {
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
		

		System.out.println("Adding items in list 2 to list 1 :"); 
		list.addAll(list2);
		System.out.println("List 1 after adding : "+ list);

		
		list.remove(5);
		System.out.println("List removing item on index 5 : "+ list);
		
		list.removeAll(list2);
		System.out.println("List 1 after Removing all items which are in the list 2 : "+ list);

		list.addAll(list2); //Adding list 2 again
		list.retainAll(list2);
		System.out.println("List 1 after retaining items which are in the list 2 : "+ list);

		System.out.println("Does List contain 'D' : "+ list.contains("D"));
		System.out.println("Does List contain List 2 : "+ list.containsAll(list2));
		System.out.println("List Contents : "+ list);
		System.out.println("Is list same as List 2 : "+ list.equals(list2));
		
		System.out.println("Size of list  : "+ list.size());
		
		list.removeIf(n->(n=="D"));
		System.out.println("After removing \"if\"  : "+ list);
		

		Object[] s = list.toArray();
		System.out.println("List As Array : ");
		for(int i = 0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		
		//Clearing the list
		list.clear();
		System.out.println("List after clearing : "+ list);
		System.out.println("Is Empty? : "+ list.isEmpty());
		
		
		
/*		Queue<String> queue = new LinkedList<>(list);
		int initSize = queue.size();

		for(int i=0; i<initSize;i++) {
			queue.remove();
			System.out.println(queue.toString());
			System.out.println(queue.size());
		}
		
	/*	TreeSet<String> myset = new TreeSet<String>(list2);
		System.out.println(myset.toString());
		System.out.println(list2.toString());
		*/
		
		/*System.out.println("Before Sort");
		System.out.println(list2.toString());
		HashSet<String> myset2 = new HashSet<String>(list2);
		ArrayList s2 = new ArrayList(myset2);
		System.out.println("After Sort");
		System.out.println(s2.toString());*/

	}
}
