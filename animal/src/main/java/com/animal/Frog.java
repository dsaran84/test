package com.animal;

public class Frog implements WalkingAnimal, SwimmingAnimal, MakesSound {

    public String walk() {
        return "I am jumping";
    }

    public String makeSound() {
        return "Crouk, crouk";
    }

	public String swim() {
		return "I am swimming";
	}
}
