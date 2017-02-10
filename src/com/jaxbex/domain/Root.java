/*
 * @author : gbs04503 * Created on: 10-Feb-2017 3:11:24 PM
 */
package com.jaxbex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Root {

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Root [name=" + name + ", surname=" + surname + ", id=" + id + "]";
    }

    @XmlJavaTypeAdapter(AdapterCDATA.class)
    private String name;

    @XmlJavaTypeAdapter(AdapterCDATA.class)
    private String surname;

    @XmlJavaTypeAdapter(AdapterCDATA.class)
    private String id;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(final String surname) {
        this.surname = surname;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(final String id) {
        this.id = id;
    }

}
