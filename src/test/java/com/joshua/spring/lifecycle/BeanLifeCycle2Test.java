package com.joshua.spring.lifecycle;

import com.joshua.spring.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by herendh on 8/24/16.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class BeanLifeCycle2Test extends UnitTestBase{

    public BeanLifeCycle2Test() {
        super("classpath:spring-lifecycle2.xml");
    }

    @Test
    public void test(){
        super.getBean("beanLifeCycle2");
    }
}