package com.miguelcm.assertions;

import org.junit.gen5.api.Test;
import org.junit.gen5.junit4.runner.JUnit5;
import org.junit.runner.RunWith;

import static org.junit.gen5.api.Assertions.assertThrows;

@RunWith(JUnit5.class)
class ExceptionsTest {

    @Test
    void expectingArithmeticException() {
        assertThrows(ArithmeticException.class, () -> divideByZero());
    }

    int divideByZero() {
        return 10 / 0;
    }
}
