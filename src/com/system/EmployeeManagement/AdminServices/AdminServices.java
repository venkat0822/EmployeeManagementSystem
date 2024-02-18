package com.system.EmployeeManagement.AdminServices;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

import com.system.EmployeeManagement.AdminData.AdminDetails;
import com.system.EmployeeManagement.employeeData.AddressDetails;
import com.system.EmployeeManagement.employeeData.BasicDetails;

public class AdminServices {
    public LinkedList<AdminDetails> adList = AdminDetails.returnList();

    public static LinkedList<BasicDetails> empDetails = new LinkedList<>();

    Scanner sc=new Scanner(System.in);
    public void AddEmployee()
    {
        String empName,empCurrentCompany,empPreviousCompany,street,city,state,country;
	    int salary,age, doorNo,pinCode,empId;
        System.out.println("Enter  Basic Details.....");
        System.out.println("Enter Employee ID");
        empId=sc.nextInt();
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
        System.out.println("Enter Address Details...");
        System.out.println("Enter Door No");
        doorNo=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Street Name");
        street=sc.nextLine();
        System.out.println("Enter City Name");
        city=sc.nextLine();
        System.out.println("Enter State Name");
        state=sc.nextLine();
        System.out.println("Enter Country Name");
        country=sc.nextLine();
        System.out.println("Enter Pin Code");
        pinCode=sc.nextInt();

        AddressDetails ad =new AddressDetails(doorNo,pinCode,street,city,state,country);
        BasicDetails basic=new BasicDetails(empId,empName,empCurrentCompany,empPreviousCompany,salary,
           age, ad) ;

        empDetails.add(basic);
    }

  public void UpdateEmployee()
  {
    String upEmpCurrentCompany,upEmpPreviousCompany,upStreet,upCity,upState,upCountry;
	int upSalary,upAge,upDoorNo,upPinCode,upID;
    System.out.println("Enter Employee ID");
    upID=sc.nextInt();
    System.out.println("Enter the details Which to be Update....");
    System.out.println("1.Basic Details\n2.Address Details....");
    System.out.println("Enter the choice(1/2): ");
    switch(sc.nextInt())
    {
        case 1:
            System.out.println("Enter which basic detail to be Updated..");
            System.out.println("1.Age\n2.Salary\n3.Current Company\n4.previous Company");
            System.out.println("Enter the choice(1/2/3/4): ");
            switch(sc.nextInt())
            {
                case 1:
                    System.out.println("Enter the Age to be Update...");
                    upAge=sc.nextInt();
                    UpdateAge(upAge,upID);
                    break;
                case 2:
                    System.out.println("Enter the Salary to be Update...");
                    upSalary=sc.nextInt();
                    UpdateSalary(upSalary,upID);
                    break;
                case 3:
                    System.out.println("Enter the Current Company to be Update...");
                    upEmpCurrentCompany=sc.next();
                    UpdateEmpCurrentCompany(upEmpCurrentCompany,upID);
                    break;
                case 4:
                    System.out.println("Enter the previous Company to be Update...");
                    upEmpPreviousCompany=sc.next();
                    UpdateEmpPPreviousCompany(upEmpPreviousCompany,upID);
                    break;
                default:
                    System.out.println("Enter valid choice!");
            }
            break;
            case 2:
                System.out.println("Enter which Address detail to be Update..");
                System.out.println("1.DoorNo\n2.Street\n3.City\n4.State\n5.Country\n6.PinCode");
                System.out.println("Enter the choice(1/2/3/4/5/6): ");
                switch(sc.nextInt())
                {
                    case 1:
                        System.out.println("Enter the Door No to be Update..");
                        upDoorNo=sc.nextInt();
                        UpdateDoorNo( upDoorNo,upID);
                        break;
                    case 2:
                        System.out.println("Enter the Street Name to be Update..");
                        upStreet=sc.nextLine();
                        UpdateStreet(upStreet,upID);
                        break;
                    case 3:
                         System.out.println("Enter the City to be Update..");
                         upCity=sc.nextLine();
                         UpdateCity( upCity,upID);
                         break;
                    case 4:
                         System.out.println("Enter the State to be Update..");
                         upState=sc.nextLine();
                         UpdateState(upState,upID);
                         break;
                    case 5:
                         System.out.println("Enter the Country to be Update..");
                         upCountry=sc.nextLine();
                         UpdateCountry(upCountry,upID);
                         break;
                    case 6:
                        System.out.println("Enter the pinCode to be Update..");
                        upPinCode=sc.nextInt();
                        UpdatePinCode(upPinCode,upID);
                        break;
                    default:
                        System.out.println("Enter a valid option for Updating!!");
                }
                break;
            default:
                System.out.println("Enter a valid option !!");
            }
    }
    public void UpdateAge(int age,int empId)
    {
        for( BasicDetails basics : empDetails ){

            if(basics.getEmpId()==empId){
                basics.setAge(age);
            }
        }
    }
    public void UpdateSalary(int salary,int empId)
    {
        for( BasicDetails basics : empDetails ){

            if(basics.getEmpId()==empId){
                basics.setSalary(salary);
            }
        }
    }
    public void UpdateEmpCurrentCompany(String empCurrentCompany,int empId)
    {
        for( BasicDetails basics : empDetails ){

            if(basics.getEmpId()==empId){
                basics.setEmpCurrentCompany(empCurrentCompany);
            }
        }
    }
    public void UpdateEmpPPreviousCompany(String empPreviousCompany,int empId)
    {
        for( BasicDetails basics : empDetails ){

            if(basics.getEmpId()==empId){
                basics.setEmpPreviousCompany(empPreviousCompany);
            }
        }
    }
     public void UpdateDoorNo(int doorNo,int empId)
    {
        for( BasicDetails basics : empDetails ){

            if(basics.getEmpId()==empId){
                basics.getAddressDetails().setDoorNo(doorNo);
            }
        }
    }
     public void UpdateStreet(String street,int empId)
    {
        for( BasicDetails basics : empDetails ){

            if(basics.getEmpId()==empId){
                basics.getAddressDetails().setStreet(street);
            }
        }
    }
     public void UpdateCity(String city,int empId)
    {
        for( BasicDetails basics : empDetails ){

            if(basics.getEmpId()==empId){
                basics.getAddressDetails().setCity(city);
            }
        }
    }
     public void UpdateState(String state,int empId)
    {
        for( BasicDetails basics : empDetails ){

            if(basics.getEmpId()==empId){
                basics.getAddressDetails().setState(state);
            }
        }
    }
     public void UpdateCountry(String country,int empId)
    {
        for( BasicDetails basics : empDetails ){

            if(basics.getEmpId()==empId){
                basics.getAddressDetails().setCountry(country);;;
            }
        }
    }
     public void UpdatePinCode(int pinCode,int empId)
    {
        for( BasicDetails basics : empDetails ){

            if(basics.getEmpId()==empId){
                basics.getAddressDetails().setPinCode(pinCode);
            }
        }
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

    public boolean checkifEmployeeExistsById(int id){
        
        for(BasicDetails basic: empDetails) {
			if(basic.getEmpId()==id)
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

    public void viewEmployeeById(int id){

        for(BasicDetails basic: empDetails){

            if(basic.getEmpId()==id){
                
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
    public void SortEmployee() {
		
    	Comparator<BasicDetails> sortById = Comparator.comparingInt(BasicDetails::getEmpId);
    	Collections.sort(empDetails,sortById);
    	viewAllEmployee();
    }
}
