package com.example.dao.impl;

import com.example.dao.IProductDao;
import com.example.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository()
public class ProductDao implements IProductDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Product> getAllProducts() {
        return  jdbcTemplate.query("SELECT * FROM tbl_product",
                (rs, rowNumb) -> new Product(
                        rs.getLong("id"),
                        rs.getString("code"),
                        rs.getString("name"),
                        rs.getDouble("price")));
    }
}
