package com.system.EmployeeManagement.AdminServices;
import java.util.*;

import com.system.EmployeeManagement.AdminData.AdminDetails;
public class Services {

    public LinkedList<AdminDetails> adList = AdminDetails.returnList();
    public void login(){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter your Admin Name");
        String name=sc.next();
        System.out.println("Enter your Password");
        String password=sc.next();
        
    }
public void SelectRole(int role)
{
    if(role==1)
    {
        System.out.println("Enter your choice made up with the Employee Details..");

    }
} 
}
