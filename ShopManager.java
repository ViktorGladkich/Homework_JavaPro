package org.example._2023_08_30.Homework;

import java.util.ArrayList;
import java.util.List;

public class ShopManager {
    private Product[] products;
    private int productsCount;

    ShopManager(int power) {
        products = new Product[power];
        productsCount = 0;
    }

    public void addProducts(Product product) {
        if (productsCount < products.length) {
            products[productsCount] = product;
            productsCount++;
        }
    }
    public List<Product> getProductsByCategory(ProductCategory category) {
        List<Product> result = new ArrayList<>();
        for (int i = 0; i < productsCount; i++) {
            Product product = products[i];
            if (product.getCategory() == category) {
                result.add(product);
            }
        }
        return result;
    }
    public List<Product> getProductsByPriceRange(double minPrice, double maxPrice, Currency currency) {
        List<Product> result = new ArrayList<>();
        for (int i = 0; i < productsCount; i++) {
            Product product = products[i];
            if (product.getCurrency() == currency && product.getPrice() >= minPrice && product.getPrice() <= maxPrice) {
                result.add(product);
            }
        }
        return result;
    }
}
