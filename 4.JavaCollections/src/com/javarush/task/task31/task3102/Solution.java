package com.javarush.task.task31.task3102;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.io.File;
import java.io.IOException;
import java.util.*;

/* 
Находим все файлы
*/
public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
        List<String> fileTree = new ArrayList<>();
        Queue<File> fileQueue = new LinkedList<>();
        fileQueue.addAll(Arrays.asList(new File(root).listFiles()));
        File it;
        while ((it = fileQueue.poll()) != null){
            if(it.isFile()){
                fileTree.add(it.getAbsolutePath());
            }
            if(it.isDirectory()){
                fileQueue.addAll(Arrays.asList(it.listFiles()));
            }
        }
        return fileTree;

    }

    public static void main(String[] args) throws IOException {
        getFileTree("/root/");
    }
}
