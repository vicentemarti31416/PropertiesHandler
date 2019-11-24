package com.example.properties7;

import java.util.Properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.properties7.bean.Bean1;

public class App {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/beans.xml");
		Properties props = (Properties) context.getBean("properties");
		props.forEach((k, v) -> System.out.println(k + " " + v));
		Bean1 bean1 = (Bean1) context.getBean("bean1");
		System.out.println("context: " + bean1.getUsername());
		System.out.println("context: " + bean1.getPassword());
		Bean1 bean12 = (Bean1) context.getBean("bean12");
		System.out.println("util: " + bean12.getUsername());
		System.out.println("util: " + bean12.getPassword());
	}
}
