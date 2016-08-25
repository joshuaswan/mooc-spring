package com.joshua.spring.ioc.injection.dao;

/**
 * Created by herendh on 8/7/16.
 */
public class InjectionDAOImpl implements InjectionDAO {
    @Override
    public void save(String arg) {
        //simulate save the data to a database
        System.out.println("save the data: " + arg);
    }
}
