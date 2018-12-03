package com.animal.test;
import com.animal.Bird;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BirdTest {

    private Bird bird;

    public BirdTest() {
        this.bird = new Bird();
    }

    @Test
    public void testWalk() {
        assertEquals("I am walking", bird.walk());
    }

    @Test
    public void testSing() {
        assertEquals("I am singing", bird.makeSound());
    }

}
