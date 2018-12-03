package com.animal.test;
import com.animal.Cat;
import com.animal.Dog;
import com.animal.Parrot;
import com.animal.Rooster;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParrotTest {

    @Test
    public void testParrotLivingWithDogs() {
        Parrot parrotThatLivesWithDogs = new Parrot(new Dog());
        assertEquals("Woof, woof", parrotThatLivesWithDogs.makeSound());
    }

    @Test
    public void testParrotLivingWithCats() {
        Parrot parrotThatLivesWithCats = new Parrot(new Cat());
        assertEquals("Meow", parrotThatLivesWithCats.makeSound());
    }

    @Test
    public void testParrotLivingWithRooster() {
        Parrot parrotThatLivesWithRooster = new Parrot(new Rooster());
        assertEquals("Cock-a-doodle-doo", parrotThatLivesWithRooster.makeSound());
    }
}
