package com.miguelcm.disable;

import org.junit.gen5.api.Test;
import org.junit.gen5.api.Disabled;
import org.junit.gen5.junit4.runner.JUnit5;
import org.junit.runner.RunWith;

import static org.junit.gen5.api.Assertions.assertTrue;
import static org.junit.gen5.api.Assertions.fail;

@RunWith(JUnit5.class)
class DisablingTest {

    @Test
    void simpleTest() {
        int a = 10;
        assertTrue(a == 10);
    }

    @Test
    @Disabled("test is skipped")
    void skippedTest() {
        fail("not implemented");
    }
}
