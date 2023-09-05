package org.example._2023_08_30.Homework;

public class Clothing extends Product {
    private Size size;

    public Clothing(int id, String name, ProductCategory category, double price, Currency currency, Size size) {
        super(id, name, category, price, currency);
        this.size = size;
    }

    public Size getSize() {
        return size;
    }
}
