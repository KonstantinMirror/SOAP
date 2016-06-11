package com.datalex.dao.db;


import com.datalex.dao.ICustomerDAO;

public class FabricDao {
    private static ICustomerDAO dao = null;
    public static ICustomerDAO getInstance(){
        if(dao==null){
            dao=new DbDao();
        }
        return dao;
    }
}
