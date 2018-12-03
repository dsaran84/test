package com.animal.test;
import com.animal.Fish;
import com.animal.Shark;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SharkTest {

    private Shark shark;

    public SharkTest() {
        shark = new Shark();
    }

    @Test
    public void testSharkSize() {
        assertEquals("LARGE", shark.getSize());
    }

    @Test
    public void testSharkColor() {
        assertEquals("GREY", shark.getColor());
    }

    @Test
    public void testEat() {
        Fish fish = new Fish();
        assertEquals("I am eating another fish:" + fish, shark.eat(fish));
    }
}
