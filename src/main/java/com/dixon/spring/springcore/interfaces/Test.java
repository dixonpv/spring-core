/**
 * 
 */
package com.dixon.spring.springcore.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dixon.spring.springcore.primitive.Employee;

/**
 * @author dixon
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/com/dixon/spring/springcore/interfaces/config.xml");	
		OrderBo bo = (OrderBoImpl)ctx.getBean("bo");
	    bo.placeOrder();

	}

}
