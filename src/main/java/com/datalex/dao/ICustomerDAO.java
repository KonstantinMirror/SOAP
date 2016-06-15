package com.datalex.dao;


import com.datalex.services.Customer;
import com.datalex.services.Customers;

public interface ICustomerDAO {
    Customer getCustomerById(Long id);
    Customer updateCustomerById(Customer customer);
    void deleteCustomer(Long id);
    Customers getAllCustomers();
    Customer createCustomer(Customer customer);
}
