package org.eclipse.example.calc.internal.operations;


import org.eclipse.example.calc.BinaryOperation;

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