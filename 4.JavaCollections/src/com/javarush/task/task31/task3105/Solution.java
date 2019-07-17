package com.javarush.task.task31.task3105;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* 
Добавление файла в архив
*/
public class Solution {
    public static void main(String[] args){
        Path fileNameForArh = Paths.get(args[0]);
        fileNameForArh.normalize();
        Map<String, byte[]> tempArh = new HashMap<>();
        try(ZipInputStream zis = new ZipInputStream(new FileInputStream(args[1]))) {
            ZipEntry zp;
            while ((zp = zis.getNextEntry()) != null) {
                if (zp.isDirectory()) {
                    zis.closeEntry();
                    continue;
                }

                ByteArrayOutputStream bbos = new ByteArrayOutputStream();
                byte[] buffer = new byte[1024];
                int count = -1;
                while ((count = zis.read(buffer)) != -1) {
                    bbos.write(buffer, 0, count);
                }
                tempArh.put(Paths.get(zp.getName()).getFileName().toString(), bbos.toByteArray());
                zis.closeEntry();
            }
        } catch (IOException e){
            e.printStackTrace();
        }

        try(ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(args[1]))) {
            ZipEntry zp;
            zos.putNextEntry(new ZipEntry("new/" + fileNameForArh.getFileName()));
            Files.copy(fileNameForArh, zos);
            zos.closeEntry();
            for (Map.Entry<String, byte[]> it : tempArh.entrySet()) {
                if (it.getKey().equals(fileNameForArh.getFileName())) {
                    continue;
                }
                zos.putNextEntry(new ZipEntry(it.getKey()));
                zos.write(it.getValue());
                zos.closeEntry();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
