package com.akhil.service;


import com.akhil.model.Product;
import com.akhil.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private UserRepository userRepository;

    public List<Product> getAllProducts(){
        return userRepository.findAllProducts();
    }

    public Optional<Product> getProductById(int productId){
        return userRepository.findById(productId);
    }

}
