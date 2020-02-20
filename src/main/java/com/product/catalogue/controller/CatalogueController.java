package com.product.catalogue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.product.catalogue.entity.ProductDetails;
import com.product.catalogue.service.CatalogueService;

/**
 * @author Dhruv Parmar
 *
 */

@RestController
public class CatalogueController {

    @Autowired
    CatalogueService catalogueService;

    @GetMapping("/{category_name}")
    public ResponseEntity<Object> getProducts(@PathVariable(value = "category_name") String categoryName) {

        List<ProductDetails> productDetails = catalogueService.getProductDetails(categoryName);

        if (CollectionUtils.isEmpty(productDetails)) {
            return new ResponseEntity<>("No Products Found", HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(productDetails, HttpStatus.OK);

    }

}
