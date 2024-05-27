package com.eragapati.drools.model;

import com.eragapati.drools.entity.InterestRate;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class AccountRatesResponse {
    private List<InterestRate> rates;
}
