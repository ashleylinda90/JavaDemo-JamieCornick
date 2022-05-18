package com.keyin.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DemoTest {

    @Test
    public void testReturnsTrue() {
        Assertions.assertTrue(new Demo().returnTrue());
    }
}
