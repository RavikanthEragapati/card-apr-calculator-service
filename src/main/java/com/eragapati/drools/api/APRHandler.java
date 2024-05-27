package com.eragapati.drools.api;

import com.eragapati.drools.model.AccountRatesResponse;
import com.eragapati.drools.service.APRService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class APRHandler {

    private final APRService aprService;

    public Mono<ServerResponse> rates(ServerRequest serverRequest) {
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(Mono.just(aprService.getAccountRates(serverRequest)), AccountRatesResponse.class);
    }
}

