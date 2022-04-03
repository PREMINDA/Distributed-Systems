package com.example.fraud;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public record FraudCheckService(FraudRepository fraudRepository) {
    public boolean isFraudulentCustomer(Integer customerId){
        fraudRepository.save(
                Fraud.builder()
                        .customerId(customerId)
                        .isFraudster(false)
                        .createdAt(LocalDateTime.now())
                        .build()
        );
        return false;
    }
}
