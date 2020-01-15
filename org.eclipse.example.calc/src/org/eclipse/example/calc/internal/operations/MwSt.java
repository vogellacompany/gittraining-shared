package org.eclipse.example.calc.internal.operations;

import javax.lang.model.type.UnionType;

import org.eclipse.example.calc.UnaryOperation;

public class MwSt extends AbstractOperation implements UnaryOperation {

	@Override
	public String getName() {
		
		return "plus MwSt";
	}

	@Override
	public float perform(float arg1) {
		// TODO Auto-generated method stub
		return (float) (arg1 * 1.19);
	}

}
