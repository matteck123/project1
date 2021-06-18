package com.revature.repos;

import java.util.List;

import com.revature.beans.Employee;

public interface EmployeeRepo {
	void updateEmployee(Integer employeeId);
	
	Employee getEmployee(String user, String pass);
	Employee getEmployee(Integer employeeId);
	List<String> getGenres(Integer employeeId);
}
