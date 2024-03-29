package com.system.EmployeeManagement.employeeData;
public class BasicDetails {

	private String empName,empCurrentCompany,empPreviousCompany;
	private int salary,age,empId;
    private AddressDetails addressDetails;
    
    public BasicDetails(int empId, String empName, String empCurrentCompany, String empPreviousCompany, int salary,
            int age, AddressDetails addressDetails) {
        this.empId = empId;
        this.empName = empName;
        this.empCurrentCompany = empCurrentCompany;
        this.empPreviousCompany = empPreviousCompany;
        this.salary = salary;
        this.age = age;
        this.addressDetails=addressDetails;
    }
    public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpCurrentCompany() {
		return empCurrentCompany;
	}
	public void setEmpCurrentCompany(String empCurrentCompany) {
		this.empCurrentCompany = empCurrentCompany;
	}
	public String getEmpPreviousCompany() {
		return empPreviousCompany;
	}
	public void setEmpPreviousCompany(String empPreviousCompany) {
		this.empPreviousCompany = empPreviousCompany;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
    public AddressDetails getAddressDetails() {
        return addressDetails;
    }
    public void setAddressDetails(AddressDetails addressDetails) {
        this.addressDetails = addressDetails;
    }  
    
}
