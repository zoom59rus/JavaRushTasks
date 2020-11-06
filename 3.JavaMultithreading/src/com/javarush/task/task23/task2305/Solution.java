package com.javarush.task.task23.task2305;

/* 
Inner
*/
public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    public class InnerClass {
    }

    public static Solution[] getTwoSolutions() {
        Solution[] sol = new Solution[]{new Solution(), new Solution()};
        for (Solution solution : sol) {
            for (int i = 0; i < solution.innerClasses.length; i++) {
                solution.innerClasses[i] = solution.new InnerClass();
            }
        }
        return sol;
    }

    public static void main(String[] args) {
    }
}
