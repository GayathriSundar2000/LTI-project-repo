/**
 * 
 */
package com.lti.app;
import com.lti.service.CustomerService;
/**
 * @author 10710251
 *
 */
public class CustomerApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//CustomerService service=new CustomerService();
		
		CustomerInterface service = new CustomerService();
		service.createCustomer();
		service.updateCustomer();
		service.deleteCustomer();
		service.listCustomer();
	}

}
