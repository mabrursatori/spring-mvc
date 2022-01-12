package com.example.service;

import com.example.dao.impl.ProductDao;
import com.example.entity.Product;
import com.example.repo.ProductRepo;
import com.example.utils.RandomNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;

    @Autowired
    private ProductDao productDao;

    public Iterable<Product> findAll(){
        return repo.findAll();
    }

    public  void addProduct(Product product){
        repo.save(product);
    }

    public void deleteById(long id){
        repo.deleteById(id);
    }

    public Optional<Product> findById(long id){
        return repo.findById(id);
    }

    public void updateProduct(Product product){
        repo.save(product);
    }

    public List<Product> findByName(String keyword){
        return repo.findByNameContains(keyword);
    }

        public List<Product> getAllProductsJdbc(){
                return productDao.getAllProducts();
        }
}
