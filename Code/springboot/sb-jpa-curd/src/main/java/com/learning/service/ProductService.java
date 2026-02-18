package com.learning.service;

import com.learning.entity.Product;
import com.learning.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public Product saveProduct(Product product) {
        return productRepository.save(product); // INSERT or UPDATE
    }

    public List<Product> saveAllProduct(List<Product> productList) {
        return productRepository.saveAll(productList);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll(); // SELECT
    }

    public Product getProductById(int id) {
        return productRepository.findById(id).get();
    }

    public boolean deleteProductById(int id) {
        try {
            productRepository.deleteById(id); // DELETE
            return Boolean.TRUE;
        } catch (Exception e) {
            return Boolean.FALSE;
        }
    }

}
