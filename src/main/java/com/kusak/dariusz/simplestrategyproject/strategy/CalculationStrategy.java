package com.kusak.dariusz.simplestrategyproject.strategy;

import com.kusak.dariusz.simplestrategyproject.operation.Operation;

public interface CalculationStrategy {
    boolean applicable(Operation operation);

    int calculate(int arg1, int arg2);
}
