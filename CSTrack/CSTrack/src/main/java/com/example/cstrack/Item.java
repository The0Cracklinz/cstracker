package com.example.cstrack;

public class Item {
    private String itemID;
    private String productName;
    private ItemType itemType;
    private double price;
    private boolean inStock;

    public Item(String itemID, String productName, ItemType itemType, double price, boolean inStock) {
        this.itemID = itemID;
        this.productName = productName;
        this.itemType = itemType;
        this.price = price;
        this.inStock = inStock;
    }

    // Getters and setters

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    @Override
    public String toString() {
        return "Item ID: " + itemID +
                "\nProduct Name: " + productName +
                "\nItem Type: " + itemType +
                "\nPrice: " + price +
                "\nIn Stock: " + inStock;
    }
}
