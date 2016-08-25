package com.joshua.spring.ioc.interfaces;

import com.joshua.spring.base.UnitTestBase;
import com.joshua.spring.ioc.injection.service.InjectionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by herendh on 8/7/16.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestInjection extends UnitTestBase{

    public TestInjection(){
        super("classpath:spring-injection.xml");
    }

    @Test
    public void testSetter(){
        InjectionService service = super.getBean("injectionService");
        service.save("this is the data will be saved!");
    }

    @Test
    public void testConstructor(){
        InjectionService service = super.getBean("injectionService");
        service.save("this is the data will be saved!");
    }
}
