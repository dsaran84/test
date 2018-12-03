package com.animal;

import java.util.Locale;

public enum Language {
    FRENCH("fr","FR");
	
	private String langCode;
	private String countryCode;
	
	Language(String langCode, String countryCode) {
		this.langCode = langCode;
		this.countryCode = countryCode;
	}
	
	public Locale getLocale() {
		return new Locale(langCode, countryCode);
	}
}
