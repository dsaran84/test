package com.animal.test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.animal.Language;
import com.animal.Rooster;

public class SoundTranslatorTest {

    @Test
    public void testRoosterSoundTranslationToUrudu() {
        Rooster rooster = new Rooster();
        assertEquals("cocorico", rooster.makeSound(Language.FRENCH));
    }
}
