package com.animal;

public class Cat implements WalkingAnimal, MakesSound {
    public String walk() {
        return "I am walking";
    }

    public String makeSound() {
        return "Meow";
    }
}
