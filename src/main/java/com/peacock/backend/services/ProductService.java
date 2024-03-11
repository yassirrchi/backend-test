package com.peacock.backend.services;

import com.peacock.backend.entities.Product;
import com.peacock.backend.repositories.ProductRepository;

import java.util.List;

public interface ProductService {
    public List<Product> getAllProducts();
    public Product createProduct(Product product);
    public Product getProduct(Long id);
    public Product editProduct(Product product);
}
