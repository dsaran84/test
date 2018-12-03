package com.animal.test;
import com.animal.Fish;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FishTest {

    private Fish fish;

    public FishTest() {
        this.fish = new Fish();
    }

    @Test
    public void testSwim() {
        assertEquals("I am swimming", fish.swim());
    }
}
