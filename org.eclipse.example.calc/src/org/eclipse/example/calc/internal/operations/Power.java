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
 * Binary Power operation Unsinn
 */
public class Power extends AbstractOperation implements BinaryOperation {

	@Override
	public String getName() {
		return "^";
	}
	
	@Override
	public float perform(float arg1, float arg2) {
		return (float) Math.pow(arg1, arg2);
	}
}
