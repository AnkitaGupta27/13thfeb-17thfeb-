package org.antwalk.model;

import org.antwalk.customvalidation.OrgName;

public class NewEmployee {
	private String firstName;
	
	private String lastName;
	@OrgName
	private String orgName;
	private String password;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public NewEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NewEmployee(String firstName, String lastName, String orgName, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.orgName = orgName;
		this.password = password;
	}

	
	
}
