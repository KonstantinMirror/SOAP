package com.datalex.services;

import com.datalex.dao.db.FabricDao;
import com.datalex.entity.Customer;
import com.datalex.entity.Customers;
import com.datalex.dao.ICustomerDAO;

import javax.jws.WebParam;
import javax.jws.WebService;
import static javax.jws.WebParam.Mode.*;

@WebService(serviceName = "CustomerService",
        endpointInterface = "com.datalex.services.ICustomerService",
        portName ="CustomerServicePort" )
public class CustomerService implements ICustomerService {

    ICustomerDAO customerDAO;

    public CustomerService() {
        customerDAO = FabricDao.getInstance();
    }


    @Override
    public Customers getCustomers(){
       Customers customers = customerDAO.getAllCustomers();
        return customers;
    }


    @Override
    public Customer getCustomerById(@WebParam(name = "id-user", mode = IN)Long customerId){
        Customer customer = customerDAO.getCustomerById(customerId);
        return customer;
    }


    @Override
    public void deleteCustomer(@WebParam(name = "id-user", mode = IN)Long customerId){
        customerDAO.deleteCustomer(customerId);
        return;
    }

    @Override
    public Customer updateCustomer(@WebParam(name = "id-user", mode = IN)Long customerId,
                                   Customer customer){
        customer.setID(customerId);
        customerDAO.updateCustomerById(customer);
        return customer;
    }


    @Override
    public Customer createCustomer(Customer customer){
        customer = customerDAO.createCustomer(customer);
       return customer;
    }

}
