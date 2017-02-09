package com.jaxbsample.domain;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Address {

	private int addrId;
	private String doorNo;
	private String street;
	private String district;
	private String state;
	private String country;
	private int pinCode;

	public int getAddrId() {
		return addrId;
	}

	@XmlElement
	public void setAddrId(int addrId) {
		this.addrId = addrId;
	}

	@Override
	public String toString() {
		return "Address [addrId=" + addrId + ", doorNo=" + doorNo + ", street=" + street + ", district=" + district
				+ ", state=" + state + ", country=" + country + ", pinCode=" + pinCode + "]";
	}

	public String getDoorNo() {
		return doorNo;
	}

	@XmlElement
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public String getStreet() {
		return street;
	}

	@XmlElement
	public void setStreet(String street) {
		this.street = street;
	}

	public String getDistrict() {
		return district;
	}

	@XmlElement
	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	@XmlElement
	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	@XmlElement
	public void setCountry(String country) {
		this.country = country;
	}

	public int getPinCode() {
		return pinCode;
	}

	@XmlElement
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

}
