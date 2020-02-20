package com.product.catalogue.service;

import java.util.List;

import com.product.catalogue.entity.ProductDetails;

public interface CatalogueService {

    List<ProductDetails> getProductDetails(String categoryName);

}
