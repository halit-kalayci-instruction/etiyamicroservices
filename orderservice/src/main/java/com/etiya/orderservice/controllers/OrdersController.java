package com.etiya.orderservice.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/api/v1/orders")
@RequiredArgsConstructor
public class OrdersController {
    private final WebClient.Builder webClient;
    @PostMapping
    public void submitOrder() {
        // ..
        //webClient.build().get().uri("").retrieve();
    }
}
