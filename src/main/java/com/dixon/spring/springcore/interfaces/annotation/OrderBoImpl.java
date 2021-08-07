/**
 * 
 */
package com.dixon.spring.springcore.interfaces.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author dixon
 *
 */
@Component("bo")
public class OrderBoImpl implements OrderBo {

	@Autowired
	@Qualifier("orderDAOImpl")
	private OrderDAO dao;
	
	@Override
	public void placeOrder() {
		
		System.out.println("Inside Order DAO");
		dao.createOder();
	}

	public OrderDAO getDao() {
		return dao;
	}

	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}
	

}
