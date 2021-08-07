/**
 * 
 */
package com.dixon.spring.springcore.constructor;

/**
 * @author dixon
 *
 */
public class Employee {
	
	private int name;
	private Address address;
	

	public Employee(int name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + "]";
	}

	
	
	
}
