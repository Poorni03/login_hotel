package com.infosys.project.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class AddressEntity {
	@Id
	@Column(name="CUSTOMERID", nullable = false)
	private int customerid;
	@Column(name="CITY", nullable = false)
	private String city;
	@Column(name="STATE", nullable = false)
	private String state;
	@Column(name="HOUSE", nullable = false)
	private int house;
	@Column(name="DISTRICT", nullable = false)
	private String district;
	
	
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getHouse() {
		return house;
	}
	public void setHouse(int house) {
		this.house = house;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	
	
	
	
	
	
	
	
	
	

}
