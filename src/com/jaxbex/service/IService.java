package com.jaxbex.service;

import javax.xml.bind.JAXBException;

public interface IService {

    void marshaller(Object object, Class<?> clazz, String fileName) throws JAXBException;

    Object unmarshaller(String xml, Class<?> clazz) throws Exception;

}
