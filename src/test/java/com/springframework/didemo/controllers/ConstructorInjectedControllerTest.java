package com.springframework.didemo.controllers;

import com.springframework.didemo.services.GreetingServiceImp;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImp());
    }

    @Test
    public void test() throws  Exception {
        assertEquals(GreetingServiceImp.HELLO_GURUS, constructorInjectedController.sayHello());
    }
}
