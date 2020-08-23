package com.infosys.project.user.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class CustomerEntity {
	@Id
	@Column(name="CUSTOMERID", nullable = false)
	private int customerid;
	@Column(name="NAME", nullable = false)
	private String name;
	@Column(name="EMAIL", nullable = false)
	private String email;
	@Column(name="PHOMENUMBER", nullable = false)
	private String phonenumber;
	@Column(name="PASSWORD", nullable = false)
	private String password;
	@JoinColumn(name="customerid", unique = true)
	@OneToOne(cascade = CascadeType.ALL)
	private AddressEntity address;
	
	
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
	
}
