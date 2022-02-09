package org.eclipse.example.calc.internal.operations;

import org.eclipse.example.calc.BinaryOperation;

/**
 * Class for StandBy-Mode
 */
public class StandBy extends AbstractOperation implements BinaryOperation
{

    @Override
    public String getName()
    {
        return "standing by";
    }

    @Override
    public float perform(float arg1, float arg2)
    {
        // to be implemented
        return 0;
    }

}
