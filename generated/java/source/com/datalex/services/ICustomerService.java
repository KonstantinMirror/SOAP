
package com.datalex.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.1
 * 
 */
@WebService(name = "ICustomerService", targetNamespace = "http://services.datalex.com/")
@XmlSeeAlso({
    com.datalex.services.ObjectFactory.class,
    entity.datalex.com.ObjectFactory.class
})
public interface ICustomerService {


    /**
     * 
     * @return
     *     returns com.datalex.services.Customers
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCustomers", targetNamespace = "http://services.datalex.com/", className = "com.datalex.services.GetCustomers")
    @ResponseWrapper(localName = "getCustomersResponse", targetNamespace = "http://services.datalex.com/", className = "com.datalex.services.GetCustomersResponse")
    public Customers getCustomers();

    /**
     * 
     * @param id
     * @return
     *     returns com.datalex.services.Customer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCustomerById", targetNamespace = "http://services.datalex.com/", className = "com.datalex.services.GetCustomerById")
    @ResponseWrapper(localName = "getCustomerByIdResponse", targetNamespace = "http://services.datalex.com/", className = "com.datalex.services.GetCustomerByIdResponse")
    public Customer getCustomerById(
        @WebParam(name = "id", targetNamespace = "")
        long id);

    /**
     * 
     * @param id
     */
    @WebMethod
    @RequestWrapper(localName = "deleteCustomer", targetNamespace = "http://services.datalex.com/", className = "com.datalex.services.DeleteCustomer")
    @ResponseWrapper(localName = "deleteCustomerResponse", targetNamespace = "http://services.datalex.com/", className = "com.datalex.services.DeleteCustomerResponse")
    public void deleteCustomer(
        @WebParam(name = "id", targetNamespace = "")
        long id);

    /**
     * 
     * @param id
     * @param customer
     * @return
     *     returns com.datalex.services.Customer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateCustomer", targetNamespace = "http://services.datalex.com/", className = "com.datalex.services.UpdateCustomer")
    @ResponseWrapper(localName = "updateCustomerResponse", targetNamespace = "http://services.datalex.com/", className = "com.datalex.services.UpdateCustomerResponse")
    public Customer updateCustomer(
        @WebParam(name = "id", targetNamespace = "")
        long id,
        @WebParam(name = "customer", targetNamespace = "")
        Customer customer);

    /**
     * 
     * @param id
     * @return
     *     returns com.datalex.services.Customer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createCustomer", targetNamespace = "http://services.datalex.com/", className = "com.datalex.services.CreateCustomer")
    @ResponseWrapper(localName = "createCustomerResponse", targetNamespace = "http://services.datalex.com/", className = "com.datalex.services.CreateCustomerResponse")
    public Customer createCustomer(
        @WebParam(name = "id", targetNamespace = "")
        Customer id);

}
