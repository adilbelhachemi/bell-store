package com.bellapp.service;

import com.bellapp.dao.ProductRepository;
import com.bellapp.model.Product;
import com.bellapp.model.ProductProjection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;


/**
 * Created by adil on 29/07/18.
 */
@Service
@Transactional
public class ProductServiceImpl implements ProductService{


    @Autowired
    private ProductRepository productRepository;


    @Override
    public List<ProductProjection> getAllProducts() {
        return productRepository.getAllProducts();
    }

    @Override
    public Product getProductDescription(int id) {
        return productRepository.getProductDescription(id);
    }

}
