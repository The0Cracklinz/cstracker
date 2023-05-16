package com.example.cstrack;

import java.util.List;

public class Product {
    private String productName;
    private ItemType itemType;
    private List<ComputerComponent> componentList;
    private boolean inStock;

    public Product(String productName, ItemType itemType, List<ComputerComponent> componentList, boolean inStock) {
        this.productName = productName;
        this.itemType = itemType;
        this.componentList = componentList;
        this.inStock = inStock;
    }

    // Getters and setters

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

    public List<ComputerComponent> getComponentList() {
        return componentList;
    }

    public void setComponentList(List<ComputerComponent> componentList) {
        this.componentList = componentList;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Product Name: ").append(productName)
                .append("\nItem Type: ").append(itemType)
                .append("\nComponents:\n");
        for (ComputerComponent component : componentList) {
            sb.append(component.toString()).append("\n");
        }
        sb.append("In Stock: ").append(inStock);
        return sb.toString();
    }
}
