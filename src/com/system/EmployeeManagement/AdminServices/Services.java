package com.system.EmployeeManagement.AdminServices;
import java.util.*;

import com.system.EmployeeManagement.AdminData.AdminDetails;
import com.system.EmployeeManagement.employeeData.BasicDetails;
public class Services {

    public LinkedList<AdminDetails> adList = AdminDetails.returnList();
    AdminServices admService = new AdminServices();
    BasicDetails basic;
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
public void SelectRole(String role)
{
    System.out.println("Enter your choice");
    if(role.equals("ADMIN_ALL"))
    {
        System.out.println("Enter your choice made up with the Employee Details..");
        System.out.println("1.Add Employee\n2.Update Employee\n3.View Employee\n4.View All Employee\n5.Sort Employee");
        System.out.println("Enter a choice(1/2/3/4/5): ");
        switch(sc.nextInt())
        {
            case 1:
                admService.AddEmployee();
                break;
            case 2:
                admService.UpdateEmployee();
                break;
            case 3:
                System.out.println("1.Search by id\n2.Search by Name");
                System.out.println("Enter choice(1/2): ");
                switch (sc.nextInt()) {
                    case 1:
                        System.out.println("Enter the id: ");
                        String id = sc.next();
                        if(admService.checkifEmployeeExistsById(id))
                            admService.viewEmployeeById(id);
                        else
                            System.out.println("Id does not exist");
                        break;
                    case 2:
                        System.out.println("Enter the Name: ");
                        String name = sc.next();
                        if(admService.CheckifEmployeeExistsByName(name))
                            admService.viewEmployeeByName(name);
                        else
                            System.out.println("Name does not exist");
                        break;
                    default:
                        System.out.println("Enter a valid choice !");
                }
                break;
            case 4:
                admService.viewAllEmployee();
                break;
            case 5:
                admService.SortEmployee();
                break;
            default :
                System.out.println("Please Enter Valid options");
        }
    }
    else if(role.equals("ADMIN_VIEW"))
    {
       System.out.println("1.ViewEmployee\n2.ViewAllEmployee");
       switch(sc.nextInt())
       {
        case 1:
            System.out.println("1.Search by id\n2.Search by Name");
            System.out.println("Enter choice(1/2): ");
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Enter the id: ");
                    String id = sc.next();
                    if(admService.checkifEmployeeExistsById(id))
                        admService.viewEmployeeById(id);
                    else
                        System.out.println("Id does not exist");
                    break;
                case 2:
                    System.out.println("Enter the Name: ");
                    String name = sc.next();
                    if(admService.CheckifEmployeeExistsByName(name))
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
        default :
            System.out.println("Enter a valid choice !!");
       }
    }
    else
        System.out.println("UnAuthorized person"); 
}
