package com.akhil.Controller;

import com.akhil.model.Product;
import com.akhil.model.Sales;
import com.akhil.repository.ProductRepo;
import com.akhil.service.ProductService;
import com.akhil.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
//@RequestMapping("/api")
public class HomeController {

    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private ProductService productService;

    @Autowired
    private SalesService salesService;

    @GetMapping
    public String myHome(){
        return "myHome";
    }

    @GetMapping("/products")
    public List<Product> getAllproducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/product/{id}")
    public Optional<Product> getProductById(@PathVariable("id") int productId){
        return productService.getProductById(productId);
    }

    @GetMapping("/sales")
    public List<Sales> getAllSales(){
        return salesService.getAllSales();
    }

    @GetMapping("/sales/{id}")
    public List<Sales> getSalesById(@PathVariable("id") int productID){
        return salesService.getSalesById(productID);
    }

}
