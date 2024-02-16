package com.system.EmployeeManagement.AdminServices;

import java.util.LinkedList;

import com.system.EmployeeManagement.AdminData.AdminDetails;

public class AdminServices {
    
    public LinkedList<AdminDetails> adList = AdminDetails.returnList();
    Scanner sc=new Scanner(System.in);
    public void AddEmployee()
    {
        String empId,empName,empCurrentCompany,empPreviousCompany,street,city,state,country;
	    int salary,age, doorNo,pinCode;
        System.out.println("Enter  Basic Details.....");
        System.out.println("Enter Employee ID");
        empId=sc.next();
        System.out.println("Enter Employee Name");
        empName=sc.next();
        System.out.println("Enter Employee Salary");
        salary=sc.nextInt();
        System.out.println("Enter EmployeeAge");
        age=sc.nextInt();
        System.out.println("Enter Employee Current Company");
        empCurrentCompany=sc.next();
        System.out.println("Enter Employee Previous Company");
        empPreviousCompany=sc.next();
        System.out.println("Enter Address Details...")
        System.out.println("Enter Door No");
        doorNo=sc.nextInt();
         System.out.println("Enter Street Name");
        street=sc.next();
         System.out.println("Enter City Name");
        city=sc.next();
         System.out.println("Enter State Name");
        state=sc.next();
         System.out.println("Enter Country Name");
         country=sc.next();
         System.out.println("Enter Pin Code");
         pinCode=sc.nextInt();

        BasicDetails basic=new BasicDetails(empId,empName,empCurrentCompany,empPreviousCompany,salary,
           age, new AddressDetails(doorNo,city,state,country,pinCode) );
    }

    
}
