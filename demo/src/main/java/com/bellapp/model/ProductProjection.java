package com.bellapp.model;

/**
 * Created by adil on 29/07/18.
 * this class is used as a projection of Product class
 * to wrap the results of specific columns of the Product entity
 */
public interface ProductProjection {

    Long getId();
    String getBrand();
    String getModel();
    String getImage();
    float getPrice();

}
