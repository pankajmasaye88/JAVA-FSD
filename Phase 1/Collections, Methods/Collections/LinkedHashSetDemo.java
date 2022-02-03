package com.simplilearn.collection;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<String> set= new LinkedHashSet<String>();
		
		set.add("aesha");
		set.add("user");
		set.add("pooja");
		set.add("kruti");
		//order maintained
		System.out.println(set);
		//no duplicates allowed
		set.add("kruti");
		System.out.println(set);
		
		
		System.out.println("Is empty : "+set.isEmpty());
		set.remove("kruti");
		System.out.println(set);
		System.out.println("Size : "+set.size());
		//null values 
		set.add(null);
		System.out.println(set);
	}
}
