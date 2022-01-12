package com.example.controllers;

import com.example.dto.SearchFormData;
import com.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jdbc")
public class JdbcController {
    @Autowired
    private ProductService productService;
    @GetMapping
    public String testJdbc(Model model){
        String message = "Welcome to SPRING MVC";
        model.addAttribute("message", message);
        model.addAttribute("searchForm", new SearchFormData());
        model.addAttribute("products", productService.getAllProductsJdbc());
        return "index";
    }
}
