package org.example._2023_08_30.Homework;

public class Product {
    private int id;
    private String name;
    private ProductCategory category;
    private double price;
    private Currency currency;


    public Product(int id, String name, ProductCategory category, double price, Currency currency) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.currency = currency;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public Currency getCurrency() {
        return currency;
    }
}
