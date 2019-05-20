package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner scanner) {
            this.fileScanner = scanner;
        }

        @Override
        public Person read() throws IOException, ParseException {
            SimpleDateFormat dateFormate = new SimpleDateFormat("dd MM yyyy");
            Person person = null;
            String[] split = fileScanner.nextLine().split(" ");
            String date = split[3] + " " + split[4] + " " + split[5];
            person = new Person(split[1], split[2], split[0], dateFormate.parse(date));
            return person;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
