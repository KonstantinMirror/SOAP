
package com.datalex.services.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.datalex.entity.Customer;

@XmlRootElement(name = "createCustomer", namespace = "http://services.datalex.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createCustomer", namespace = "http://services.datalex.com/")
public class CreateCustomer {

    @XmlElement(name = "arg0", namespace = "")
    private Customer arg0;

    /**
     * 
     * @return
     *     returns Customer
     */
    public Customer getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(Customer arg0) {
        this.arg0 = arg0;
    }

}
