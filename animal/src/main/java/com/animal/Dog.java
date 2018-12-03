package com.animal;

public class Dog implements WalkingAnimal, MakesSound {

    public String walk() {
        return "I am walking";
    }

    public String makeSound() {
        return "Woof, woof";
    }
}
