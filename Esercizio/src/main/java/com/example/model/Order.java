package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private Customer customer;
    private List<Product> products;

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public int getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Order{orderId=" + orderId + ", customer=" + customer + ", products=" + products + "}";
    }
}
