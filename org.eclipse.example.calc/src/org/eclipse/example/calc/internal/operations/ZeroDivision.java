package org.eclipse.example.calc.internal.operations;

import org.eclipse.example.calc.BinaryOperation;

public class ZeroDivision extends AbstractOperation implements BinaryOperation {

	@Override
	public float perform(float arg1, float arg2) {
		if(arg2==0)
		{
			System.out.println("Division durch 0 ist tierisch verboten");
			return 0;
		}
		return arg1 / arg2;
	}

	@Override
	public String getName() {
		return "/";
	}

}
