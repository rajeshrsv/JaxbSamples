package com.jaxbsample.main;

import com.jaxbsample.domain.Address;
import com.jaxbsample.domain.Student;
import com.jaxbsample.service.IService;
import com.jaxbsample.service.impl.Service;

public class AppMain {

	public static void main(String[] args) throws Exception {
		IService service = new Service();
		Student student = new Student();
		student.setName("Rajesh");
		student.setAge(27);
		student.setGender("Male");
		student.setId(1);
		student.setPassword("test");
		student.setRole("science");
		
		
		Address address = new Address();
		
		address.setCountry("India");
		address.setDoorNo("3/69");
		address.setPinCode(637002);
		address.setState("TN");
		
		
		student.setAddress(address);
		
		service.objectToXml(student);
		
		System.out.println(service.xmlToObject("Student.xml").toString());
		

	}

}
