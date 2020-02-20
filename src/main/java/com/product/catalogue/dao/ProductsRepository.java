package com.product.catalogue.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.catalogue.entity.Products;

public interface ProductsRepository extends JpaRepository<Products, Integer>{

    Products findByCategoryType(String categoryName);
    
    

}
