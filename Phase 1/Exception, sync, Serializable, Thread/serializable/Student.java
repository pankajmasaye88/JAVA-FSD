package com.simplilearn.serializable;

import java.io.Serializable;

import javax.print.DocFlavor.STRING;

//pojo plain old java project
public class Student implements Serializable{
	
	private int id;
	private String fname;
	private String lname;
	private transient String email;
	
	public Student() {
			
	}	
	
	public Student(int id, String fname, String lname, String email) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
	}	
}