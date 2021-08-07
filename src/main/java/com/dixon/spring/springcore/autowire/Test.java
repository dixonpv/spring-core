/**
 * 
 */
package com.dixon.spring.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author dixon
 *
 */
public class Test {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/com/dixon/spring/springcore/autowire/config.xml");
		
		Employee employee = (Employee)ctx.getBean("employee");
		
		System.out.println(employee);

	}

}
