package com.example.cstrack;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GPU extends ComputerComponent {
    private String type;


    public GPU(String name, String manufacturer, int yearReleased) {
        super(name, manufacturer, yearReleased);
        this.type = "GPU";
    }
    // Getter and setter for type

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<GPU> readGPUInfoFromFile(String filePath) {
        List<GPU> gpuList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                GPU gpu = parseGPUInfo(line);
                gpuList.add(gpu);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return gpuList;
    }

    private GPU parseGPUInfo(String line) {
        String manufacturer = line.substring(0, line.indexOf(' '));
        String yearReleased = line.substring(line.indexOf('(') + 1, line.indexOf(')'));
        String gpuName = line.substring(line.indexOf(' ') + 1, line.lastIndexOf('(') - 1);

        return new GPU(gpuName, manufacturer, Integer.parseInt(yearReleased));
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nType: "+type;
}
}
