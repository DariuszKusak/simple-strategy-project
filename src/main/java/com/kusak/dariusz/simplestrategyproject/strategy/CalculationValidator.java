package com.kusak.dariusz.simplestrategyproject.strategy;

import org.springframework.stereotype.Service;

@Service
public class CalculationValidator {

    void validateDivideByZero(int arg2) {
        if (arg2 == 0) {
            throw new IllegalArgumentException("You cannot divide by zero");
        }
    }
}
