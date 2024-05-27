package com.eragapati.drools.repository;

import com.eragapati.drools.entity.InterestRate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InterestRateRepository {

    public List<InterestRate> findByAccountKey(long accountKey){
        return new ArrayList<>();
    }
}
