package com.joshua.spring.resource;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

import java.io.IOException;

/**
 * Created by herendh on 8/26/16.
 */
public class JoshuaResource implements ApplicationContextAware {

    private ApplicationContext applicationContext;
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void resource() throws IOException {
//        Resource resource = applicationContext.getResource("classpath:config.txt");
//        Resource resource = applicationContext.getResource("file:/home/herendh/github/mooc-spring/src/main/resources/config.txt");
//        Resource resource = applicationContext.getResource("url:http://192.168.1.76/report.html");
        Resource resource = applicationContext.getResource("config.txt");
        System.out.println(resource.getFilename());
        System.out.println(resource.contentLength());
    }
}
