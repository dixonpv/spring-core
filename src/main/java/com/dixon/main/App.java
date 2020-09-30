package com.dixon.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dixon.main.bean.GreetService;

/**
 * @author dixon
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");   	
    	GreetService greetService = (GreetService)context.getBean("greeting");
    	System.out.println(greetService.getName());
    	
    }
}
