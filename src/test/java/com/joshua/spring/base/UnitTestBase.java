package com.joshua.spring.base;

import org.junit.After;
import org.junit.Before;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by herendh on 8/7/16.
 */
public class UnitTestBase {

//    FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("/home/herendh/workspace/mooc-spring/src/main/resources/spring-ioc.xml");
    private ClassPathXmlApplicationContext context;

    private String springXmlPath;

    public UnitTestBase(){}

    public UnitTestBase(String springXmlPath) {
        this.springXmlPath = springXmlPath;
    }

    @Before
    public void before(){
        springXmlPath = "classpath*:spring-*.xml";
        try {
            context = new ClassPathXmlApplicationContext(springXmlPath.split("[,\\s]+"));
            context.start();
        }catch (BeansException e){
            e.printStackTrace();
        }
    }

    @After
    public void after(){
        context.destroy();
    }

    @SuppressWarnings("unchecked")
    protected <T extends Object>T getBean(String beanId){
        try {
            return (T) context.getBean(beanId);
        }catch (BeansException e){
            e.printStackTrace();
            return null;
        }
    }

    protected <T extends  Object> T getBean(Class<T> tClass){
        try {
            return context.getBean(tClass);
        }catch (BeansException e){
            e.printStackTrace();
            return null;
        }
    }

}