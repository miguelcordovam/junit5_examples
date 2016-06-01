package com.miguelcm.displayname;

import org.junit.gen5.api.DisplayName;
import org.junit.gen5.api.Test;
import org.junit.gen5.junit4.runner.JUnit5;
import org.junit.runner.RunWith;

import static org.junit.gen5.api.Assertions.assertTrue;

@RunWith(JUnit5.class)
@DisplayName("Awesome test class :)")
class DisplayNameAnnotationTest {

    @DisplayName("This is a test with a fancy name")
    @Test
    void simpleTestWithName() {
        assertTrue(true);
    }

    @Test
    @DisplayName("Sum of two integers")
    void sumTest() {
        int a = 10;
        int b = 12;
        int c = a + b;

        assertTrue(c == a + b);

    }
}
