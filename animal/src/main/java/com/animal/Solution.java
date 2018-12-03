package com.animal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                new Bird(), new Duck(), new Chicken(),
                new Rooster(), new Parrot(), new Fish(), 
                new Shark(), new Clownfish(), new Dolphin(), 
                new Frog(),
                new Dog(), new Butterfly(), new Cat() 
        };

        List<String> flyingAnimals = Arrays
                .stream(animals)
                .filter((x) -> x instanceof FlyingAnimal)
                .map((x) -> x.getClass().getSimpleName())
                .collect(Collectors.toList());

        List<String> walkingAnimals = Arrays
                .stream(animals)
                .filter((x) -> x instanceof WalkingAnimal)
                .map((x) -> x.getClass().getSimpleName())
                .collect(Collectors.toList());

        List<String> singingAnimals = Arrays
                .stream(animals)
                .filter((x) -> x instanceof MakesSound)
                .map((x) -> x.getClass().getSimpleName())
                .collect(Collectors.toList());

        List<String> swimmingAnimals = Arrays
                .stream(animals)
                .filter((x) -> x instanceof SwimmingAnimal)
                .map((x) -> x.getClass().getSimpleName())
                .collect(Collectors.toList());

        System.out.println("List contains...");
        System.out.println(" -> " + flyingAnimals.size() + " flying animals (not all birds fly) " + flyingAnimals);
        System.out.println(" -> " + walkingAnimals.size() + " walking animals " + walkingAnimals);
        System.out.println(" -> " + singingAnimals.size() + " singing animals or animals that make sounds " + singingAnimals);
        System.out.println(" -> " + swimmingAnimals.size() + " swimming animals " + swimmingAnimals);
        System.out.println(" -> " + new Rooster().makeSound(Language.FRENCH));
    }
}
