package com.collections.interfaces;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetInterfaceExample {
	public static void main(String args[]) {
		Set <String> set = new TreeSet();
		Boolean a = set.add("A");
		System.out.println("Success Adding A " + a);
		a = set.add("A");
		System.out.println("Success Adding A again " + a);
		System.out.print(set);
	}
}
