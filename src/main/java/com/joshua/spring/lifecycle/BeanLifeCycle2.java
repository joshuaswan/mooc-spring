package com.joshua.spring.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by herendh on 8/24/16.
 */
public class BeanLifeCycle2 implements InitializingBean,DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("Bean destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean after.....`");
    }
}
