package com.eragapati.drools.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;

@Configuration(proxyBeanMethods = false)
public class APRRouter {
    @Bean
    public RouterFunction<ServerResponse> route(APRHandler aprHandler) {
        return RouterFunctions
                .route(GET("/api/rates")
                        .and(queryParam("accountKey", t->true))
                        .and(accept(MediaType.APPLICATION_JSON)), aprHandler::rates);
    }


}