package com.example.cstrack;

import java.util.Date;
import java.util.UUID;


public class Customer {
    private final UUID id;
    private String firstName;
    private String lastName;
    private final Date dateCreated;

    // Constructor
    public Customer(String firstName, String lastName) {
        this.id = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateCreated = new Date();
    }

    // Getters and setters
    public UUID getId() {
        return id;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Other methods

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public boolean isValid() {
        return firstName != null && !firstName.isEmpty() && lastName != null && !lastName.isEmpty();
    }

    public void introduce() {
        System.out.println("Hello, my name is " + getFullName() + ".");
    }

    @Override
    public String toString() {
        return "Customer: " + firstName + " " + lastName;
    }

}
