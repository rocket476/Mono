package com.example.shop.entities;

//import org.springframework.boot.autoconfigure.AutoConfiguration;

import jakarta.persistence.*;

@Entity
@Table(name="Products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;
    private int price;
    
    public long getId() {
    	return id;
    }
    public String getName() {
    	return name;
    }
    public String getDescription() {
    	return description;
    }
    public int getPrice() {
    	return price;
    }
    
    public void setId(long id) {
    	this.id = id;
    }
    public void setName(String name) {
    	this.name = name;
    }
    public void setDescription(String description) {
    	this.description = description;
    }
    public void setPrice(int price) {
    	this.price = price;
    }
}

