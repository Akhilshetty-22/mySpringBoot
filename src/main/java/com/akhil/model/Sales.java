package com.akhil.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "SALES", schema = "INVENTORY1")
@Data
public class Sales {
    @Column(name = "SALES_DATE")
    private Date salesDate;
    @Column(name = "ORDER_ID")
    private int orderID;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRODUCT_ID")
    private int productID;
    @Column(name = "CUSTOMER_ID")
    private int CustomerID;
    @Column(name = "SALESPERSON_ID")
    private int salesPersonId;
    @Column(name = "QUANTITY")
    private int quantity;
    @Column(name = "UNIT_PRICE")
    private int unitPrice;
    @Column(name = "SALES_AMOUNT")
    private int salesAmount;
    @Column(name = "TAX_AMOUNT")
    private int tax_amount;
    @Column(name = "TOTAL_AMOUNT")
    private int total_amount;
}
