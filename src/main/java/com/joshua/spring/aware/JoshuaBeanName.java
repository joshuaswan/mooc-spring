package com.joshua.spring.aware;

import org.springframework.beans.factory.BeanNameAware;

/**
 * Created by herendh on 8/25/16.
 */
public class JoshuaBeanName implements BeanNameAware {
    public void setBeanName(String name) {
        System.out.println("JoshuaBeanName:" + name);
    }
}
