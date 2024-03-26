package com.landingpage.crudmongoback.CRUD.service;

import com.landingpage.crudmongoback.CRUD.entity.Product;

import java.util.List;

public interface ProductService {
    int save(Product product);

    List<Product> getProductStartWith(String name);

    void delete(int id);
}
