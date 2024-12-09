package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {

        String path = "C:\\Windows\\Temp\\in.txt";

        Map<String,Integer> map = new HashMap<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while(line != null) {
                String[] fields = line.split(",");
                sum(map,fields[0],Integer.parseInt(fields[1]));
                line = br.readLine();
            }
            for(String i : map.keySet()) {
                System.out.println(i + ": " + map.get(i));
            }

        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public static void sum(Map<String,Integer> map, String key, Integer value) {
        map.put(key, map.getOrDefault(key, 0) + value);
    }

}
