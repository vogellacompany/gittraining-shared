/*******************************************************************************
 * Copyright (C) 2010, Lars Vogel <lars.vogel@gmail.com>
 *
 * Alles meins!!!
 *******************************************************************************/
package org.eclipse.example.calc;

// another interface 

/**d
 * Binary operation interface
 */
public interface BinaryOperation extends Operation {
	// Kommentar neu
	/**
	 * @param arg1 first parameter
	 * @param arg2 second parameter
	 * @return result of binary operation
	 */
	public float perform(float arg1, float arg2);
}
