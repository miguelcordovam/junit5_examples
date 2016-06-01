package com.miguelcm.parameters;

import org.junit.gen5.api.DisplayName;
import org.junit.gen5.api.Test;
import org.junit.gen5.api.TestInfo;
import org.junit.gen5.api.TestReporter;
import org.junit.gen5.junit4.runner.JUnit5;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;

@RunWith(JUnit5.class)
class ResolversTest {

    @Test
    @DisplayName("awesome test")
    void shouldAssertTrue(TestInfo info, TestReporter reporter) {

        System.out.println("Test " + info.getDisplayName() + " is executed");

        assertTrue(true);

        reporter.publishEntry("a key", "a value");
    }

}
