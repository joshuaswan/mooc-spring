package com.joshua.spring.aware;

import com.joshua.spring.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by herendh on 8/25/16.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class JoshuaApplicationBeanTest extends UnitTestBase{
    public JoshuaApplicationBeanTest() {
        super("classpath*:spring-aware.xml");
    }

    @Test
    public void testJoshuaApplicationBean(){
        System.out.println("testJoshuaApplicationBean:" + super.getBean("joshuaApplicationBean").hashCode());
    }
}