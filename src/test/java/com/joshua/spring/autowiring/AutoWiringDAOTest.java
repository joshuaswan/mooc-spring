package com.joshua.spring.autowiring;

import com.joshua.spring.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by herendh on 8/26/16.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class AutoWiringDAOTest extends UnitTestBase {


    public AutoWiringDAOTest() {
        super("classpath:spring-autowiring.xml");
    }

    @Test
    public void test(){
        AutoWiringService service = super.getBean("autoWiringService");
        service.say(" this is a test");
    }

}