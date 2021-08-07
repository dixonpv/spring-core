/**
 * 
 */
package com.dixon.spring.springcore.constructor;

/**
 * @author dixon
 *
 */
public class Address {
	
	private String house;
	private String street;
	private String city;

	public Address(String house, String street, String city) {
		super();
		this.house = house;
		this.street = street;
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Address [house=" + house + ", street=" + street + ", city=" + city + "]";
	}
	
	
}
