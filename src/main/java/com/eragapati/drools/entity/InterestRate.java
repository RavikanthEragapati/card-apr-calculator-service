package com.eragapati.drools.entity;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class InterestRate {
    private String rateType;
    private float apr;
    private float primeRate;
    private LocalDate effectiveDate;
    private LocalDate expirationDate;
}
