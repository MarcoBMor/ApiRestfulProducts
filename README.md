# My Api Rest With SpringBoot

Welcome to the repository for **My Api Rest With SpringBoot**! This project contains a RESTful API built using Spring Boot that i made for [MyStoreMadeWithAngular](https://github.com/MarcoBMor/MyStoreWithAngular).

This API provides endpoints to manage products, each containing attributes such as title, price, description, image and category. Below are the available endpoints along with their functionalities:

## Endpoints
 - **GET /products** : Retrieves a list of all products available in the database.
 - **GET /products/{id}** : Retrieves detailed information about a specific product identified by {id}.
 - **GET /category/{category}** : Retrieves a list of products that belong to this {category}.
 - **GET /category/{category}?limit={limit_number}** : Retrieves {limit_number} products that belong to this {category}.
 - **DELETE /products/{id}** : Deletes a product from the database identified by {id}.
 - **POST /products** : Adds product to the database:
   - Request body: JSON object representing the product to be added
    ````json
   {
     "title": "Samsung Galaxy S21 Ultra",
     "price": 1199.99,
     "description": "A flagship Android phone with a stunning display, and powerful performance.",
     "category": "mobile",
     "image": "http://localhost:8080/images/samsung_galaxy_s21_ultra.png",
     "annualSales": 4000000
   }

You cant test these endpoints through the localhost url **http://localhost:8080/**

## Install & Run MyApiRestWithSpringBoot
Open a GitBash and execute:
````bash
#Install
git clone https://github.com/MarcoBMor/MyApiRestWithSpringBoot.git 
cd myapirestwithspringboot
mvn clean install

#Run
mvn spring-boot:run
````
# Contact
Marco Beruet Morelli - marcoberuetmorelli@gmail.com

Project link: [MyApiRestWithSpringboot](https://github.com/MarcoBMor/MyApiRestWithSpringBoot)
