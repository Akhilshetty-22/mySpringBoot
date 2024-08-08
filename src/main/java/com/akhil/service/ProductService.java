package com.akhil.service;


import com.akhil.model.Product;
import com.akhil.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepo;

    public List<Product> getAllProducts(){
        return productRepo.findAllProducts();
    }

    public Optional<Product> getProductById(int productId){
        return productRepo.findById(productId);
    }

}
