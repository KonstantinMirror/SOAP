package com.datalex.services;

import com.datalex.entity.Customer;
import com.datalex.entity.Customers;

import javax.jws.WebService;

@WebService(name="ICustomerService")
public interface ICustomerService {

    Customers getCustomers();

    Customer getCustomerById(Long customerId);

    void deleteCustomer(Long customerId);

    Customer updateCustomer(Long customerId, Customer customer);

    Customer createCustomer(Customer customer);
}
