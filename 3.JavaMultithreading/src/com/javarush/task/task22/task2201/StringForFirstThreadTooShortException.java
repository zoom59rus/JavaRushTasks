package com.javarush.task.task22.task2201;

public class StringForFirstThreadTooShortException extends RuntimeException {
    @Override
    public String toString(){
        System.out.println(super.getCause());
        return "StringForFirstThreadTooShortException";
    }
}
