package com.joshua.spring.beanannotation;

import com.joshua.spring.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by herendh on 8/29/16.
 */

//@RunWith(BlockJUnit4ClassRunner.class)
public class BeanAnnotationTest extends UnitTestBase{

    public BeanAnnotationTest() {
//        super("classpath*:spring-beanannotation.xml");
    }

    @Test
    public void testSay() throws Exception {
        BeanAnnotation beanAnnotation = super.getBean("beanAnnotation");
//        BeanAnnotation beanAnnotation = super.getBean("bean");
        beanAnnotation.say("Joshua");
    }

    @Test
    public void testScope() throws Exception {
        BeanAnnotation beanAnnotation = super.getBean("beanAnnotation");
        System.out.println(beanAnnotation.hashCode());

        beanAnnotation = super.getBean("beanAnnotation");
        System.out.println(beanAnnotation.hashCode());
    }
}