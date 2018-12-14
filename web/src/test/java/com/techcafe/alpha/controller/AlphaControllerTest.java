package com.techcafe.alpha.controller;

import com.techcafe.alpha.AlphaApplication;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by zlliu on 2018/12/14.
 */
@RunWith(value = SpringRunner.class)
@SpringBootTest(classes = AlphaApplication.class)
public class AlphaControllerTest {

    @Autowired
    private AlphaController alphaController;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void hello() {
        System.out.println(alphaController.hello());
    }
}