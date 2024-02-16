package com.system.EmployeeManagement.AdminServices;
import java.util.LinkedList;
import java.util.Scanner;

import com.system.EmployeeManagement.AdminData.AdminDetails;
import com.system.EmployeeManagement.employeeData.AddressDetails;
import com.system.EmployeeManagement.employeeData.BasicDetails;

public class AdminServices {
    
    public LinkedList<AdminDetails> adList = AdminDetails.returnList();
    public LinkedList<BasicDetails> empDetails = new LinkedList<>();
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
        AddressDetails ad =new AddressDetails(doorNo,city,state,country,pinCode);
        BasicDetails basic=new BasicDetails(empId,empName,empCurrentCompany,empPreviousCompany,salary,
           age, ad) ;

        empDetails.add(basic);
    }
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
    public void viewAllEmployee(){

        for(BasicDetails basicList : empDetails) {
            System.out.println();
			System.out.println("The id: "+basicList.getEmpId());
            System.out.println("The Name: "+basicList.getEmpName());
            System.out.println("The Salary: "+basicList.getSalary());
            System.out.println("The Age: "+basicList.getAge());
            System.out.println("The Cuurent Company: "+basicList.getEmpCurrentCompany());
            System.out.println("The Previous Company: "+basicList.getEmpPreviousCompany());
            System.out.println();
            System.out.println("The Address Details ");
            System.out.println("The Door no: "+basicList.getAddressDetails().getDoorNo());
            System.out.println("The Street: "+basicList.getAddressDetails().getStreet());
            System.out.println("The City: "+basicList.getAddressDetails().getCity());
            System.out.println("The State: "+basicList.getAddressDetails().getState());
            System.out.println("The Country: "+basicList.getAddressDetails().getCountry());
            System.out.println("The PinCode: "+basicList.getAddressDetails().getPinCode());
        }
    }

    public boolean checkifEmployeeExistsById(String id){
        
        for(BasicDetails basic: empDetails) {
			if(basic.getEmpId().equals(id))
				return true;
		}
		return false;  
    }
    public boolean CheckifEmployeeExistsByName(String name){

        for(BasicDetails basic: empDetails) {
			if(basic.getEmpName().equals(name))
				return true;
		}
		return false;  
    }

    public void viewEmployeeById(String id){

        for(BasicDetails basic: empDetails){

            if(basic.getEmpId().equals(id)){
                
                System.out.println("The id: "+basic.getEmpId());
                System.out.println("The Name: "+basic.getEmpName());
                System.out.println("The Salary: "+basic.getSalary());
                System.out.println("The Age: "+basic.getAge());
                System.out.println("The Cuurent Company: "+basic.getEmpCurrentCompany());
                System.out.println("The Previous Company: "+basic.getEmpPreviousCompany());
                System.out.println();
                System.out.println("The Address Details ");
                System.out.println("The Door no: "+basic.getAddressDetails().getDoorNo());
                System.out.println("The Street: "+basic.getAddressDetails().getStreet());
                System.out.println("The City: "+basic.getAddressDetails().getCity());
                System.out.println("The State: "+basic.getAddressDetails().getState());
                System.out.println("The Country: "+basic.getAddressDetails().getCountry());
                System.out.println("The PinCode: "+basic.getAddressDetails().getPinCode());
            }
        }
    }
    public void viewEmployeeByName(String name){
        for(BasicDetails basic: empDetails){

            if(basic.getEmpName().equals(name)){

                System.out.println("The id: "+basic.getEmpId());
                System.out.println("The Name: "+basic.getEmpName());
                System.out.println("The Salary: "+basic.getSalary());
                System.out.println("The Age: "+basic.getAge());
                System.out.println("The Cuurent Company: "+basic.getEmpCurrentCompany());
                System.out.println("The Previous Company: "+basic.getEmpPreviousCompany());
                System.out.println();
                System.out.println("The Address Details ");
                System.out.println("The Door no: "+basic.getAddressDetails().getDoorNo());
                System.out.println("The Street: "+basic.getAddressDetails().getStreet());
                System.out.println("The City: "+basic.getAddressDetails().getCity());
                System.out.println("The State: "+basic.getAddressDetails().getState());
                System.out.println("The Country: "+basic.getAddressDetails().getCountry());
                System.out.println("The PinCode: "+basic.getAddressDetails().getPinCode());
            }
        }
    }


}
