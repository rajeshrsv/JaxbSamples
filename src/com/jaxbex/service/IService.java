package com.jaxbex.service;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

public interface IService {

    String marshaller(Object object, Class<?> clazz) throws Exception;

    Object unmarshaller(String xml, Class<?> clazz) throws Exception;

    String jsonMarshaller(Object object) throws JsonProcessingException;

    Object jsonUnmarshaller(String jsonString, Class<?> clazz) throws JsonParseException, JsonMappingException, IOException;

}
