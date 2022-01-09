package com.example.repo;

import com.example.entity.Product;
import org.springframework.data.repository.CrudRepository;


public interface ProductRepo extends CrudRepository<Product, Long> {
}
