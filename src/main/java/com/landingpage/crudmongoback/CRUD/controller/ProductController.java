package com.landingpage.crudmongoback.CRUD.controller;

import com.landingpage.crudmongoback.CRUD.entity.Product;
import com.landingpage.crudmongoback.CRUD.service.ProductService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{_id}")
    public Optional<Product> getProduct(@PathVariable String _id) {
        return productService.getProduct(_id);
    }

    @GetMapping("/category/{category}")
    public List<Product> getProductsByCategory(@PathVariable String category,
                                               @RequestParam(required = false, defaultValue = "0") int limit) {
        if (limit <= 0) {
            return productService.getProductsByCategory(category);
        } else {
            return productService.getExamplesByCategory(category, limit);
        }
    }

    @PostMapping
    public String save(@RequestBody Product product){
        return productService.save(product);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable String _id){
        productService.delete(_id);
    }
}
