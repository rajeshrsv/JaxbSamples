package com.jaxbsample.service.impl;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.jaxbsample.domain.Student;
import com.jaxbsample.service.IService;

public class Service implements IService {

	public void objectToXml(Student student) throws JAXBException {

		try {
			JAXBContext context = JAXBContext.newInstance(Student.class);
			Marshaller m = context.createMarshaller();
			// for pretty-print XML in JAXB
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

			// Write to System.out for debugging
			// m.marshal(emp, System.out);

			// Write to File
			m.marshal(student, new File("Student.xml"));
		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}

	public Student xmlToObject(String xml) throws Exception {

		try {
			JAXBContext context = JAXBContext.newInstance(Student.class);
			Unmarshaller un = context.createUnmarshaller();
			Student emp = (Student) un.unmarshal(new File(xml));
			return emp;
		} catch (JAXBException e) {
			throw new Exception(e);
		}
	}

}
