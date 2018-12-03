package com.animal;

public class Bird implements WalkingAnimal, MakesSound {

    public String walk() {
        return "I am walking";
    }

    public String makeSound() {
        return "I am singing";
    }
}
