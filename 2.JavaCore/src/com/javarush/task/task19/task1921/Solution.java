package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) {
        BufferedReader reader = null;
        try
        {
            FileReader fileReader = new FileReader(args[0]);
            reader = new BufferedReader(fileReader);
            SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
            while (reader.ready()){
                String[] line = reader.readLine().split(" ");
                String date = "";
                String name = "";
                for (int i = 0; i < line.length - 3; i++) {
                    name = name + " " + line[i];
                }
                for (int i = line.length - 3; i < line.length; i++) {
                    date = date + " " + line[i];
                }
                PEOPLE.add(new Person(name.trim(), new Date(sdf.parse(date).getTime())));
            }
            reader.close();
            fileReader.close();
        }catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException m) {
            m.printStackTrace();
        }

    }
}
