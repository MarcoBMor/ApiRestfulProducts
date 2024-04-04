package com.landingpage.crudmongoback.CRUD.service;

import com.landingpage.crudmongoback.CRUD.entity.Product;
import com.landingpage.crudmongoback.CRUD.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public String save(Product product) {
        return productRepository.save(product).get_id();
    }

    @Override
    public void delete(String _id) {
        productRepository.deleteById(_id);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> getProduct(String _id) {
        return productRepository.findById(_id);
    }

    @Override
    public List<Product> getExamplesByCategory(String category, int limit) {
        return productRepository.findAllByCategory(category, PageRequest.of(0, limit));
    }

    @Override
    public List<Product> getProductsByCategory(String category) {
        return productRepository.findAllByCategory(category);
    }

}
