package com.example.demo.services;
import com.example.demo.exception.NotFoundException;
import com.example.demo.models.Products;
import java.util.List;

public interface ProductService {
    List<Products> getAllProducts();
    Products saveProduct(Products product);
    Products updateProduct(int id, Products product);
    Products getProductById(int id) throws NotFoundException;
    String deleteProduct(int id);
    Products getProductByName(String name) throws NotFoundException;
    String login(int id, String name);
}
