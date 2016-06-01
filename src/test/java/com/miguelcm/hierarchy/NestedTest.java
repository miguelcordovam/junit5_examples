package com.miguelcm.hierarchy;

import org.junit.gen5.api.BeforeEach;
import org.junit.gen5.api.Nested;
import org.junit.gen5.api.Test;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

import static org.junit.gen5.api.Assertions.assertEquals;
import static org.junit.gen5.api.Assertions.assertTrue;
import static org.junit.gen5.api.Assertions.expectThrows;

class NestedTest {

    private Queue<String> items;

    @BeforeEach
    void setup() {
        items = new LinkedList<>();
    }

    @Test
    void isEmpty() {
        assertTrue(items.isEmpty());
    }

    @Nested
    class WhenEmpty {
        @Test
        public void removeShouldThrowException() {
            expectThrows(NoSuchElementException.class, items::remove);
        }
    }

    @Nested
    class WhenWithElements {
        @Test
        void addingOneElement() {
            items.add("item");
            assertEquals(items.size(), 1);
        }

        @Test
        void addingTwoElements() {
            items.clear();
            items.add("item1");
            items.add("item2");
            assertEquals(items.size(), 2);
        }
    }
}
