package com.datalex.customerservice;

import com.datalex.entity.Customer;
import com.datalex.entity.Customers;
import com.datalex.dao.ICustomerDAO;
import com.datalex.dao.db.DbDao;


public class CustomerService {
    ICustomerDAO customerDAO;

    public CustomerService() {
        customerDAO = new DbDao();
    }


    public Customers getCustomers(){
       Customers customers = customerDAO.getAllCustomers();
        return customers;
    }


    public Customer getCustomerById(Long customerId){
        Customer customer = customerDAO.getCustomerById(customerId);
        return customer;
    }


    public void deleteCustomer(Long customerId){
        customerDAO.deleteCustomer(customerId);
        return;
    }

    public Customer updateCustomer( Long customerId,Customer customer){
        customer.setID(customerId);
        customerDAO.updateCustomerById(customer);
        return customer;
    }


    public Customer createCustomer(Customer customer){
        customer = customerDAO.createCustomer(customer);
       return customer;
    }

}
