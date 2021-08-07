/**
 * 
 */
package com.dixon.spring.springcore.interfaces;

/**
 * @author dixon
 *
 */
public class OrderBoImpl implements OrderBo {

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
