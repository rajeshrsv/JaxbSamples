package com.jaxbex.service.impl;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jaxbex.service.IService;

public class Service implements IService {

    public String marshaller(final Object object, final Class<?> clzz) throws Exception {

        try {
            final StringWriter output = new StringWriter();
            final JAXBContext context = JAXBContext.newInstance(clzz);
            final Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            m.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
            m.marshal(object, output);
            return output.toString();
        } catch (final JAXBException e) {
            e.printStackTrace();
            throw new Exception(e);
        }
    }

    public Object unmarshaller(final String xmlInput, final Class<?> clzz) throws Exception {

        try {
            final JAXBContext context = JAXBContext.newInstance(clzz);
            final Unmarshaller un = context.createUnmarshaller();

            final InputStream stream = new ByteArrayInputStream(xmlInput.getBytes(StandardCharsets.UTF_8));

            final Object data = un.unmarshal(stream);
            return data;
        } catch (final JAXBException e) {
            throw new Exception(e);
        }
    }

    @Override
    public String jsonMarshaller(final Object object) throws JsonProcessingException {
        //objectMapper.writeValue(new File("file.json"), student);
        return new ObjectMapper().writeValueAsString(object);

    }

    @Override
    public Object jsonUnmarshaller(final String jsonString, final Class<?> clazz) throws JsonParseException, JsonMappingException, IOException {
        //final Student obj1 = objectMapper.readValue(new File("file.json"), Student.class);
        return new ObjectMapper().readValue(jsonString, clazz);
    }

}
