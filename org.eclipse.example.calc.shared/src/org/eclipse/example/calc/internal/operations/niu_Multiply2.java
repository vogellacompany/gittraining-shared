/* new from NIU 2022-05-11 */
package org.eclipse.example.calc.internal.operations;

import org.eclipse.example.calc.BinaryOperation;

public class niu_Multiply2 extends AbstractOperation implements BinaryOperation {

    @Override
    public float perform(float arg1, float arg2) {
        return arg1 * arg2;
    }

    @Override
    public String getName() {
        return "*";
    }
}
