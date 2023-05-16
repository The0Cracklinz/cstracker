package com.example.cstrack;

public abstract class ComputerComponent {
    private String name;
    private String manufacturer;
    private int yearReleased;

    public ComputerComponent(String name, String manufacturer, int yearReleased) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.yearReleased = yearReleased;
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                "\nManufacturer: " + manufacturer +
                "\nYear Released: " + yearReleased;
    }
}
