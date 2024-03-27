package com.landingpage.crudmongoback.CRUD.service;

import com.landingpage.crudmongoback.CRUD.entity.Product;
import org.bson.types.ObjectId;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    String save(Product product);

    //List<Product> getProductStartWith(String name);

    void delete(String _id);

    List<Product> getAllProducts();

    Optional<Product> getProduct(String _id);

    //List<Product> getExamplesByCategory(String category, int limit);

    List<Product> getProductsByCategory(String category);
}
