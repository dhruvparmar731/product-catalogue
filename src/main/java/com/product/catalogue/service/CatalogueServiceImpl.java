package com.product.catalogue.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.catalogue.dao.ProductDetailsRespository;
import com.product.catalogue.dao.ProductsRepository;
import com.product.catalogue.entity.ProductDetails;
import com.product.catalogue.entity.Products;

@Service
public class CatalogueServiceImpl implements CatalogueService {

    @Autowired
    ProductsRepository productsRepository;

    @Autowired
    ProductDetailsRespository productDetailsRespository;

    @Override
    public List<ProductDetails> getProductDetails(String categoryName) {

        Products products = productsRepository.findByCategoryType(categoryName);

        if (null != products) {
            return productDetailsRespository.findAllByCategoryId(products.getId());
        }
        return new ArrayList<ProductDetails>();
    }

}
