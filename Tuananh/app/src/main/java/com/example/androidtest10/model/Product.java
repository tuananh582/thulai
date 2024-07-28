package com.example.androidtest10.model;

public class Product {
    private String name;
    private String price;
    private int imageResource; // Đây có thể là resource ID hoặc URL của hình ảnh

    public Product(String name, String price, int imageResource) {
        this.name = name;
        this.price = price;
        this.imageResource = imageResource;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public int getImageResource() {
        return imageResource;
    }
}