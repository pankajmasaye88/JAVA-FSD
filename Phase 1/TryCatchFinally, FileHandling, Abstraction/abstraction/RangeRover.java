package com.simplilearn.abstraction;

public class RangeRover extends CarAbstract{
	
	public RangeRover(String name)
	{
		super(name);
	}
	public void powerEngine() {
		System.out.println("Range rover engine started");
	}
}