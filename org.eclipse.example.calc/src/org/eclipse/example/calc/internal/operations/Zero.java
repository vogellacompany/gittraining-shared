package org.eclipse.example.calc.internal.operations;

import org.eclipse.example.calc.BinaryOperation;

/**
 * zero function
 */
public class Zero extends AbstractOperation implements BinaryOperation {

	@Override
	public float perform(float arg1, float arg2) {
		return 0;
	}

	@Override
	public String getName() {
		return "ZERO";
	}

}

