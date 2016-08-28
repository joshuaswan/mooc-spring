package com.joshua.spring.resource;

import com.joshua.spring.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Created by herendh on 8/26/16.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class JoshuaResourceTest extends UnitTestBase{

    public JoshuaResourceTest() {
        super("classpath*:spring-resource.xml");
    }


    @Test
    public void test() throws IOException {
        JoshuaResource resource = super.getBean("joshuaResource");
        resource.resource();
    }
}