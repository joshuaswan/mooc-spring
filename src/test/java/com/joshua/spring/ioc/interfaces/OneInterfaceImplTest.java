package com.joshua.spring.ioc.interfaces;


import com.joshua.spring.base.UnitTestBase;
import com.joshua.spring.ioc.interfaces.OneInterface;
import com.joshua.spring.ioc.interfaces.OneInterfaceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by herendh on 8/7/16.
 */

@RunWith(BlockJUnit4ClassRunner.class)
public class OneInterfaceImplTest extends UnitTestBase {

    @Test
    public void testHello() throws Exception {
        OneInterface oneInterface = new OneInterfaceImpl();

        System.out.println(oneInterface.hello("Joshua."));
    }

    public OneInterfaceImplTest(){
        super("classpath*:spring-ioc.xml");
    }

    @Test
    public void testHello1() {
        OneInterface oneInterface = super.getBean("oneInterface");
        System.out.println(oneInterface.hello("The args I input!"));
    }
}