package com.learning.controller;

import com.learning.entity.Product;
import com.learning.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/save-product")
    public Product saveData(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @PostMapping("/save-all-product")
    public List<Product> saveData(@RequestBody List<Product> products) {
        return productService.saveAllProduct(products);
    }

    @GetMapping("/get-all-products")
    public List<Product> getAllData() {
        return productService.getAllProducts();
    }

    @GetMapping("/get-product-by-id")
    public Product getData(@RequestParam("id") int id) {
        return productService.getProductById(id);
    }

    @DeleteMapping("/delete-product-by-id/{id}")
    public String deleteData(@PathVariable(name = "id") int id) {
        boolean flag = productService.deleteProductById(id);
        return flag ? "DELETED PRODUCT SUCCESSFULLY" : "FAIL TO DELETE PRODUCT";
    }

}
