/**
 * 
 */
package com.dixon.spring.springcore.collection;

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
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/com/dixon/spring/springcore/collection/config.xml");
		
		Hospital hospital = (Hospital)ctx.getBean("hospital");
		
		System.out.println(hospital);

	}

}
