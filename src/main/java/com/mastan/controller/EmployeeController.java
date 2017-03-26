package com.mastan.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.mastan.service.EmployeeService;

import com.mastan.bean.Employee;
import com.sun.jersey.json.impl.provider.entity.JSONArrayProvider;



@Path("employee")
public class EmployeeController {
		EmployeeService employeeService = new EmployeeService();
	 
	 @GET
	    @Produces(MediaType.APPLICATION_JSON)
		public List<Employee> getCountries()
		{
			
			List<Employee> listOfEmployees=employeeService.getAllCountries();
			return listOfEmployees;
		}

	    @GET
	    @Path("/{id}")
	    @Produces(MediaType.APPLICATION_JSON)
		public Employee getEmployeeById(@PathParam("id") int id)
		{
			return employeeService.getEmployee(id);
		}
	   
	    @POST
	    @Produces(MediaType.APPLICATION_JSON)
		public Employee addEmployee(Employee country)
		{
			return employeeService.addEmployee(country);
		}

	    @PUT
	    @Produces(MediaType.APPLICATION_JSON)
		public Employee updateEmployee(Employee country)
		{
			return employeeService.updateEmployee(country);
			
		}
		
	    @DELETE
	    @Path("/{id}")
	    @Produces(MediaType.APPLICATION_JSON)
		public void deleteEmployee(@PathParam("id") int id)
		{
			 employeeService.deleteEmployee(id);
			
		}

}
