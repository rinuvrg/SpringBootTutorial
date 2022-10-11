package com.textontech.SpringLearn.service.impl;

import com.textontech.SpringLearn.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public List<String> getProducts()
    {
        List<String> products=new ArrayList<>();
        products.add("Retail Banking");
        products.add("Business Banking");
        products.add("Mortgage");
        products.add("Investment");
        return products;
    }
}
