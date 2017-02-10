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

        service.marshaller(student, Student.class, "student.xml");
        System.out.println("@@@" + service.unmarshaller("student.xml", Student.class).toString());

        final Root root = new Root();

        root.setId("2");
        root.setName("<h1>Rajesh</h1>");
        root.setSurname("<h1>Subramaniam</h1>");

        service.marshaller(root, Root.class, "root.xml");
        System.out.println("@@@" + service.unmarshaller("root.xml", Root.class).toString());

    }

}
