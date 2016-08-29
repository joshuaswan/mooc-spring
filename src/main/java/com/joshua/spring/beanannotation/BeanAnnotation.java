package com.joshua.spring.beanannotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by herendh on 8/29/16.
 */

@Component
//@Component("bean")
//@Scope("prototype")
@Scope
public class BeanAnnotation {
    public void say(String word){
        System.out.println("BeanAnnotation: " + word);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
