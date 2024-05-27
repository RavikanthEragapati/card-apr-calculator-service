package com.eragapati.drools.service;

import com.eragapati.drools.entity.InterestRate;
import com.eragapati.drools.model.AccountRatesResponse;
import com.eragapati.drools.repository.InterestRateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.web.reactive.function.server.ServerRequest;

import java.util.List;

@Service
@RequiredArgsConstructor
public class APRService {

    private final InterestRateRepository interestRateRepository;

    public AccountRatesResponse getAccountRates(ServerRequest serverRequest) {
        long accountKey = Long.parseLong(serverRequest.queryParam("accountKey").get());
        Assert.isTrue((accountKey > 0), "Account Key should be greater than ZERO");

        List<InterestRate> ratesFromDB = interestRateRepository.findByAccountKey(accountKey);



        return AccountRatesResponse.builder().rates(ratesFromDB).build();
    }
}
