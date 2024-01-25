package com.etiya.orderservice.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="inventoryService")
// inventoryService => http://localhost:8080
public interface InventoryClient
{
    @GetMapping("/api/v1/products?productId={id}")
    Boolean getStockStatus(@RequestParam("id") Integer id);

}
