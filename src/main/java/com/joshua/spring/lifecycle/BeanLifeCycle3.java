package com.joshua.spring.lifecycle;

/**
 * Created by herendh on 8/24/16.
 */
public class BeanLifeCycle3 {

    public void defaultInit(){
        System.out.println("Bean default init");
    }

    public void defaultDestroy(){
        System.out.println("Bean default destroy");
    }
}
