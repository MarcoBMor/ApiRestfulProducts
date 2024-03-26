package com.landingpage.crudmongoback.CRUD.controller;

import com.landingpage.crudmongoback.CRUD.entity.Product;
import com.landingpage.crudmongoback.CRUD.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public int save(@RequestBody Product product){
        return productService.save(product);
    }

    @GetMapping
    public List<Product> getProductStartWith(@RequestParam("name") String name){
        return productService.getProductStartWith(name);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        productService.delete(id);
    }
}
