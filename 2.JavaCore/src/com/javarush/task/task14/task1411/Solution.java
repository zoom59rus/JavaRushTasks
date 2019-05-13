package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        key = reader.readLine();

        while (key.equals("user") || key == "loser" || key == "coder" || key == "proger")
        {
            if (key == "user") {person = new User();}
            else if (key == "loser") {person = new Loser();}
            else if (key == "coder") {person = new Coder();}
            else if (key == "proger") {person = new Proger();}

            doWork(person); //вызываем doWork

            key = reader.readLine();

        }
    }

    public static void doWork(Person person) {
        if (key == "user") {((Person.User) person).live();}
        else if (key == "loser") {((Person.Loser) person).doNothing();}
        else if (key == "coder") {((Person.Coder) person).writeCode();}
        else if (key == "proger") {((Person.Proger) person).enjoy();}
    }
}