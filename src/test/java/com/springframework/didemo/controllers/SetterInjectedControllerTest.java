package com.springframework.didemo.controllers;

import com.springframework.didemo.services.GreetingServiceImp;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp() throws Exception {
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImp());
    }

    @Test
    public void test() throws Exception {
        assertEquals(GreetingServiceImp.HELLO_GURUS, setterInjectedController.sayHello());
    }
}

