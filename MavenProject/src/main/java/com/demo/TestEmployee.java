package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		//Employee e = (Employee) ac.getBean("employee");
		Employee e = (Employee) ac.getBean(Employee.class);
		e.setId(101);
		e.getAccount().setAccBranchName("USA");
		System.out.println(e.toString());
		System.out.println(e.getAccount().toString());
	}
}
