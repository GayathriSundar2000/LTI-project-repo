/**
 * 
 */
package com.lti.bean;

/**
 * @author 10710251
 *
 */
public class Customer {
	
	private int customerID;
	private String customerName;
	private String customerAddress;
	/**
	 * @return the customerID
	 */
	public int getCustomerID() {
		return customerID;
	}
	/**
	 * @param customerID the customerID to set
	 */
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	/**
	 * @return the customerAddress
	 */
	public String getcustomerAddress() {
		return customerAddress;
	}
	/**
	 * @param customerAddress the customerAddress to set
	 */
	public void setcustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	} 

}
