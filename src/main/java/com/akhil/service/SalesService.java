package com.akhil.service;

import com.akhil.model.Sales;
import com.akhil.repository.SalesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SalesService {

    @Autowired
    private SalesRepo salesRepository;

    public List<Sales> getAllSales(){
        return salesRepository.findAll();
    }
}
