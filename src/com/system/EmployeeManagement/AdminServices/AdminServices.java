package com.system.EmployeeManagement.AdminServices;
import java.util.LinkedList;
import java.util.Scanner;

import com.system.EmployeeManagement.AdminData.AdminDetails;
import com.system.EmployeeManagement.employeeData.AddressDetails;
import com.system.EmployeeManagement.employeeData.BasicDetails;

public class AdminServices {
    public LinkedList<AdminDetails> adList = AdminDetails.returnList();
<<<<<<< HEAD
    public LinkedList<BasicDetails> empDetails = new LinkedList<>();
=======
     public LinkedList<BasicDetails> empDetails = new LinkedList<>();
>>>>>>> 7abf4fe0c1cfef0f0a811c60970f3594feef4828
    Scanner sc=new Scanner(System.in);
    public void AddEmployee()
    {
        String empId,empName,empCurrentCompany,empPreviousCompany,street,city,state,country,upName,upID,upEmpCurrentCompany,upEmpPreviousCompany,upStreet,upCity,upState,upCountry;
	    int salary,age, doorNo,pinCode,upSalary,upAge,upDoorNo,upPinCode;
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
<<<<<<< HEAD
        AddressDetails ad =new AddressDetails(doorNo,city,state,country,pinCode);
        BasicDetails basic=new BasicDetails(empId,empName,empCurrentCompany,empPreviousCompany,salary,
           age, ad) ;

        empDetails.add(basic);
    }
=======
        BasicDetails basic=new BasicDetails(empId,empName,empCurrentCompany,empPreviousCompany,salary,
           age, new AddressDetails(doorNo,city,state,country,pinCode) );
    }
  public void UpdateEmployee()
  {
    System.out.println("Enter Employee ID");
     upID=sc.next();
    System.out.println("Enter the details Which to be Update....");
    System.out.println("1.Basic Details\n2.Address Details....");
    switch(sc.nextInt())
    {
        case 1:
            System.out.println("Enter which basic detail to be Updated..");
            System.out.println("1.Age\n2.Salary\n3.Current Company\n4.previous Company");
            switch(sc.nextInt())
            {
                case 1:
                System.out.println("Enter the Age to be Update...");
                upAge=sc.nextInt();
                UpdateAge(upAge);
                break;
                case 2:
                System.out.println("Enter the Salary to be Update...");
                upSalary=sc.nextInt();
                UpdateSalary(upSalary);
                break;
                case 3:
                System.out.println("Enter the Current Company to be Update...");
                upEmpCurrentCompany=sc.next();
                UpdateEmpCurrentCompany(upEmpCurrentCompany);
                break;
                case 4:
                System.out.println("Enter the previous Company to be Update...");
                upEmpPreviousCompany=sc.next();
                UpdateEmpPPreviousCompany(upEmpPreviousCompany);
                break;
            }
            break;
            case 2:
                System.out.println("Enter which Address detail to be Update..");
                System.out.println("1.DoorNo\n2.Street\n3.City\n4.State\n5.Country\n6.PinCode");
                switch(sc.nextInt())
                {
                    case 1:
                        System.out.println("Enter the Door No to be Update..");
                        upDoorNo=sc.nextInt();
                        UpdateDoorNo( upDoorNo,upID);
                        break;
                    case 2:
                        System.out.println("Enter the Street Name to be Update..");
                        upStreet=sc.next();
                        UpdateStreet(upStreet,upID);
                        break;
                    case 3:
                         System.out.println("Enter the City to be Update..");
                         upCity=sc.next();
                         UpdateCity( upCity,upID);
                         break;
                    case 4:
                         System.out.println("Enter the State to be Update..");
                         upState=sc.next();
                         UpdateState(upState,upID);
                         break;
                    case 5:
                         System.out.println("Enter the Country to be Update..");
                         upCountry=sc.next();
                         UpdateCountry(upCountry),upID;
                         break;
                    case 6:
                        System.out.println("Enter the pinCode to be Update..");
                        upPinCode=sc.nextInt();
                        UpdatePinCode( upPinCode),upID;
                        break;
                  }
                  break;
    }
    public void UpdateAge(int age,String empId)
    {
        for( BasicDetails basics : empDetails ){

            if(basics.getEmpId().equals(empId)){
                basics.setAge(age);
            }
        }
    }
    public void UpdateSalary(int salary,String empId)
    {
        for( BasicDetails basics : empDetails ){

            if(basics.getEmpId().equals(empId)){
                basics.setSalary(salary);
            }
        }
    }
    public void UpdateEmpCurrentCompany(String empCurrentCompany,String empId)
    {
        for( BasicDetails basics : empDetails ){

            if(basics.getEmpId().equals(empId)){
                basics.setEmpCurrentCompany(empCurrentCompany);
            }
        }
    }
    public void UpdateEmpPPreviousCompany(String empPreviousCompany,String empId)
    {
        for( BasicDetails basics : empDetails ){

            if(basics.getEmpId().equals(empId)){
                basics.setEmpPreviousCompany(empCurrentCompany);
            }
        }
    }
     public void UpdateDoorNo(String doorNo,String empId)
    {
        for( BasicDetails basics : empDetails ){

            if(basics.getEmpId().equals(empId)){
                basics.setDoorNo(doorNo);
            }
        }
    }
     public void UpdateStreet(String street,String empId)
    {
        for( BasicDetails basics : empDetails ){

            if(basics.getEmpId().equals(empId)){
                basics.setStreet(street);
            }
        }
    }
     public void UpdateCity(String city,String empId)
    {
        for( BasicDetails basics : empDetails ){

            if(basics.getEmpId().equals(empId)){
                basics.setCity(city);
            }
        }
    }
     public void UpdateState(String state,String empId)
    {
        for( BasicDetails basics : empDetails ){

            if(basics.getEmpId().equals(empId)){
                basics.setState(state);
            }
        }
    }
     public void UpdateCountry(String country,String empId)
    {
        for( BasicDetails basics : empDetails ){

            if(basics.getEmpId().equals(empId)){
                basics.setCountry(country);
            }
        }
    }
     public void UpdatePinCode(String pinCode,String empId)
    {
        for( BasicDetails basics : empDetails ){

            if(basics.getEmpId().equals(empId)){
                basics.setPinCode(pinCode);
            }
        }
    }


  }
>>>>>>> 7abf4fe0c1cfef0f0a811c60970f3594feef4828
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

<<<<<<< HEAD
=======
    
>>>>>>> 7abf4fe0c1cfef0f0a811c60970f3594feef4828

}
