package com.datalex.services;

import com.datalex.dao.db.FabricDao;
import com.datalex.dao.ICustomerDAO;

import javax.jws.WebService;

@WebService
public class CustomerServiceImpl implements ICustomerService {

    ICustomerDAO customerDAO;

    public CustomerServiceImpl() {
        customerDAO = FabricDao.getInstance();
    }


    @Override
    public Customer getCustomerById(long id) {
        Customer customer = customerDAO.getCustomerById(id);
        return customer;
    }

    @Override
    public void deleteCustomer(long id) {
        customerDAO.deleteCustomer(id);
    }

    @Override
    public Customer updateCustomer(long id, Customer customer) {
        customer.setID(id);
        customerDAO.updateCustomerById(customer);
        return customer;
    }


    @Override
    public Customers getCustomers() {
        Customers customers = customerDAO.getAllCustomers();
        return customers;
    }


    @Override
    public Customer createCustomer(Customer customer) {
        customer = customerDAO.createCustomer(customer);
        return customer;
    }

}
