package com.akhil.repository;

import com.akhil.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Product, Integer> {

    @Query(value = "SELECT * FROM INVENTORY1.PRODUCT",nativeQuery = true)
    List<Product> findAllProducts();







}



