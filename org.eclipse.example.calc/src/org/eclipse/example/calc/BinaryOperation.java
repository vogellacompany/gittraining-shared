/*******************************************************************************
 * Copyright (C) 2010, Lars Vogel <lars.vogel@gmail.com>
 *
 * Alles meins!!!
 *******************************************************************************/
 
 /* Okay das ist ein Test hier von Steini und ein neues Feature zum Testen von Shared Training */
package org.eclipse.example.calc;

/**
 * Binary operation interface
 */
public interface BinaryOperation extends Operation {
	/**
	 * @param arg1 first parameter
	 * @param arg2 second parameter
	 * @return result of binary operation
	 */
	public float perform(float arg1, float arg2);
}
