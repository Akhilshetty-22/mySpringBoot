package com.akhil.service;


import com.akhil.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class productService {
    @Autowired
    private UserRepository userRepository;


}
