package com.kusak.dariusz.simplestrategyproject.strategy;

import com.kusak.dariusz.simplestrategyproject.operation.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class CalculationStrategyFactory {

    private final List<CalculationStrategy> strategyList;

    public CalculationStrategy getCalculationStrategy(Operation operation) {
        return strategyList.stream()
                .filter(strategy -> strategy.applicable(operation))
                .findAny()
                .orElseThrow(() -> new RuntimeException("Strategy for given number does not exist: " + operation));
    }
}
