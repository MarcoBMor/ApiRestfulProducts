package com.landingpage.crudmongoback.CRUD.service;

import com.landingpage.crudmongoback.CRUD.entity.Product;
import com.landingpage.crudmongoback.CRUD.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public int save(Product product) {
        return productRepository.save(product).getId();
    }

    @Override
    public List<Product> getProductStartWith(String name) {
        return productRepository.findByNameStartsWith(name);
    }

    @Override
    public void delete(int id) {
        productRepository.deleteById(id);
    }

}
