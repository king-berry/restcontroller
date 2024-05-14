package com.example.demo.controllers;

import com.example.demo.models.Products;
import jakarta.validation.Valid;
import com.example.demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.exception.NotFoundException;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsController {

    @Autowired
    private ProductService productService;

    @GetMapping("/getAll")
    public List<Products> getAllProduct(){
        return productService.getAllProducts();
    }

    @GetMapping("/getProduct/{id}")
    public ResponseEntity<Products> getProduct(@PathVariable int id) throws NotFoundException {
        return ResponseEntity.ok(productService.getProductById(id));
    }

    @GetMapping("/getProductByName")
    public Products getProductByName(@RequestParam(value = "name") String name) throws NotFoundException {
        return productService.getProductByName(name);
    }

    @PostMapping("/addProduct")
    public Products addProduct(@RequestBody Products product){
        return productService.saveProduct(product);
    }

    @PutMapping("/updateProduct/{id}")
    public Products updateProduct(@PathVariable int id, @RequestBody Products product){
        return productService.updateProduct(id, product);
    }

    @DeleteMapping("/deleteProduct/{id}")
    public String deleteProducts(@PathVariable int id){
        return productService.deleteProduct(id);
    }

    @PostMapping("/login")
    public String login(@RequestParam(value = "id") int id,@RequestParam(value = "name") String name){
        return productService.login(id, name);
    }
}