package com.example.demo.services.Impl;
import com.example.demo.exception.NotFoundException;
import com.example.demo.models.Products;
import com.example.demo.services.ProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImp implements ProductService {
    public static List<Products> products = new ArrayList<>();

    static {
        products.add(new Products(1, "Iphone12", "Iphone 12", 1000));
        products.add(new Products(2, "Iphone11", "Iphone 11", 900));
        products.add(new Products(3, "Iphone10", "Iphone 10", 800));
        products.add(new Products(4, "Iphone9", "Iphone 9", 700));
        products.add(new Products(5, "Iphone8", "Iphone 8", 600));
    }

    @Override
    public List<Products> getAllProducts() {
        return products;
    }

    @Override
    public Products saveProduct(Products product) {
        products.add(product);
        return product;
    }

    @Override
    public Products updateProduct(int id, Products product) {
        products.stream().filter(p -> p.getId() == id)
                .forEach(p -> {
                    p.setName(product.getName());
                    p.setDescription(product.getDescription());
                    p.setPrice(product.getPrice());
                });
        return product;
    }

    @Override
    public Products getProductById(int id) throws NotFoundException {
        return products.stream().filter(p -> p.getId() == id)
                .findFirst()
                .orElseThrow(() -> new NotFoundException("Product not found with id: " + id));
    }

    @Override
    public String deleteProduct(int id) {
        Products product = products.stream().filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
        if (product != null) {
            products.remove(product);
            return "Product deleted successfully";
        } else {
            return "Product not found";
        }
    }

    @Override
    public Products getProductByName(String name) throws NotFoundException {
        return products.stream().filter(product -> product.getName().equals(name))
                .findFirst()
                .orElseThrow(() -> new NotFoundException("Product not found with name: " + name));
    }

    @Override
    public String login(int id, String name) {
        return products.stream().filter(product -> product.getId() == id && product.getName().equals(name))
                .findFirst()
                .map(products -> "Login Success")
                .orElse("Login Failed");
    }
}
