package com.akhil.Controller;

import com.akhil.model.Product;
import com.akhil.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HomeController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public String myHome(){
        return "myHome";
    }

    @GetMapping("/products")
    public List<Product> getAllproducts(){
        return userRepository.findAllProducts();
    }

}
