/**
 * 
 */
package com.lti.app;

import com.lti.service.CalculatorService;

/**
 * @author 10710251
 *
 */
public class CalApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create instance of class and expose all methods here
		
		CalculatorService service = new CalculatorService();
		System.out.println("Addition-->"+service.add(10, 10));
		System.out.println("Subtraction-->"+service.sub(10, 8));
		System.out.println("Multiplication-->"+service.mul(10, 10));
		System.out.println("Division-->"+service.div(12,6));
	}

}
