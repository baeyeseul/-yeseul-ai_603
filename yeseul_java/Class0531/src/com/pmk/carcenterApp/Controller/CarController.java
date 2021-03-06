package com.pmk.carcenterApp.Controller;

import java.util.ArrayList;

import com.pmk.carcenterApp.model.Car;
import com.pmk.carcenterApp.model.CarModify;
import com.pmk.carcenterApp.model.Customer;
import com.pmk.carcenterApp.util.Admin;
import com.pmk.carcenterApp.util.RandData;
import com.pmk.carcenterApp.view.Menu;

public class CarController {
	ArrayList<Customer> custList = new ArrayList<Customer>();
	
	public void addRandCustData(Customer cust) {
		custList.add(cust);
	}

	public void addRandCustData(int size, RandData rand) {
		for (int i = 0; i > size; i++) {
			custList.add(new Customer(rand.getName(), rand.getTel(), rand.getmCard(), rand.getBirthday(),
					rand.getEmail(), new Car(rand.getModel(), rand.getYear()),
					new CarModify(rand.getCause(), rand.getDateIn(), rand.getDateOut(), rand.getPrice())));
		}
	}

	public void addCustData(Customer cust) {
		custList.add(cust);
	}

	public void viewCustData() {
		for (int i = 0; i < custList.size(); i++) {
			System.out.println(custList.get(i).toString());
		}
	}
	
	public void doAddWork(Menu m, RandData rand) {
		while (true) {
			int menu = m.addSubMenu();
			if (menu == Menu.SUB_ADD_RAND) {
				con.addRandCustData(m.getCount(), rand);
			}
			else if (menu == Menu.SUB_ADD_INS) {
				con.addCustData(m.addManualManu());
			}
			else if (menu == Menu.SUB_ADD_EXIT) {
				break;
			}
		}
	
	}
	
	public void doAdminLogin(Menu m) {
	while (true) {
		String info[] = m.loginAdmin(); 
		if (info[0].equals(Admin.ADMIN_ID)==false) {
			System.err.println("잘못된 ID 입니다.");
			continue;
		}
		else if (info[1].equals(Admin.ADMIN_PASSWD)==false) {
			System.err.println("잘못된 PASSWD 입니다.");
			continue;
		}
		else break;
	}
	
	public void doAdminWork(Menu m) {
	for(;;) {
		int menu = m.adminMenu();
		if (menu == 1) {
			System.out.println("일일 매출액: " + dayOfSell());
		}
		else if (menu == 2) {
			System.out.println("차량수리 내역보기");
		}
		else if (menu == 3) break;
	}
	
	public 
		int sum = 0;
		for (int i=0; i<custList.size(); i++) {
			sum += custList.get(i)
					.getCarModify()
					.getPrice();
		}
		return CommUtil.getKorMoney(sum);
	}
	
	public void showFixList() {
	}	
}
}
