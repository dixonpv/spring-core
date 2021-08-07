/**
 * 
 */
package com.dixon.spring.springcore.ambiguity;

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
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/com/dixon/spring/springcore/ambiguity/config.xml");	
		Addition addition = (Addition)ctx.getBean("addition");

	}

}
