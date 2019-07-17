package com.javarush.task.task31.task3106;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/*
Разархивируем файл
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(args[0]);
        List<String> parts = new ArrayList<>();
        for (int i = 1; i < args.length; i++) {
            parts.add(args[i]);
        }
        Collections.sort(parts);
        List<FileInputStream> fis = new ArrayList<>();
        for(String it : parts){
         fis.add(new FileInputStream(it));
        }
        SequenceInputStream sis = new SequenceInputStream(Collections.enumeration(fis));
        ZipInputStream zis = new ZipInputStream(sis);
        byte[] buffer = new byte[1024];
        int count = -1;
        zis.getNextEntry();
        while((count = zis.read(buffer)) != -1){
            fos.write(buffer, 0, count);
        }
        fos.close();
        zis.close();
    }
}
