package com.akhil.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "PRODUCT")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRODUCT_ID")
    private int productId;
    @Column(name = "PRODUCT_NAME")
    private  String productName;
    @Column(name = "STANDARD_COST")
    private int standardCost;
    @Column(name = "COLOR")
    private String color;
    @Column(name = "LIST_PRICE")
    private int listPrice;
    @Column(name = "PRODUCT_SIZE")
    private int productSize;
    @Column(name = "WEIGHT")
    private int weight;
    @Column(name = "PRODUCT_CATEGORY")
    private String productCategory;

}
