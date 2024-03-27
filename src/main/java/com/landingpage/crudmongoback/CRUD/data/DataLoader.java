package com.landingpage.crudmongoback.CRUD.data;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.landingpage.crudmongoback.CRUD.entity.Product;
import com.landingpage.crudmongoback.CRUD.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Component
public class DataLoader implements ApplicationListener<ContextRefreshedEvent> {

    private final Logger logger = LoggerFactory.getLogger(DataLoader.class);

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        loadProductsFromJson();
    }

    private void loadProductsFromJson() {
        try {
            //Delete products
            productRepository.deleteAll();
            File file = ResourceUtils.getFile("src/main/java/com/landingpage/crudmongoback/CRUD/data/data.json");
            ObjectMapper objectMapper = new ObjectMapper();
            List<Product> products = objectMapper.readValue(file, new TypeReference<List<Product>>(){});
            productRepository.saveAll(products);
        } catch (Exception e) {
            logger.error("Error when loading database", e);
        }
    }
}
