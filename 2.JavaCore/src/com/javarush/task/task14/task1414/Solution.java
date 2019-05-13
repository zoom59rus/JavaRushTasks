package com.javarush.task.task14.task1414;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
MovieFactory
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Movie movie = null;
        while (true) {
            String key = reader.readLine();
            movie = MovieFactory.getMovie(key);
            System.out.println(movie.getClass().getSimpleName());
            if (! ("soapOpera" == key) || ! ("cartoon" == key) || ! ("thriller" == key))
                break;
        }
    }

    static class MovieFactory extends Movie {
        static Movie getMovie(String key) {
            Movie movie = null;
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }
            else if ("cartoon".equals(key)) {
                movie = new Cartoon();
            }
            else if ("thriller".equals(key)) {
                movie = new Thriller();
            }
            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie {

    }

    static class Thriller extends Movie {

    }
}
