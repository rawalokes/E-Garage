package com.Servicecenter.service;

import com.Servicecenter.model.Product;

import java.util.List;

public interface ProductService {
    public Product addProduct(Product product);
    public List<Product> getallProduct();
    public Product getByname(String name);
    public  Product getByprice(double price);
    public Product delete(int id);
    public Product editProduct(int id, Product product);
}
