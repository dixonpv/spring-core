/**
 * 
 */
package com.dixon.spring.springcore.ambiguity;

/**
 * @author dixon
 *
 */
public class Addition {

	Addition(int a, int b) {

		System.out.println("Constructor INT");
	}

	Addition(double a, double b) {

		System.out.println("Constructor DOUBLE");

	}
	
	Addition(String a, String b) {

		System.out.println("Constructor STRING");

	}

}
