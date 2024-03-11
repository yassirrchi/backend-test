package com.peacock.backend.Controllers;

import com.peacock.backend.entities.Client;
import com.peacock.backend.entities.Product;
import com.peacock.backend.services.ProductService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
@AllArgsConstructor
@NoArgsConstructor
public class ProductController { //http status codes to be fixed

    @Autowired
    private ProductService productService;
    @GetMapping("/all-products")
    public ResponseEntity<List<Product>> getAllProducts(){


        return ResponseEntity.ok(productService.getAllProducts());
    }
    @PostMapping("/product/create")
    public ResponseEntity<Product>  createProduct(@RequestBody Product product){
        return ResponseEntity.ok(productService.createProduct(product));

    }
    @PutMapping("/product/update")
    public ResponseEntity<Product>  updateProduct(@RequestBody Product product){
        return ResponseEntity.ok(productService.editProduct(product));

    }




}
