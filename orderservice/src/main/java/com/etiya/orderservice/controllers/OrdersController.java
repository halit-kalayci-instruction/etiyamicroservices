package com.etiya.orderservice.controllers;

import com.etiya.orderservice.clients.InventoryClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/api/v1/orders")
@RequiredArgsConstructor
public class OrdersController {
   // private final WebClient.Builder webClientBuilder;
    private final InventoryClient inventoryClient;
    @PostMapping
    public String submitOrder() {
        // ..
      /* Boolean result = webClientBuilder
                .build()
                .get()
                .uri("http://inventoryService/api/v1/products",
                        (uriBuilder -> uriBuilder.queryParam("productId", 5).build()))
                .retrieve()
                .bodyToMono(Boolean.class)
                .block(); */
        Boolean result = inventoryClient.getStockStatus(5);
        if(result)
            return "Sipariş başarılı";
        return "Sipariş başarısız";
    }
}
