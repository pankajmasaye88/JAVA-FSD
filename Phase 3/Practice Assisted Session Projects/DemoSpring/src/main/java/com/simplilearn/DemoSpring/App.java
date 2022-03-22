package com.simplilearn.DemoSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student s = (Student) context.getBean("s");

		System.out.println("Name : " + s.getName());
		System.out.println("Hello World Domination Centre for Crazy Fighters");

		Marks marks = s.getMarks();
		System.out.println(marks.getChem() + " " + marks.getMath() + " " + marks.getPhy());

	}
}
