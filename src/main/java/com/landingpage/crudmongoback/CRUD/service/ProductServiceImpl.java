package com.landingpage.crudmongoback.CRUD.service;

import com.landingpage.crudmongoback.CRUD.entity.Product;
import com.landingpage.crudmongoback.CRUD.repository.ProductRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public ObjectId save(Product product) {
        return productRepository.save(product).get_id();
    }

    // @Override
    // public List<Product> getProductStartWith(String name) {
    //     return productRepository.findByNameStartsWith(name);
    // }

    @Override
    public void delete(ObjectId _id) {
        productRepository.deleteById(_id);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

}
