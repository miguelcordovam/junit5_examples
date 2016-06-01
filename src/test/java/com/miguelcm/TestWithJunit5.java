package com.miguelcm;

import org.junit.gen5.junit4.runner.JUnit5;
import org.junit.gen5.junit4.runner.Packages;
import org.junit.runner.RunWith;

@RunWith(JUnit5.class)
@Packages({"com.miguelcm"})
public class TestWithJunit5 {
    // Needed because there is no support for junit5 in intellij yet
    // If you don't add this, IDE won't recognize tests that are not public
}
