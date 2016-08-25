package com.joshua.spring.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by herendh on 8/25/16.
 */
public class JoshuaApplicationContext implements ApplicationContextAware {

//    private ApplicationContext applicationContext;
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//        this.applicationContext = applicationContext;
        System.out.println("JoshuaApplicationContext " + applicationContext.getBean("joshuaApplicationContext").hashCode());
    }
}
