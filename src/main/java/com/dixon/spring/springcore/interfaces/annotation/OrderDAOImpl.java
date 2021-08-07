package com.dixon.spring.springcore.interfaces.annotation;

import org.springframework.stereotype.Component;

@Component
public class OrderDAOImpl implements OrderDAO {

	@Override
	public void createOder() {

		System.out.println("Inside create order");

	}

}
