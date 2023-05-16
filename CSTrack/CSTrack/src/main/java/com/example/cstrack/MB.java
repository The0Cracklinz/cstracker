package com.example.cstrack;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MB extends ComputerComponent {
    private String type;

    public MB(String name, String manufacturer, int yearReleased) {
        super(name, manufacturer, yearReleased);
        this.type = "MB";
    }

    public List<MB> readMBInfoFromFile(String filePath) {
        List<MB> mbList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                MB mb = parseMBInfo(line);
                mbList.add(mb);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return mbList;
    }

    private MB parseMBInfo(String line) {
        String manufacturer = line.substring(0, line.indexOf(' '));
        String yearReleased = line.substring(line.indexOf('(') + 1, line.indexOf(')'));
        String mbName = line.substring(line.indexOf(' ') + 1, line.lastIndexOf('(') - 1);

        return new MB(mbName, manufacturer, Integer.parseInt(yearReleased));
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
