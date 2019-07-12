package com.javarush.task.task31.task3111;

import javax.swing.*;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class SearchFileVisitor extends SimpleFileVisitor<Path> {
    private String partOfName;
    private String partOfContent;
    private int minSize = Integer.MIN_VALUE;
    private int maxSize = Integer.MAX_VALUE;
    private List<Path> foundFiles = new ArrayList<>();

    public void setPartOfName(String partOfName) {
        this.partOfName = partOfName;
    }

    public void setPartOfContent(String partOfContent) {
        this.partOfContent = partOfContent;
    }

    public void setMinSize(int minSize) {
        this.minSize = minSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public List<Path> getFoundFiles() {
        return foundFiles;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        byte[] content = Files.readAllBytes(file); // размер файла: content.length
        String contents = new String(content);

        boolean containsName = false;
        if(partOfName == null || file.getFileName().toString().contains(partOfName))
            containsName = true;

        boolean containsContent = false;
        if(partOfContent == null || contents.contains(partOfContent))
            containsContent = true;

        boolean miSize = false;
        if(minSize == Integer.MIN_VALUE || minSize < content.length)
            miSize = true;

        boolean maSize = false;
        if(maxSize == Integer.MAX_VALUE || maxSize > content.length)
            maSize = true;

        if((containsContent && containsName && miSize && maSize)) {
            foundFiles.add(file);
            return FileVisitResult.CONTINUE;
        }

        if(containsName && containsContent && miSize && maSize) {
            foundFiles.add(file);
        }


        return FileVisitResult.CONTINUE;
        //return super.visitFile(file, attrs);
    }
}
