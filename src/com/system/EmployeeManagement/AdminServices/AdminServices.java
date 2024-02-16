package com.system.EmployeeManagement.AdminServices;
import java.util.LinkedList;
import com.system.EmployeeManagement.AdminData.AdminDetails;
import com.system.EmployeeManagement.employeeData.BasicDetails;

public class AdminServices {
    
    public LinkedList<AdminDetails> adList = AdminDetails.returnList();
    public LinkedList<BasicDetails> empDetails = new LinkedList<>();
    public AdminDetails returnAdmin(String userName) {
			
        for(AdminDetails admin: adList) {
            if(admin.getAdminName().equals(userName))
                return admin;
        }
        return null;
    }

    public boolean CheckPass(String usname, String pass) {

		for(AdminDetails admin: adList) {
			
			if(admin.getAdminName().equals(usname) && admin.getAdminPassword().equals(pass))
				return true;
		}
		return false;
	}

    

}
