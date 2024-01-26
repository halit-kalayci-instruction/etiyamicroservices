package com.etiya.inventoryservice.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/products")
public class ProductsController {

    @GetMapping()
    public boolean checkStock(@RequestParam int productId) {
        return true;
    }

    @PostMapping()
    public boolean deneme() {
        return true;
    }
}
