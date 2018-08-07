package com.bellapp.model;


import javax.persistence.*;

/**
 * Created by adil on 29/07/18.
 */

@Entity
public class Product {

    @Id
    @GeneratedValue
    private Long id;
    private String brand;
    private String model;
    private float price;

    @Column(length = 1300)
    private String description;
    private String image;
    private int quantity;


    public Product() {}


    public Product(String brandName, String model, float price, String description, String image, int remainingQuantity) {
        this.brand = brandName;
        this.model = model;
        this.price = price;
        this.description = description;
        this.image = image;
        this.quantity = remainingQuantity;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
