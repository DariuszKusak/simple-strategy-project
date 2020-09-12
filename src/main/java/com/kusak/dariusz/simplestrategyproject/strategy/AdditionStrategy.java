package com.kusak.dariusz.simplestrategyproject.strategy;

import com.kusak.dariusz.simplestrategyproject.operation.Operation;
import org.springframework.stereotype.Component;

@Component
public class AdditionStrategy implements CalculationStrategy {
    @Override
    public boolean applicable(Operation operation) {
        return operation.equals(Operation.ADD);
    }

    @Override
    public int calculate(int arg1, int arg2) {
        return arg1 + arg2;
    }
}
