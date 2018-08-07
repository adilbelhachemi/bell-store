package com.bellapp.controller;

import com.bellapp.model.Product;
import com.bellapp.model.ProductProjection;
import com.bellapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by adil on 29/07/18.
 */
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;


    @RequestMapping(value = "/allProducts", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ProductProjection> getAllProducts() {
        return  productService.getAllProducts();
    }

    @RequestMapping(value = "/productDescription", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Product getProductDescription(@RequestParam("id") int id) {
        return  productService.getProductDescription(id);
    }
}
