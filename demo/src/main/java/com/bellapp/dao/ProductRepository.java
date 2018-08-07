package com.bellapp.dao;

import com.bellapp.model.Product;
import com.bellapp.model.ProductProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.List;
import java.util.Map;

/**
 * Created by adil on 29/07/18.
 */
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query(value = "SELECT id, brand , model, image, price FROM Product", nativeQuery = true)
    List<ProductProjection> getAllProducts();

    @Query(value = "SELECT * FROM Product where id=:id", nativeQuery = true)
    Product getProductDescription(@Param("id") int id);
}
