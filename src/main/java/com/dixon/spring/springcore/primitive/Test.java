/**
 * 
 */
package com.dixon.spring.springcore.primitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author dixon
 *
 */
public class Test {

	/**
	 * @param args
	 * Value as element
	 * Value as attribute
	 * p:schema
	 */
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/com/dixon/spring/springcore/primitive/config.xml");
		
		Employee employee = (Employee)ctx.getBean("emp");
		
		System.out.println(employee);

	}

}
