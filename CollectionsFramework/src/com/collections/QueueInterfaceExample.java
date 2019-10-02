package com.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterfaceExample {
	public static void main(String args[]) {
	    Queue<String> queue = new LinkedList<>(); 
	    queue.add("A");
	    queue.add("B");
	    queue.add("C");
	    queue.add("D");
	    queue.add("E");
	    queue.add("F");
	    
        System.out.println("The queue : " + queue);
        //System.out.println("The element at the head of the queue: " + queue.element());
        
        System.out.println("The element at the head of the queue using peek: " + queue.peek());
        //Returns null if empty. Check by cmmenting off the add statements above
        
        queue.offer("G");
        System.out.println("The queue after offer('G'): " + queue);
        
        queue.offer("G");

        

	}    
}
