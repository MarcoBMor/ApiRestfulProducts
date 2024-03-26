package com.landingpage.crudmongoback.CRUD.service;

import com.landingpage.crudmongoback.CRUD.entity.Product;
import org.bson.types.ObjectId;

import java.util.List;

public interface ProductService {
    ObjectId save(Product product);

    //List<Product> getProductStartWith(String name);

    void delete(ObjectId _id);

    List<Product> getAllProducts();
}
