package com.miguelcm;

import org.junit.gen5.api.Test;
import org.junit.gen5.junit4.runner.JUnit5;
import org.junit.runner.RunWith;

import static org.junit.gen5.api.Assertions.assertTrue;

@RunWith(JUnit5.class)
class FirstTest {

    @Test
    void testFirst() throws Exception {
        System.out.println("test");
        assertTrue(true);
    }
}