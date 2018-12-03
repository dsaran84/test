package com.animal.test;
import com.animal.Butterfly;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ButterflyTest {

    private Butterfly butterfly;

    public ButterflyTest() {
        this.butterfly = new Butterfly();
    }

    @Test
    public void testFly() {
        assertEquals("I am flying", butterfly.fly());
    }


}
