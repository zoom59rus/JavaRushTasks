package com.javarush.task.task05.task0508;

/* 
Геттеры и сеттеры для класса Person
*/

public class Person {
    public String name;
    public int age;
    public char sex;

    public void setName(String namePerson) {
        name = namePerson;
    }

    public void setAge(int agePerson) {
        age = agePerson;
    }

    public void setSex(char sexPerson) {
        sex = sexPerson;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }

    public static void main(String[] args) {

    }
}
