package com.animal.test;
import com.animal.Chicken;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChickenTest {

    private Chicken chicken;

    public ChickenTest() {
        this.chicken = new Chicken();
    }

    @Test
    public void testSing() {
        assertEquals("Cluck, cluck", chicken.makeSound());
    }
}
