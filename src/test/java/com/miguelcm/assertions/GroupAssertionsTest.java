package com.miguelcm.assertions;

import org.junit.gen5.api.DisplayName;
import org.junit.gen5.api.Test;
import org.junit.gen5.junit4.runner.JUnit5;
import org.junit.runner.RunWith;

import static org.junit.gen5.api.Assertions.assertAll;
import static org.junit.gen5.api.Assertions.assertFalse;
import static org.junit.gen5.api.Assertions.assertTrue;

@RunWith(JUnit5.class)
class GroupAssertionsTest {

    @Test
    @DisplayName("grouping assertions")
    void groupedAssertionsAreValid() {
        assertAll(
                () -> assertTrue(true),
                () -> assertFalse(false)
        );
    }
}
