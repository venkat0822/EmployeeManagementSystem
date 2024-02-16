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
    AdminAuthenticate(name,password);
}
public boolean AdminAuthenticate(String name,String password)
{

}
public void SelectRole(String role)
=======

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
>>>>>>> ee4ce0ab0162dd895817f89eddf92f852c72caf4
{
    System.out.println("Enter your choice");
    if(role.equals(""))
    {
        System.out.println("Enter your choice made up with the Employee Details..");
<<<<<<< HEAD
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
=======

>>>>>>> ee4ce0ab0162dd895817f89eddf92f852c72caf4
    }
} 
}
