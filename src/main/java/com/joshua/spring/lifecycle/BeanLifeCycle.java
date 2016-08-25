package com.joshua.spring.lifecycle;

/**
 * Created by herendh on 8/24/16.
 */
public class BeanLifeCycle {
    public void stop() {
        System.out.println("Bean stop");
    }

    public void start() {
        System.out.println("Bean start");
    }
}
