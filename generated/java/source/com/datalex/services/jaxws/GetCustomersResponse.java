
package com.datalex.services.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.datalex.entity.Customers;

@XmlRootElement(name = "getCustomersResponse", namespace = "http://services.datalex.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCustomersResponse", namespace = "http://services.datalex.com/")
public class GetCustomersResponse {

    @XmlElement(name = "return", namespace = "")
    private Customers _return;

    /**
     * 
     * @return
     *     returns Customers
     */
    public Customers getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(Customers _return) {
        this._return = _return;
    }

}
