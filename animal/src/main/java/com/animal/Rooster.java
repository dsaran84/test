package com.animal;

public class Rooster extends Chicken {

    public String makeSound() {
        return "Cock-a-doodle-doo";
    }

    public String makeSound(Language language) {
        return SoundTranslator.translate(language,"rooster_sound");
    }
}
