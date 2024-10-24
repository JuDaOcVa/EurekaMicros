package org.software.judaocva.apigateway.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Log4j2
public class RestController {

    private WebClient.Builder webClientBuilder;

    @Value("${microservicioprueba.endpoint.holamundo}")
    String urlPrueba;

    @Value("${microservicioventa.endpoint.registrarventa}")
    String urlVenta;

    @GetMapping("/prueba/hola-mundo")
    public Mono<String> holaMundo() {
        return webClientBuilder.build()
                .get()
                .uri(urlPrueba)
                .retrieve()
                .bodyToMono(String.class)
                .doOnError(e -> log.error("Error connecting to microservice: {}", urlPrueba, e));
    }

    @GetMapping("/venta/registrar-venta")
    public Mono<String> venta() {
        return webClientBuilder.build()
                .get()
                .uri(urlVenta)
                .retrieve()
                .bodyToMono(String.class)
                .doOnError(e -> log.error("Error connecting to microservice: {}", urlVenta, e));
    }
}