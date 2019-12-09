package com.javarush.task.task21.task2101;

import java.io.IOException;

/*
Определяем адрес сети
*/
public class Solution {
    public static void main(String[] args) throws IOException{
        byte[] ip = new byte[]{(byte) 192, (byte) 168, 1, 2};
        byte[] mask = new byte[]{(byte) 255, (byte) 255, (byte) 254, 0};
        byte[] netAddress = getNetAddress(ip, mask);
        print(ip);          //11000000 10101000 00000001 00000010
        print(mask);        //11111111 11111111 11111110 00000000
        print(netAddress);  //11000000 10101000 00000000 00000000
    }

    public static byte[] getNetAddress(byte[] ip, byte[] mask) throws IOException {
        byte[] nAddres = new byte[4];
        if(ip.length != 4 || mask.length != 4){
            System.out.println("Wrong ip length.");
            throw new IOException();
        }

        for (int i = 0; i < 4; i++) {
            nAddres[i] = (byte) (ip[i] & mask[i]);
        }

        return nAddres;
    }

    public static void print(byte[] bytes) {
        for (int i = 0; i < bytes.length; i++) {
            int tmp = (int) bytes[i];
            if(tmp < 0){
                tmp += 256;
            }
            String strBynary = Integer.toBinaryString(tmp);
            System.out.printf("%08d", Integer.parseInt(strBynary));
            System.out.print(" ");
        }

    }
}
