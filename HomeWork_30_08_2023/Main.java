package org.example._2023_08_30.Homework;
/*Цель: Создать программу для управления списком товаров в интернет-магазине
        1. Enums:
        1.1. ProductCategory - Перечисление для представления категорий товаров в магазине:
        ?????? = придумайте сами какие
        1.2. Size - Перечисление для представления размеров одежды:
        ??????
        1.3. Currency - Перечисление для представления валют для цен товаров:
        ??????
        2. Классы:
        2.1. Product - Класс для представления товара:
        Поля:
        id (уникальный идентификатор товара)
        name (имя товара)
        category (категория товара из ProductCategory)
        price (цена товара)
        currency (валюта цены из Currency)
        Конструктор для инициализации полей.
        2.2. Clothing - Подкласс класса Product для представления одежды:
        Дополнительное поле size (размер одежды из Size).
        Конструктор для инициализации полей.
        2.3. ShopManager - Класс для управления списком товаров:
        Поле products (массив товаров).
        Метод addProduct(Product product) для добавления товара в список.
        Метод getProductsByCategory(ProductCategory category) для получения списка товаров по заданной категории.
        Метод getProductsByPriceRange(double minPrice, double maxPrice, Currency currency) для получения списка товаров в
        заданном диапазоне цен и в указанной валюте.
        методы надо написать....естественно))*/

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1, "Iphone 14 Pro", ProductCategory.IPHONE, 1350.0, Currency.EUR);
        Product product2 = new Product(2, "MacBook 13 Pro", ProductCategory.LAPTOPS, 2450.0, Currency.EUR);
        Clothing clothing1 = new Clothing(3, "Prada Sommer", ProductCategory.T_SHIRT, 850.0, Currency.EUR, Size.M);


        ShopManager shopManager = new ShopManager(100);

        shopManager.addProducts(product1);
        shopManager.addProducts(product2);
        shopManager.addProducts(clothing1);


        List<Product> clothes = shopManager.getProductsByCategory(ProductCategory.T_SHIRT);
        System.out.println("Товары в категории T_SHIRT:");
        for (int i = 0; i < clothes.size(); i++) {
            Product product = clothes.get(i);
            System.out.println(product.getName());
        }

        List<Product> sumProducts = shopManager.getProductsByPriceRange(200.0, 1000.0, Currency.EUR);
        System.out.println("\nТовары в диапазоне 200.0 - 1000.0 EUR:");
        for (int i = 0; i < sumProducts.size(); i++) {
            Product product = sumProducts.get(i);
            System.out.println(product.getName() + " - Цена: " + product.getPrice() + " " + product.getCurrency());
        }
    }
    }

