/*
 * @author : gbs04503 * Created on: 10-Feb-2017 3:30:52 PM
 */
package com.jaxbex.domain;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class AdapterCDATA extends XmlAdapter<String, String> {

    @Override
    public String marshal(final String data) throws Exception {
        return "<![CDATA[" + data + "]]>";
    }

    @Override
    public String unmarshal(final String data) throws Exception {
        return data;
    }

}
