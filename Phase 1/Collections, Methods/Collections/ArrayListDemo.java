package com.simplilearn.collection;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		ArrayList<String> list= new ArrayList<String>();
		
		list.add("Prem");
		list.add("Niyati");
		list.add("Akansha");
		list.add("Ashwin");
		list.add("Chetan");
		
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
		
		System.out.println(list.contains("Niyati"));
		
		System.out.println("Element from index 3 : "+list.get(3));
		
		System.out.println("Size : "+list.size());
		
		list.add("Raja");
		System.out.println("Size : "+list.size());
		
		//print elements using for each loop
		for(String s:list)
		{
			System.out.println(s);
		}		
	}
}