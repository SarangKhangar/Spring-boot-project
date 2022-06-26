package com.zensar.bean;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	@Column
	private String dooeNumber;
	
	@Column
	private String cityName;
	
	@Column
	private String areaName;

	public Address(String dooeNumber, String cityName, String areaName) {
		super();
		this.dooeNumber = dooeNumber;
		this.cityName = cityName;
		this.areaName = areaName;
	}

	public Address() {
		super();
	}

	public String getDooeNumber() {
		return dooeNumber;
	}

	public void setDooeNumber(String dooeNumber) {
		this.dooeNumber = dooeNumber;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	@Override
	public String toString() {
		return "Address [dooeNumber=" + dooeNumber + ", cityName=" + cityName + ", areaName=" + areaName + "]";
	}

}
