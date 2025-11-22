package com.example.ecommerce.controller;

import com.example.ecommerce.model.Product;
import com.example.ecommerce.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
  private final ProductRepository productRepository;

  public ProductController(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  @GetMapping
  public List<Product> listAll() {
    return productRepository.findAll();
  }

  @GetMapping("/{id}")
  public Product getOne(@PathVariable Long id) {
    return productRepository.findById(id).orElseThrow();
  }
}
