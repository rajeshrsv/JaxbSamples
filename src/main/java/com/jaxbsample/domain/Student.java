package com.jaxbsample.domain;

import javax.xml.bind.annotation.XmlRootElement;

import com.sun.xml.internal.txw2.annotation.XmlElement;

@XmlRootElement
public class Student {

	private int studId;
	private String name;
	private String rollNo;
	private String deptName;

	private Address address;

	public Address getAddress() {
		return address;
	}

	@XmlElement
	public void setAddress(Address address) {
		this.address = address;
	}

	public int getStudId() {
		return studId;
	}

	@XmlElement
	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getName() {
		return name;
	}

	@XmlElement
	public void setName(String name) {
		this.name = name;
	}

	public String getRollNo() {
		return rollNo;
	}

	@XmlElement
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getDeptName() {
		return deptName;
	}

	@XmlElement
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

}
