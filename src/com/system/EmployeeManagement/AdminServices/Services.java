package com.system.EmployeeManagement.AdminServices;
import java.util.*;
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
    AdminAuthenticate(name,password);
}
public boolean AdminAuthenticate(String name,String password)
{

}
public void SelectRole(String role)
{
    System.out.println("Enter your choice");
    if(role.equals(""))
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
