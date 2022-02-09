package org.eclipse.example.calc.internal.operations;

import org.eclipse.example.calc.BinaryOperation;
import org.eclipse.example.calc.UnaryOperation;

public class Cube extends AbstractOperation implements UnaryOperation {

	@Override
	public String getName() {
		return "^3";
	}

	@Override
	public float perform(float arg1) {
		return arg1 * arg1 * arg1;
	}

}
