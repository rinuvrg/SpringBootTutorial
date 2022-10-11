package com.textontech.SpringLearn.controller;

import com.textontech.SpringLearn.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController
{
    @Autowired
    private ProductService productService;

    /**
     * REST controller for a welcome message
     * @return
     */
    @GetMapping("/welcome")
    public String getWelcomeMessage()
    {
        return "Welcome to Springboot tutorial";
    }

    @GetMapping("/products")
    public List<String> getProduList()
    {
        return productService.getProducts();
    }
}
