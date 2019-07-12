package com.javarush.task.task31.task3113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.*;

/* 
Что внутри папки?
*/
public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Path file = Paths.get(reader.readLine());
        if(!Files.isDirectory(file)){
            System.out.println(file.toAbsolutePath() + " - не папка");
            return;
        }
        Files.walkFileTree(file, new MyFileVisitor());
        System.out.println("Всего папок - " + (MyFileVisitor.getCountDirectory() - 1));
        System.out.println("Всего файлов - " + MyFileVisitor.getCountFiles());
        System.out.println("Общий размер - " + MyFileVisitor.getAllSise());
        System.out.close();
    }


}
