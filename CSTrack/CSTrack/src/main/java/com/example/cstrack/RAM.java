package com.example.cstrack;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RAM extends ComputerComponent {
    private String type;

    public RAM(String name, String manufacturer, int yearReleased) {
        super(name, manufacturer, yearReleased);
        this.type = "RAM";
    }

    public List<RAM> readRAMInfoFromFile(String filePath) {
        List<RAM> ramList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                RAM ram = parseRAMInfo(line);
                ramList.add(ram);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return ramList;
    }

    private RAM parseRAMInfo(String line) {
        String manufacturer = line.substring(0, line.indexOf(' '));
        String yearReleased = line.substring(line.indexOf('(') + 1, line.indexOf(')'));
        String ramName = line.substring(line.indexOf(' ') + 1, line.lastIndexOf('(') - 1);

        return new RAM(ramName, manufacturer, Integer.parseInt(yearReleased));
    }
    // Getter and setter for type

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nType: "+type;
    }
}