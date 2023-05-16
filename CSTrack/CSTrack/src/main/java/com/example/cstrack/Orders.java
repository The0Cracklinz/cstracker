package com.example.cstrack;

import java.util.List;

public class Orders {
    private List<Order> pendingOrders;
    private List<Order> shippedOrders;
    private List<Order> deliveredOrders;

    public Orders(List<Order> pendingOrders, List<Order> shippedOrders, List<Order> deliveredOrders) {
        this.pendingOrders = pendingOrders;
        this.shippedOrders = shippedOrders;
        this.deliveredOrders = deliveredOrders;
    }

    public List<Order> getPendingOrders() {
        return pendingOrders;
    }

    public void setPendingOrders(List<Order> pendingOrders) {
        this.pendingOrders = pendingOrders;
    }

    public List<Order> getShippedOrders() {
        return shippedOrders;
    }

    public void setShippedOrders(List<Order> shippedOrders) {
        this.shippedOrders = shippedOrders;
    }

    public List<Order> getDeliveredOrders() {
        return deliveredOrders;
    }

    public void setDeliveredOrders(List<Order> deliveredOrders) {
        this.deliveredOrders = deliveredOrders;
    }
}