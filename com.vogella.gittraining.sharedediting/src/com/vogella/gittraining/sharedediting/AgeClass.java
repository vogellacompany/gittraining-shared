/**
 * 
 */
package com.vogella.gittraining.sharedediting;

/**
 * @author DE8PC061
 *
 */
public class AgeClass {

    // Andi Kommentar
	// Neuer Kommentar
    // Birgit Kommentar
	private final String name;
	
	private final Integer age;

	public AgeClass(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

//	getName
	public String getName() {
		return name + " - Suffix ";
	}

	public Integer getAge() {
		return age;
	}
	
	
	
	
	
}
