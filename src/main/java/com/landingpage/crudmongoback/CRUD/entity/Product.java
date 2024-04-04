package com.landingpage.crudmongoback.CRUD.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
public class Product {

    public enum Category {
        mobile,
        computer,
        tablet,
        processor
    }
    @Id
    private String _id;
    private String title;
    private double price;
    private String description;
    private Category category;
    private String image;
    private int annualSales;

    public Product() {

    }

    public Product(String _id, int id, String title, double price, String description, Category category, String image, int annualSales) {
        this._id = _id;
        this.title = title;
        this.price = price;
        this.description = description;
        this.category = category;
        this.image = image;
        this.annualSales = annualSales;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getAnnualSales() {
        return annualSales;
    }

    public void setAnnualSales(int annualSales) {
        this.annualSales = annualSales;
    }
}
