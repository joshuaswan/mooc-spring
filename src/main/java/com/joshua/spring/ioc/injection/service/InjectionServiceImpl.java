package com.joshua.spring.ioc.injection.service;

import com.joshua.spring.ioc.injection.dao.InjectionDAO;

/**
 * Created by herendh on 8/7/16.
 */
public class InjectionServiceImpl implements InjectionService {

    private InjectionDAO injectionDAO;

    //constructor inject
    public InjectionServiceImpl(InjectionDAO injectionDAO){
        this.injectionDAO = injectionDAO;
    }

    //set the value inject
    public void setInjectionDAO(InjectionDAO injectionDAO){
        this.injectionDAO = injectionDAO;
    }

    @Override
    public void save(String arg) {
        //simulate the logic operation
        System.out.println("The args service received: " + arg);
        arg = arg + ":" + this.hashCode();
        injectionDAO.save(arg);
    }
}
