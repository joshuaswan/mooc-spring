package com.joshua.spring.ioc.interfaces;

/**
 * Created by herendh on 8/7/16.
 */
public class OneInterfaceImpl implements OneInterface {

    @Override
    public String hello(String word) {
        return "Word from interface \"OneInterface\": " + word;
    }
}
