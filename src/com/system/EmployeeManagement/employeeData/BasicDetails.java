package com.system.EmployeeManagement.employeeData;
public class BasicDetails {

	private String empId,empName,empCurrentCompany,empPreviousCompany;
	private int salary,age;
    private AddressDetails addressDetails;
    
	public BasicDetails(String empId, String empName, String empCurrentCompany, String empPreviousCompany, int salary,
            int age, AddressDetails addressDetails) {
        this.empId = empId;
        this.empName = empName;
        this.empCurrentCompany = empCurrentCompany;
        this.empPreviousCompany = empPreviousCompany;
        this.salary = salary;
        this.age = age;
        this.addressDetails=addressDetails;
    }
    public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
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

}
