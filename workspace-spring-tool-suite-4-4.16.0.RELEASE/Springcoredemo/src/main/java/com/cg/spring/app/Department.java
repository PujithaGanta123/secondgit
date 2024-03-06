package com.cg.spring.app;

import java.util.List;

public class Department {
	private int departmentId;
	private List<Staff> staffs;
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public List<Staff> getStaffs() {
		return staffs;
	}
	public void setStaffs(List<Staff> staffs) {
		this.staffs = staffs;
	}
	public Department(int departmentId, List<Staff> staffs) {
		this.departmentId = departmentId;
		this.staffs = staffs;
	}
	public void displayStaffDetails()
	{
		for(Staff s:staffs)
		{
			System.out.println("Staff Details:");
			System.out.println("Staff Id: " + s.getStaffId());
			System.out.println("StaffName: " + s.getStaffName());
			System.out.println("Contact No: " + s.getContactNo());
			System.out.println("DepartmentName: " + s.getDepartmentName());
			System.out.println("Department Id: " + departmentId);

		}
	}
	public Department() {
	}
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", staffs=" + staffs + "]";
	}

}
