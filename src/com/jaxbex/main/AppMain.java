package com.jaxbex.main;

import com.jaxbex.domain.Address;
import com.jaxbex.domain.Root;
import com.jaxbex.domain.Student;
import com.jaxbex.service.IService;
import com.jaxbex.service.impl.Service;

public class AppMain {

    public static void main(final String[] args) throws Exception {

        final IService service = new Service();

        final Student student = new Student();
        student.setName("Rajesh");
        student.setAge(27);
        student.setGender("Male");
        student.setId(1);
        student.setPassword("test");
        student.setRole("science");

        final Address address = new Address();

        address.setCountry("India");
        address.setDoorNo("3/69");
        address.setPinCode(637002);
        address.setState("TN");

        student.setAddress(address);

        final String xmlInput = service.marshaller(student, Student.class);
        System.out.println("Object to XML :: " + xmlInput);
        System.out.println("XML to Java Object :: " + service.unmarshaller(xmlInput, Student.class).toString());

        final Root root = new Root();

        root.setId("2");
        root.setName("<h1>Rajesh</h1>");
        root.setSurname("<h1>Subramaniam</h1>");

        final String xmlInputRoot = service.marshaller(root, Root.class);
        System.out.println("Object to XML : " + xmlInputRoot);
        System.out.println("XML to Object" + service.unmarshaller(xmlInputRoot, Root.class).toString());

        final String jsonString = service.jsonMarshaller(student);

        System.out.println("Object to JSON :: " + jsonString);

        System.out.println("JSON to Java Object :: " + (service.jsonUnmarshaller(jsonString, Student.class)).toString());

    }
}
