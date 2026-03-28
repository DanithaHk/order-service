package com.cosmic.order.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "orders")
public class Order {
    @Id
    private String id;
    private String productId;
    private String username;
    private String address;
    private String email;
    private String phoneNumber;
    private int quantity;
    private double totalPrice;

    private Order() {
    }
    private Order(String productId, String username, String address, String email, String phoneNumber, int quantity, double totalPrice) {
        this.productId = productId;
        this.username = username;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }
    public String getId() {
        return id;
    }
    public String getProductId() {
        return productId;
    }
    public String getUsername() {
        return username;
    }
    public String getAddress() {
        return address;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getTotalPrice() {
        return totalPrice;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}