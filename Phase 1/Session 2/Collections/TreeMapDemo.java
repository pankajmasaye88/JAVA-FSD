package com.simplilearn.collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer, String> map= new TreeMap<Integer, String>();


		map.put(1, "sonam");
		map.put(2, "Prince");
		map.put(3, "akshita");
		//no null value allowed
		
		System.out.println(map);
		
		System.out.println(map.containsKey(3));
		
		System.out.println("get value of key 2 : "+map.get(2));
		
		for(Map.Entry entry :map.entrySet())
		{
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}	
		
		
	}
}
