package com.animal;

import java.util.Locale;
import java.util.ResourceBundle;

public class SoundTranslator {

    public static String translate(Language lang, String key) {
    	return getResourceBundle(lang.getLocale()).getString(key);
    }
    
    public static ResourceBundle getResourceBundle(Locale locale) {
    	return ResourceBundle.getBundle("MessageBundle",locale);
    }

}
