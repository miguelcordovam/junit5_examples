package com.miguelcm.assertions;

import org.junit.gen5.api.Test;
import org.junit.gen5.junit4.runner.JUnit5;
import org.junit.runner.RunWith;

import static org.junit.gen5.api.Assertions.assertEquals;
import static org.junit.gen5.api.Assertions.expectThrows;

@RunWith(JUnit5.class)
class ExceptionsVariableTest {

    @Test
    void expectingArithmeticException() {

        StringIndexOutOfBoundsException exception =
                expectThrows(StringIndexOutOfBoundsException.class,
                        () -> "Learning Junit5".substring(-1));

        assertEquals(exception.getMessage(), "String index out of range: -1");
    }
}
