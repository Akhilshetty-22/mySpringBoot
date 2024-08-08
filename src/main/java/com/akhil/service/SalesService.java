package com.akhil.service;

import com.akhil.model.Sales;
import com.akhil.repository.SalesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SalesService {

    @Autowired
    private SalesRepo salesRepo;

    public List<Sales> getAllSales(){
        return salesRepo.findAll();
    }

    public List<Sales> getSalesById(int productID){
        return salesRepo.findSalesByProductID(productID);
    }


}
