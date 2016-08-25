package com.joshua.spring.lifecycle;

import com.joshua.spring.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by herendh on 8/24/16.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class BeanLifeCycle3Test extends UnitTestBase{

    public BeanLifeCycle3Test() {
        super("classpath:spring-lifecycle3.xml");
    }

    @Test
    public void test(){
        super.getBean("beanLifeCycle3");
    }
}