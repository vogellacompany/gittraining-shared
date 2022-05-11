package org.eclipse.example.calc.internal.operations;

import org.eclipse.example.calc.UnaryOperation;

/**
 * Logarithmus zu e
 */
public class Log extends AbstractOperation implements UnaryOperation {

	@Override
	public String getName() {
		return "ln(x)";
	}

	@Override
	public float perform(float arg1) {
		return (float) Math.log(arg1);
	}

}
