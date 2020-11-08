package com.javarush.task.task24.task2413;

import java.util.Arrays;

public class Canvas {
    private int width;
    private int height;
    private char[][] matrix;

    public Canvas(int width, int height) {
        this.width = width;
        this.height = height;
        this.matrix = new char[height + 2][width + 2];
    }

    public void clear(){
        this.matrix = new char[matrix.length][matrix[0].length];
    }

    public void print(){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.print("\n");
        }
    }

    public void setPoint(double x, double y, char c){
        int xCell = (int) Math.round(x);
        int yCell = (int) Math.round(y);
        if(xCell < 0 || yCell < 0 || yCell >= matrix.length || xCell >= matrix[0].length){
            return;
        }

        this.matrix[yCell][xCell] = c;
    }

    public void drawMatrix(double x, double y, int[][] matrix, char c){
        int xCell = (int) Math.round(x);
        int yCell = (int) Math.round(y);
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
//                this.matrix[i][j] = (char) matrix[i][j];
                if(matrix[i][j] != 0){
                    setPoint(xCell + j, yCell + i, c);
                }
            }
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public char[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(char[][] matrix) {
        this.matrix = matrix;
    }
}
