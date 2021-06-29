package com.spring;

import org.springframework.beans.factory.annotation.Autowired;


public class TextEditor {
	
	public SpellChecker spellChecker;  
	
	@Autowired
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}


	// this method belongs to TextEditor clas
	
	public void spellCheck() {
		
		spellChecker.checkSpelling();     // try to call anoth class funtionality here due have HAS -Relation ship
	}
	

}
