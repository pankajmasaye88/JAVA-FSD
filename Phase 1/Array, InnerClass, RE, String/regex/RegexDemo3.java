package com.simplilearn.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo3 {

	public static void main(String[] args) {
		
		String pattern= "[a-zA-Z0-9]{6}";
		Pattern p= Pattern.compile(pattern);
		
		Matcher match= p.matcher("pankaj6");
		
		System.out.println("Result : "+match.matches());
		
		//which accept 10 numbers but first digit starts from 7,8,9
	//	String pattern1= "[789]{1}[0-9]{9}";
		String pattern1= "[789]{1}\\d{9}";
		Pattern p1= Pattern.compile(pattern1);
	
		Matcher match1= p1.matcher("8568756482");
		
		System.out.println("Match mobile number : "+match1.matches());
		if(match1.matches())
		{
			System.out.println("Valid mobile number");
		}
		else
		{
			System.out.println("Not vallid mobile number.");
		}
	}
}