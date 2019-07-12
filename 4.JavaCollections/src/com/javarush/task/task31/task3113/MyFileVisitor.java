package com.javarush.task.task31.task3113;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class MyFileVisitor extends SimpleFileVisitor<Path>{
        private static int countDirectory = 0;
        private static int countFiles = 0;
        private static long allSise = 0L;

    public static int getCountDirectory() {
        return countDirectory;
    }

    public static int getCountFiles() {
        return countFiles;
    }

    public static long getAllSise() {
        return allSise;
    }

    public FileVisitResult preVisitDirectory(Path start, BasicFileAttributes attrs){
        if(Files.isDirectory(start))
            countDirectory++;

        return FileVisitResult.CONTINUE;
    }

    public FileVisitResult visitFile(Path start, BasicFileAttributes attrs) throws IOException {
            if(Files.isRegularFile(start))
                countFiles++;

            allSise += Files.size(start);

            return FileVisitResult.CONTINUE;

        }
}
