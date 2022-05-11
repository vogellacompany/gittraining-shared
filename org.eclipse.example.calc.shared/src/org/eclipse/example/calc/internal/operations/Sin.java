package org.eclipse.example.calc.internal.operations;

import org.eclipse.example.calc.UnaryOperation;

public class Sin extends AbstractOperation implements UnaryOperation {

	@Override
	public String getName() {
		return "sin(x)";
	}

	@Override
	public float perform(float arg1) {
		return (float) Math.sin(arg1);
	}

}
