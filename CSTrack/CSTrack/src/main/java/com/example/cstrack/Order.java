package com.example.cstrack;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Order {
    private final String orderId;
    private Status orderStatus;
    private double totalAmount;
    private UUID customerId;
    private final Map<String, Integer> items; // Dictionary of item IDs and quantities
    private LocalDate dateSubmitted;

    // Constructor
    public Order(String orderId, double totalAmount, UUID customerId) {
        this.orderId = orderId;
        this.totalAmount = totalAmount;
        this.customerId = customerId;
        this.orderStatus = Status.PENDING;
        this.items = new HashMap<>(); // Initialize the items dictionary
        this.dateSubmitted = LocalDate.now(); // Set the current date as the default value
    }

    // Getters and setters for the dateSubmitted field
    public LocalDate getDateSubmitted() {
        return dateSubmitted;
    }

    public void setDateSubmitted(LocalDate dateSubmitted) {
        this.dateSubmitted = dateSubmitted;
    }

    // Getters and setters
    public String getOrderId() {
        return orderId;
    }

    public Status getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Status orderStatus) {
        this.orderStatus = orderStatus;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public UUID getCustomerId() {
        return customerId;
    }

    public void setCustomerId(UUID customerId) {
        this.customerId = customerId;
    }

    // Items dictionary methods

    public void addItem(String itemId, int quantity) {
        items.put(itemId, quantity);
    }

    public void removeItem(String itemId) {
        items.remove(itemId);
    }

    public Map<String, Integer> getItems() {
        return items;
    }

    @Override
    public String toString() {
        String sb = "Order ID: " + orderId +
                "\nOrder Status: " + orderStatus +
                "\nTotal Amount: " + totalAmount +
                "\nCustomer ID: " + customerId +
                "\nDate Submitted: " + dateSubmitted +
                "\nItems: " + items;
        return sb;
    }

}
