/**
 * 
 */
package com.dixon.spring.springcore.property;

/**
 * @author dixon
 *
 */
public class MyDao {
	
	private String server;
	private String port;
	
	public MyDao(String server, String port) {
		super();
		this.server = server;
		this.port = port;
	}

	@Override
	public String toString() {
		return "MyDao [server=" + server + ", port=" + port + "]";
	}
	
	
	
}
