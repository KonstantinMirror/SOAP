
package com.datalex.services.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getCustomerById", namespace = "http://services.datalex.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCustomerById", namespace = "http://services.datalex.com/")
public class GetCustomerById {

    @XmlElement(name = "arg0", namespace = "")
    private Long arg0;

    /**
     * 
     * @return
     *     returns Long
     */
    public Long getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(Long arg0) {
        this.arg0 = arg0;
    }

}
