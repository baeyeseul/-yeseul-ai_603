package com.bys.carcenterApp.Controller;

import java.util.ArrayList;

import com.bys.carcenterApp.model.Customer;

public class CarController {
	ArrayList<Customer> custList =
			new ArrayList<Customer>();
	
	public void addRandCustData(Customer cust) {
		custList.add(cust);
	}
	
	public void addCustData(Customer cust) {
		custList.add(cust);
	}
	
	public void viewCustData() {
		for (int i=0; i<custList.size(); i++) {
			System.out.println(
			custList.get(i).toString());
		}
	}
}
