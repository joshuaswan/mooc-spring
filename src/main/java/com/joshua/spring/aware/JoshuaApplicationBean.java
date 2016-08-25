package com.joshua.spring.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by herendh on 8/25/16.
 */
public class JoshuaApplicationBean implements BeanNameAware,ApplicationContextAware {

    private String beanName;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext" + applicationContext.getBean(this.beanName).hashCode());
    }

    public void setBeanName(String name) {
        beanName = name;
        System.out.println("joshuaApplicationBean:" + name);
    }
}
