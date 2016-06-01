package com.miguelcm.assertions;

import org.junit.gen5.api.Test;
import org.junit.gen5.junit4.runner.JUnit5;
import org.junit.runner.RunWith;

import static org.junit.gen5.api.Assertions.assertEquals;

@RunWith(JUnit5.class)
class AssertionsTest {

    @Test
    void assertionShouldBeTru() {
        assertEquals(1 == 1, true);
    }

    @Test
    void assertionShouldBeTrueWithLambda() {
        // message is only computed and shown when assertion fails
        assertEquals(3 == 2, false, () -> "3 not equals to 2!");
    }
}
