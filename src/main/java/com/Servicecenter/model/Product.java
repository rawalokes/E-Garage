package com.Servicecenter.model;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private double price;
    private String name;
    private String about;
    private String imageUrl;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product(int id,double price, String name, String about, String imageUrl, User user) {
        this.price = price;
        this.name = name;
        this.about = about;
        this.imageUrl = imageUrl;
        this.user = user;
    }

    public Product() {
    }
}

