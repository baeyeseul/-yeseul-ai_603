package com.bys.carcenterApp;

import com.bys.carcenterApp.Controller.CarController;
import com.bys.carcenterApp.veiw.Menu;

public class CarCenterMain {

	public static void main(String[] args) {
		Menu m = new Menu();
		RrandData rand = new RandData();
		CarController con = new CarController();
		
		while (true) {			
			switch (m.mainMenu()) {
			case Menu.MAIN_MENU_ADD:
				while (true) {
					int menu = m.addSubMenu();
					if (menu == Menu.SUB_ADD_RAND) {
						con.addRandCustData(new Customer(
												rand.getName(),
												rand.getTel(),
												rand.getMemCard(),
												rand.getBirthday(),
												rand.getEmail()));
												new Car(rand.getModel(),
														rand.getYear()),
												new CarModify(rand.getCause(),
													rand.getDateIn(),
													rand.getDateOut(),
													rand.getPrice())));
					}
					else if (menu == Menu.SUB_ADD_INS) {
						System.out.println("수동 입력");
					}
					else if (menu == Menu.SUB_ADD_EXIT) {
						break;
					}
				}
			case Menu.MAIN_MENU_VIEW:
				con.viewCustData();
				break;
			case Menu.MAIN_MENU_ADMIN:
				System.out.println("관리자 모드");
				break;
			case Menu.MAIN_MENU_EXIT:
				System.out.println("### 프로그램 종료 ###");
				System.exit(0);
			}
		}

	}

}
