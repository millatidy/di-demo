package com.springframework.didemo.controllers;

import com.springframework.didemo.services.GreetingServiceImp;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingServiceImp = new GreetingServiceImp();
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImp.HELLO_GURUS, propertyInjectedController.sayHello());
    }

}
