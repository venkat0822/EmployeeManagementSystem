package com.system.EmployeeManagement.AdminServices;
import java.util.*;
<<<<<<< HEAD
public class Services {
Scanner sc=new Scanner(System.in);
public void login()
{
    String name,password;
    System.out.println("Enter your admin Details..");
    System.out.println("enter your Admin Name");
    name=sc.next();
    System.out.println("Enter your Password");
    password=sc.next();
}

=======

import com.system.EmployeeManagement.AdminData.AdminDetails;
public class Services {

    public LinkedList<AdminDetails> adList = AdminDetails.returnList();
    AdminServices admService = new AdminServices();
    Scanner sc=new Scanner(System.in);
    public void login(){

        while(true){
            AdminDetails username;
            System.out.println("enter your Admin Name");
            String name=sc.next();
            username= admService.returnAdmin(name);
            if(username==null){
                System.out.println("User Not Found!!");
                continue;
            }
            System.out.println("Enter your Password");
            String password=sc.next();
            boolean flagPass = admService.CheckPass(name,password);
			if(!flagPass) {		
				System.out.println("Incorrect Password!");
				continue;
			}
			break;
        }
}
>>>>>>> 805cb26c1cfa6b317ed6980ee98400297c3b56a5
public void SelectRole(String role)
{
    System.out.println("Enter your choice");
    if(role.equals("ADMIN_ALL"))
    {
        System.out.println("Enter your choice made up with the Employee Details..");
        System.out.println("1.Add Employee\n2.Update Employee\n3.View Employee\n4.View All Employee\n5.Sort Employee");
        switch(sc.nextInt())
        {
            case 1:
                AddEmployee();
                break;
            case 2:
                UpdateEmployee();
                break;
            case 3:
                ViewEmployee();
                break;
            case 4:
                ViewAllEmployee();
                break;
            case 5:
                SortEmployee();
                break;
            default :
                 System.out.println("Please Enter Valid options");
                 break;
        }
    }
    else if(role.equals())
    {
       System.out.println("1.ViewEmployee\n2.ViewAllEmployee");
       switch(sc.nextInt())
       {
        case 1:
            ViewEmployee();
                break;
        case 2:
                ViewAllEmployee();
                break;
        default :

       }
       else
       {
        System.out.println("UnAuthorized person"); 
       }
    }
} 
}
