package com.example.fraud;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/fraud-check")
public record FraudController(FraudCheckService fraudCheckService) {
    @GetMapping(path = "{customerId}")
    public FraudCheckResponse isFraudster(@PathVariable("customerId") Integer customerId){
       boolean isFraudCustomer = fraudCheckService.isFraudulentCustomer(customerId);
       return new FraudCheckResponse(isFraudCustomer);
    }
}
