package com.example.cstrack;

import java.util.HashMap;
import java.util.Map;

public class UserManager {
    private final Map<String, String> users; // Map to store username and password

    public UserManager() {
        users = new HashMap<>();
        // Add admin user to the map (username: admin, password: admin123)
        users.put("admin", "admin123");
    }

    public boolean authenticate(String username, String password) {
        String storedPassword = users.get(username);
        return storedPassword != null && storedPassword.equals(password);
    }

    public void addUser(String username, String password) {
        if (!users.containsKey(username)) {
            users.put(username, password);
            System.out.println("User " + username + " added successfully.");
        } else {
            System.out.println("User " + username + " already exists.");
        }
    }

    public void removeUser(String username) {
        if (users.containsKey(username)) {
            users.remove(username);
            System.out.println("User " + username + " removed successfully.");
        } else {
            System.out.println("User " + username + " does not exist.");
        }
    }

    public void updatePassword(String username, String newPassword) {
        if (users.containsKey(username)) {
            users.put(username, newPassword);
            System.out.println("Password updated successfully for user " + username + ".");
        } else {
            System.out.println("User " + username + " does not exist.");
        }
    }

    public String getPassword(String username) {
        if (users.containsKey(username)) {
            return users.get(username);
        } else {
            return null;
        }
    }

    public void updateUsername(String oldUsername, String newUsername) {
        if (users.containsKey(oldUsername)) {
            String password = users.remove(oldUsername);
            users.put(newUsername, password);
            System.out.println("Username updated successfully for user " + oldUsername + " to " + newUsername + ".");
        } else {
            System.out.println("User " + oldUsername + " does not exist.");
        }
    }

    public boolean doesUserExist(String username) {
        return users.containsKey(username);
    }

    public void printAllUsers() {
        System.out.println("User List:");
        for (String username : users.keySet()) {
            System.out.println("Username: " + username);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UserManager Details:\n");
        for (Map.Entry<String, String> entry : users.entrySet()) {
            sb.append("Username: ").append(entry.getKey()).append(", Password: ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }
}
