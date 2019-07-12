package com.javarush.task.task31.task3101;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

/*
Проход по дереву файлов
*/
public class Solution {

    public static List<File> getFiles(String startPath){
        List<File> files = new ArrayList<>();
        Queue<File> fFile = new LinkedList<>();
        fFile.addAll(Arrays.asList(new File(startPath).listFiles()));
        File it;
        while ((it = fFile.poll()) != null){
            if(it.isFile() && it.length() <= 50){
                files.add(new File(it.getAbsolutePath()));
            }
            if(it.isDirectory())
                fFile.addAll(Arrays.asList(it.listFiles()));
        }
        Collections.sort(files);

        return  files;
    }

    public static void main(String[] args) throws IOException {
        File file = new File(args[1]);
        File ffile = new File(file.getParentFile() + "/allFilesContent.txt");
        FileUtils.renameFile(file, ffile);
        List<File> files = getFiles(args[0]);
        FileOutputStream fos = new FileOutputStream(ffile);
        FileInputStream fis;
        for(File it : files){
            fis = new FileInputStream(it);
            byte[] temp = new byte[fis.available()];
            fis.read(temp);
            fos.write(temp);
            fos.write("\n".getBytes());
            fis.close();
        }
        fos.close();
    }
}
