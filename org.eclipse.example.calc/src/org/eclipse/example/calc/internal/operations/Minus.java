/*******************************************************************************
 * Copyright (C) 2010, Matthias Sohn <matthias.sohn@sap.com>
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.example.calc.internal.operations;

import org.eclipse.example.calc.BinaryOperation;

/**
 * Binary minus operation
 */
// THIS IS A MINUS Operation
public class Minus extends AbstractOperation implements BinaryOperation {

	@Override
	public float perform(float arg1, float arg2) {
<<<<<<< HEAD
		return arg1 - arg2 - 10;
=======
		return arg1 - arg2;
		
		
>>>>>>> refs/remotes/origin/master
	}

	@Override
	public String getName() {
		return "-";
	}

}