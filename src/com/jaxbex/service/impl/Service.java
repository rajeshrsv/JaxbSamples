package com.jaxbex.service.impl;


import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.jaxbex.service.IService;

public class Service implements IService {

    public void marshaller(final Object object, final Class<?> clzz, final String fileName) throws JAXBException {

        try {
            final JAXBContext context = JAXBContext.newInstance(clzz);
            final Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            m.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
            m.marshal(object, new File(fileName));
        } catch (final JAXBException e) {
            e.printStackTrace();
        }

        /*try {
            final StringWriter writer = new StringWriter();
            final JAXBContext context = JaxbContextCache.getInstance().getContext(pojoClass);
            final Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
            m.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
            m.marshal(pojo, writer);
            return writer.toString();
        } catch (final Exception e) {
            throw new UtilityException(e);
        }*/

    }

    public Object unmarshaller(final String xml, final Class<?> clzz) throws Exception {

        try {
            final JAXBContext context = JAXBContext.newInstance(clzz);
            final Unmarshaller un = context.createUnmarshaller();
            return un.unmarshal(new File(xml));
        } catch (final JAXBException e) {
            throw new Exception(e);
        }
    }

}
