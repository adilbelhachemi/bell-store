package com.bellapp.service;


import com.bellapp.model.Product;
import com.bellapp.model.ProductProjection;
import java.util.List;


/**
 * Created by adil on 29/07/18.
 */
public interface ProductService {

    /**
     * Get all products
     * @return
     */
    List<ProductProjection> getAllProducts();

    /**
     * Get product description by id
     * @param id
     * @return
     */
    public Product getProductDescription(int id);

}
