
package com.example.cstrack;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CPU extends ComputerComponent {
    private String type;

    public CPU(String name, String manufacturer, int yearReleased) {
        super(name, manufacturer, yearReleased);
        this.type = "CPU";
    }

    public List<CPU> readCPUInfoFromFile(String filePath) {
        List<CPU> cpuList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                CPU cpu = parseCPUInfo(line);
                cpuList.add(cpu);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return cpuList;
    }

    private CPU parseCPUInfo(String line) {
        String manufacturer = line.substring(0, line.indexOf(' '));
        String yearReleased = line.substring(line.indexOf('(') + 1, line.indexOf(')'));
        String cpuName = line.substring(line.indexOf(' ') + 1, line.lastIndexOf('(') - 1);

        return new CPU(cpuName, manufacturer, Integer.parseInt(yearReleased));
    }

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