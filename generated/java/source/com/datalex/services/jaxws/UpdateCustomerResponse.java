
package com.datalex.services.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.datalex.entity.Customer;

@XmlRootElement(name = "updateCustomerResponse", namespace = "http://services.datalex.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateCustomerResponse", namespace = "http://services.datalex.com/")
public class UpdateCustomerResponse {

    @XmlElement(name = "return", namespace = "")
    private Customer _return;

    /**
     * 
     * @return
     *     returns Customer
     */
    public Customer getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(Customer _return) {
        this._return = _return;
    }

}
