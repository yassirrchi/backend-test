package com.peacock.backend.services;

import com.peacock.backend.entities.Product;
import com.peacock.backend.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@RequiredArgsConstructor
@Service
@Transactional

public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product createProduct(Product product) {
        Product newProduct=new Product();
        newProduct.setName(product.getName());
        newProduct.setDescription(product.getDescription());
        newProduct.setPrice(product.getPrice());
        newProduct.setQuantityInStock(product.getQuantityInStock());
        return productRepository.save(newProduct);
    }

    @Override
    public Product getProduct(Long id) {
        return null;
    }

    @Override
    public Product editProduct(Product updatedProduct) {

        Product oldProduct=productRepository.getById(updatedProduct.getId());
        oldProduct.setName(updatedProduct.getName());
        oldProduct.setDescription(updatedProduct.getDescription());
        oldProduct.setQuantityInStock(updatedProduct.getQuantityInStock());
        oldProduct.setPrice(updatedProduct.getPrice());

        return productRepository.save(oldProduct);
    }
}
