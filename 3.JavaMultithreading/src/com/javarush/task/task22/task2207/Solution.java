package com.javarush.task.task22.task2207;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/* 
Обращенные слова
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in, "UTF-8");
        List<String> words = Files.readAllLines(Paths.get(sc.nextLine()));
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word + " ");
        }
        String[] word = new String(sb).split(" ");
        for (int i = 0; (i + 1) < word.length - 1; i++) {
            String second = new String(new StringBuilder(word[i + 1]).reverse());
            String first = word[i];
            if(first.equals(second)){
                if(!result.contains(new Pair(first, word[i + 1]))) {
                    result.add(new Pair(first, word[i + 1]));
                }
            }
        }
    }

    public static class Pair {
        String first;
        String second;

        public Pair() {
        }

        public Pair(String first, String second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                        first == null ? second :
                            second == null ? first :
                                first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
