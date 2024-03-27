package com.landingpage.crudmongoback.CRUD.repository;

import com.landingpage.crudmongoback.CRUD.entity.Product;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
    List<Product> findExamplesByCategory(String category, int limit);

    List<Product> findAllByCategory(String category);

    //List<Product> findByNameStartsWith(String name);

}
