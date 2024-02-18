package com.system.EmployeeManagement.AdminServices;

import java.util.Scanner;

import com.system.EmployeeManagement.AdminData.AdminDetails;
import com.system.EmployeeManagement.Exceptions.*;

public class Services {
	
	
	public void loginAndRun(Scanner s) {
		
		AdminServices admService = new AdminServices();
		Services sec = new Services();
		Scanner sc = new Scanner(System.in);
		AdminDetails username;
		while (true) {
			System.out.println("enter your Admin Name");
			String name = sc.next();
			username = admService.returnAdmin(name);
			if (username == null) {
				System.out.println("User Not Found!!");
				continue;
			}
			System.out.println("Enter your Password");
			String password = sc.next();
			boolean flagPass = admService.CheckPass(name, password);
			try {
				if(!flagPass) {
					
					throw new InvalidUserCredException("Incorrect Password!");
				}
				}catch (InvalidUserCredException e) {
					
					System.out.println("Caught");
					System.out.println(e);
					continue;
				}
				if(flagPass) break;
		}
		String role = username.getAdminRole();
		switch (role) {

		case "ADMIN_ALL":
			runAdminAll(admService, sc, sec);
			break;
		case "ADMIN_VIEW":
			runAdminView(admService, sc, sec);
			break;
		default:
			System.out.println("Unauthorized person !!");
		}
	}

	public static void runAdminAll(AdminServices admService, Scanner sc, Services sec) {
		String flag, ch;
		System.out.println("Welcome to Employee Management System...");
		do {
			System.out.println("Enter your choice made up with the Employee Details..");
			System.out.println(
					"1.Add Employee\n2.Update Employee\n3.View Employee\n4.View All Employee\n5.Sort Employee\n6.Logout");
			System.out.println("Enter a choice(1/2/3/4/5/6): ");
			switch (sc.nextInt()) {
			case 1:
				admService.AddEmployee();
				break;
			case 2:
				admService.UpdateEmployee();
				break;
			case 3:
				do {
					System.out.println("1.Search by id\n2.Search by Name");
					System.out.println("Enter choice(1/2): ");
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter the id: ");
						int id = sc.nextInt();
						if (admService.checkifEmployeeExistsById(id))
							admService.viewEmployeeById(id);
						else
							System.out.println("Id does not exist");
						break;
					case 2:
						System.out.println("Enter the Name: ");
						String name = sc.next();
						if (admService.CheckifEmployeeExistsByName(name))
							admService.viewEmployeeByName(name);
						else
							System.out.println("Name does not exist");
						break;
					default:
						System.out.println("Enter a valid choice !");
					}
					System.out.println("Do you wish to continue??");
					flag = sc.next();
				} while (flag.equalsIgnoreCase("Y"));
				break;
			case 4:
				admService.viewAllEmployee();
				break;
			case 5:
				admService.SortEmployee();
				break;
			case 6:
				System.out.println("Do you want to login again? (Yes/No)");
				sc.nextLine();
				String st = sc.nextLine();
				if (st.equalsIgnoreCase("Yes")) {
					sec.loginAndRun(sc);
				} else {
					System.out.println("Thank you !!!");
					System.exit(0);
				}
				break;
			default:
				System.out.println("Please Enter Valid options");
			}
			System.out.println("Do you wish to continue(y/n)??");
			ch = sc.next();
		} while (ch.equalsIgnoreCase("Y"));
	}

	public static void runAdminView(AdminServices admService, Scanner sc, Services sec) {

		String option;
		System.out.println("Welcome to Employee Management System...");
		do {
			System.out.println("1.ViewEmployee\n2.ViewAllEmployee\n3.Logout");
			System.out.println("Enter choice(1/2/3): ");
			switch (sc.nextInt()) {
			case 1:
				System.out.println("1.Search by id\n2.Search by Name\n");
				System.out.println("Enter choice(1/2): ");
				switch (sc.nextInt()) {
				case 1:
					System.out.println("Enter the id: ");
					int id = sc.nextInt();
					if (admService.checkifEmployeeExistsById(id))
						admService.viewEmployeeById(id);
					else
						System.out.println("Id does not exist");
					break;
				case 2:
					System.out.println("Enter the Name: ");
					String name = sc.next();
					if (admService.CheckifEmployeeExistsByName(name))
						admService.viewEmployeeByName(name);
					else
						System.out.println("Name does not exist");
					break;
				default:
					System.out.println("Enter a valid choice !");
				}
				break;
			case 2:
				admService.viewAllEmployee();
				break;
			case 3:
				System.out.println("Do you want to login again? (Yes/No)");
				sc.nextLine();
				String st = sc.nextLine();
				if (st.equalsIgnoreCase("Yes")) {
					sec.loginAndRun(sc);
				} else {
					System.out.println("Thank you !!!");
					System.exit(0);
				}
				break;
			default:
				System.out.println("Enter a valid choice !!");
			}
			System.out.println("Do you wish to continue(y/n)??");
			option = sc.next();
		} while (option.equalsIgnoreCase("Y"));
	}
}
