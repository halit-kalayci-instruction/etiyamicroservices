package com.etiya.orderservice.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="inventoryClient", url = "http://localhost:8080/api/v1/")
public interface InventoryClient
{
    @GetMapping("/products?productId={id}")
    Boolean getStockStatus(@RequestParam("id") Integer id);


}
