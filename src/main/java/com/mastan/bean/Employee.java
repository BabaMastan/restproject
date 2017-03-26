package com.mastan.bean;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

public class Employee {
	private String name;
	private Integer id;
	private String designation;
	private Integer salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public Employee(){
		
	}
	public Employee(Integer id, String name, Integer salary, String designation) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation= designation;	
	}
	public  JSONObject toJSON()
	{
		JSONObject response = new JSONObject();
		try {
		response.put("id", this.id);
		response.put("name", this.name);
		response.put("salary", this.salary);
		response.put("designation", this.designation);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return response;
	}

}
