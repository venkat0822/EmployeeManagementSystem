package com.system.EmployeeManagement;
import java.util.Scanner;

import com.system.EmployeeManagement.AdminServices.Services;

public class Execute {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Services exec = new Services();
		exec.loginAndRun(s);
	}
}
