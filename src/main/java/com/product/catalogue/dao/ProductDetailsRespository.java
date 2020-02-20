package com.product.catalogue.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.catalogue.entity.ProductDetails;

public interface ProductDetailsRespository extends JpaRepository<ProductDetails, Integer>{

    List<ProductDetails> findAllByCategoryId(int id);

}
