package com.kusak.dariusz.simplestrategyproject.service;

import com.kusak.dariusz.simplestrategyproject.operation.Operation;
import com.kusak.dariusz.simplestrategyproject.strategy.CalculationStrategyFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CalculatorService {

    private final CalculationStrategyFactory calculationStrategyFactory;

    public int calculate(Operation operation, int arg1, int arg2) {
        return calculationStrategyFactory.getCalculationStrategy(operation).calculate(arg1, arg2);
    }
}
