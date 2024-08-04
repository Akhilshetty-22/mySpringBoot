package com.akhil.repository;

import com.akhil.model.Sales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SalesRepo extends JpaRepository<Sales,Integer> {
    @Query(value = "SELECT * FROM INVENTORY1.SALES", nativeQuery = true)
    List<Sales> getAllSales();


}
