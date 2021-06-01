package com.pmk.carcenterApp;

import com.pmk.carcenterApp.Controller.CarController;
import com.pmk.carcenterApp.model.Car;
import com.pmk.carcenterApp.model.CarModify;
import com.pmk.carcenterApp.model.Customer;
import com.pmk.carcenterApp.util.Admin;
import com.pmk.carcenterApp.util.RandData;
import com.pmk.carcenterApp.view.Menu;

public class CarCenterMain {
	public static void main(String[] args) {
		Menu m = new Menu();
		RandData rand = new RandData();
		CarController con = new CarController();

		while (true) {
			switch (m.mainMenu()) {
			case Menu.MAIN_MENU_ADD:
				con.doAddWork(m, rand);
				break;
			case Menu.MAIN_MENU_VIEW:
				con.viewCustData();
				break;
			case Menu.MAIN_MENU_ADMIN:
				if (con.doAdminLogin(m)==true) {
					con.doAdminWork(m);
				}	
				break;
			case Menu.MAIN_MENU_EXIT:
				System.out.println("### 프로그램 종료 ###");
				System.exit(0);
			}
		}
	}

	public String dayOfSell() {
		for (int i=0; i<custList.size(); i++) {
			sum += custList.get(i).getCarModify().getPrice();
		}
		return sum;
		
	}
	
	public void showFixList() {
}


