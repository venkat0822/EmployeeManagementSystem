package com.system.EmployeeManagement.AdminData;

import java.util.LinkedList;

public class AdminDetails {
	
	private int adminId;
	private String adminName;
	private String adminPassword;
	private String adminRole;
	
	
	public static LinkedList<AdminDetails> adminList = new LinkedList<>();
	static{

		adminList.add(new AdminDetails(101,"admin1", "admin@1","ADMIN_ALL"));
		adminList.add(new AdminDetails(102,"admin2", "admin@2","ADMIN_VIEW"));
		adminList.add(new AdminDetails(103,"admin3", "admin@3","ADMIN_VIEW"));
	}
	

	public AdminDetails(int adminId, String adminName, String adminPassword, String adminRole) {
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminPassword = adminPassword;
		this.adminRole = adminRole;
	}
	
	public AdminDetails() {
		
	}

	public int getAdminId() {
		
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	public String getAdminRole() {
		return adminRole;
	}

	public void setAdminRole(String adminRole) {
		this.adminRole = adminRole;
	}

    public static LinkedList<AdminDetails> returnList() {
        
		return adminList;
    }

}
