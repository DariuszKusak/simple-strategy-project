package com.kusak.dariusz.simplestrategyproject.controller;

import com.kusak.dariusz.simplestrategyproject.operation.Operation;
import com.kusak.dariusz.simplestrategyproject.service.CalculatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/calculate")
@RequiredArgsConstructor
public class CalculatorController {

    private final CalculatorService calculatorService;

    @GetMapping(value = "/{operation}")
    public ResponseEntity<Integer> calculate(@PathVariable Operation operation,
                                             @RequestParam int arg1, @RequestParam int arg2) {
        return ResponseEntity.ok(calculatorService.calculate(operation, arg1, arg2));
    }
}
