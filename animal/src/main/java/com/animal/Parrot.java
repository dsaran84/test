package com.animal;

public class Parrot extends Bird implements FlyingAnimal {

    private String song;

    public Parrot() {
        this.song = super.makeSound();
    }

    public Parrot(MakesSound animalThatMakesSound) {
        this.song = animalThatMakesSound.makeSound();
    }

    public String fly() {
        return "I am flying";
    }

    @Override
    public String makeSound() {
        return song;
    }

}
