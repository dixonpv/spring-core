/**
 * 
 */
package com.dixon.spring.springcore.property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author dixon
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/com/dixon/spring/springcore/property/config.xml");
		
		MyDao myDao = (MyDao)ctx.getBean("myDAO");
		
		System.out.println(myDao);
		
	}

}
