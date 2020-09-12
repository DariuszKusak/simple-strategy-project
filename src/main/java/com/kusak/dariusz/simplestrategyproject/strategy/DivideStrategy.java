package com.kusak.dariusz.simplestrategyproject.strategy;

import com.kusak.dariusz.simplestrategyproject.operation.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DivideStrategy implements CalculationStrategy {

    private final CalculationValidator calculationValidator;

    @Override
    public boolean applicable(Operation operation) {
        return operation.equals(Operation.DIV);
    }

    @Override
    public int calculate(int arg1, int arg2) {
        calculationValidator.validateDivideByZero(arg2);
        return arg1 / arg2;
    }
}
