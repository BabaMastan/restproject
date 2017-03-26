package org.mastan.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


import com.mastan.bean.Employee;

public class EmployeeService {
	static HashMap<Integer,Employee> employeeIdMap=getEmployeeIdMap();


	public EmployeeService() {
		super();

		if(employeeIdMap==null)
		{
			employeeIdMap=new HashMap<Integer,Employee>();
		// Creating some object of countries while initializing
			Employee indiaEmployee=new Employee(1, "India",10000,"Manager");
			Employee chinaEmployee=new Employee(4, "China",10000,"Manager");
			Employee nepalEmployee=new Employee(3, "Nepal",8000,"Manager");
			Employee bhutanEmployee=new Employee(2, "Bhutan",7000,"Manager");


			employeeIdMap.put(1,indiaEmployee);
			employeeIdMap.put(4,chinaEmployee);
			employeeIdMap.put(3,nepalEmployee);
			employeeIdMap.put(2,bhutanEmployee);
		}
	}

	public List<Employee> getAllCountries()
	{
		List<Employee> employees = new ArrayList<Employee>(employeeIdMap.values());
		return employees;
	}

	public Employee getEmployee(int id)
	{
		Employee emp= employeeIdMap.get(id);
		return emp;
	}
	public Employee addEmployee(Employee emp)
	{
		emp.setId(employeeIdMap.size()+1);
		employeeIdMap.put(emp.getId(), emp);
		return emp;
	}
	
	public Employee updateEmployee(Employee emp)
	{
		if(emp.getId()<=0)
			return null;
		employeeIdMap.put(emp.getId(), emp);
		return emp;

	}
	public void deleteEmployee(int id)
	{
		employeeIdMap.remove(id);
	}

	public static HashMap<Integer, Employee> getEmployeeIdMap() {
		return employeeIdMap;
	}

}
