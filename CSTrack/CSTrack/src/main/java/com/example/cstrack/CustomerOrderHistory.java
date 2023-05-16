package com.example.cstrack;

import java.util.List;
import java.util.UUID;

public class CustomerOrderHistory {
    private UUID customerID;
    private List<Order> orders;

    public CustomerOrderHistory(UUID customerID, List<Order> orders) {
        this.customerID = customerID;
        this.orders = orders;
    }

    public UUID getCustomerID() {
        return customerID;
    }

    public void setCustomerID(UUID customerID) {
        this.customerID = customerID;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}