package com.hiresuyash.SpringEcom.controller;


import com.hiresuyash.SpringEcom.model.Product;
import com.hiresuyash.SpringEcom.service.ProductService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Data
@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts() {
        return new ResponseEntity<>(
                productService.getAllProducts(),
                HttpStatus.OK
        );
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") int id ) {
        Optional<Product> product = productService.getProductById(id);

        return product.map(value -> new ResponseEntity<>(
                value,
                HttpStatus.OK
        )).orElseGet(() -> new ResponseEntity<>(
                new Product(),
                HttpStatus.NOT_FOUND
        ));

    }

    @PostMapping("/products")
    public ResponseEntity<?> postProduct(@RequestPart Product product, @RequestPart MultipartFile imageFile) {
        Product savedProduct = null;
        try {
            savedProduct = productService.addProduct(product, imageFile);
            return new ResponseEntity<>(
                    savedProduct,
                    HttpStatus.OK
            );
        } catch (IOException e) {
            return new ResponseEntity<>(
                    e.getMessage(),
                    HttpStatus.INTERNAL_SERVER_ERROR
            );
        }

    }

}
