package com.product.catalogue.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product_details")
public class ProductDetails {
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private int id;
    
    @Column(name = "category_id")
    private int categoryId;
    
    @Column(name = "brand")
    private String brand;
    
    @Column(name = "price")
    private String price;
    
    @Column(name = "color")
    private String color;
    
    @Column(name = "size")
    private String size;
    
    @Column(name = "SKU", unique = true)
    private String sku;
}
