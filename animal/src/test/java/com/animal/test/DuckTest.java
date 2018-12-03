package com.animal.test;
import com.animal.Duck;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DuckTest {

    private Duck duck;

    public DuckTest() {
        this.duck = new Duck();
    }

    @Test
    public void testSing() {
        assertEquals("Quack, quack", duck.makeSound());
    }

    @Test
    public void testSwim() {
        assertEquals("I am swimming", duck.swim());
    }
}
