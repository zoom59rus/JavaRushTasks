package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream inputStream = new FileInputStream(reader.readLine());
        load(inputStream);
    }

    public void save(OutputStream outputStream) throws Exception {
        Properties propertie = new Properties();
        propertie.putAll(properties);
        propertie.store(outputStream, null);
        outputStream.flush();
    }

    public void load(InputStream inputStream) throws Exception {
        Properties properties = new Properties();
        properties.load(inputStream);
        properties.forEach((k, v) -> this.properties.put(k.toString(), v.toString()));
    }

    public static void main(String[] args) {

    }
}
