package com.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEdit {
	@Autowired	
	public SpellChecker spellChecker;
	
	public TextEdit() {
		
		System.out.println(" HEllo TextEditor constructor ");
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}


		
	public void SpellCheck() {
		
		spellChecker.SpellChecker1();
		
	}
	
}
