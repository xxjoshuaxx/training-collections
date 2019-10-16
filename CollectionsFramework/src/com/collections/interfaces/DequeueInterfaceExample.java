	package com.collections.interfaces;

import java.util.Deque;
import java.util.LinkedList;
import java.util.NavigableSet;
import java.util.TreeSet;

public class DequeueInterfaceExample {
	public static void main(String args[]) {
		Deque<String> deque = new LinkedList<String>(); 
		 deque.add("A"); 
		 deque.add("B"); 
		 deque.add("C"); 
		 deque.add("D"); 
		 deque.add("E"); 
		 deque.add("F");
		 
		 
		 
		 System.out.println("Deque " + deque);
		 System.out.println("First Element " + deque.getFirst());
		 System.out.println("Last Element " + deque.getLast());
		 
		 deque.addFirst("AA");
		 System.out.println("Deque affter adding First" + deque);
		 deque.addLast("ZZ");
		 System.out.println("Deque affter adding Last" + deque);

		 deque.offerFirst("AAA");
		 System.out.println("Deque affter offer First" + deque);
		 
		 deque.offerLast("ZZZ");
		 System.out.println("Deque affter offer Last" + deque);
		 
		 System.out.println("Peek First " + deque.peekFirst());
		 System.out.println("Deque affter peek  First" + deque);
		 
		 System.out.println("Peek Last " + deque.peekLast());
		 System.out.println("Deque affter peek Last" + deque);
		 
		 System.out.println("Poll First " + deque.pollFirst());
		 System.out.println("Deque affter Poll  First" + deque);
		 
		 System.out.println("Poll Last " + deque.pollLast());
		 System.out.println("Deque affter Poll Last" + deque);
		 
		 deque.pop();
		 System.out.println("Deque affter Pop" + deque);

		 deque.push("TTT");
		 System.out.println("Deque affter Push" + deque);
		 
		 deque.removeFirst();
		 System.out.println("Deque affter RemoveFirst" + deque);
		 
		 deque.removeLast();
		 System.out.println("Deque affter RemoveLast" + deque);
		 
		 deque.add("A");
		 deque.add("C");
		 deque.removeFirstOccurrence("A");
		 System.out.println("Deque affter RemoveFirstOccurrence" + deque);
		 
		 deque.removeLastOccurrence("C");
		 System.out.println("Deque affter removeLastOccurrence" + deque);

	}
}
