package com.joshua.spring.bean;

import com.joshua.spring.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by herendh on 8/16/16.
 */

@RunWith(BlockJUnit4ClassRunner.class)
public class BeanScopeTest extends UnitTestBase{

    public BeanScopeTest(){
        super("classpath*:spring-beanscope.xml");
    }

    @Test
    public void testSay(){
        BeanScope beanScope = super.getBean("beanScope");
        beanScope.say();

        BeanScope beanScope1 = super.getBean("beanScope");
        beanScope1.say();
    }

}