/**
 * 
 */
package org.eclipse.example.calc.internal.operations;

import org.eclipse.example.calc.BinaryOperation;

/**
 * @author v164220
 *
 */
public class Multiply extends AbstractOperation implements BinaryOperation {

	/* (non-Javadoc)
	 * @see org.eclipse.example.calc.Operation#getName()
	 */
	@Override
	public String getName() {
		return "*";
	}

	/* (non-Javadoc)
	 * @see org.eclipse.example.calc.BinaryOperation#perform(float, float)
	 */
	@Override
	public float perform(float arg1, float arg2) {
		return arg1 * arg2;
	}

}
