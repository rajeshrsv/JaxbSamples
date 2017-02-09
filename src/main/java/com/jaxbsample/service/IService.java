package com.jaxbsample.service;

import javax.xml.bind.JAXBException;

import com.jaxbsample.domain.Student;

public interface IService {
	
	void objectToXml(Student student) throws JAXBException;
	Student xmlToObject(String xml) throws Exception;

}
