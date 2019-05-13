package com.javarush.task.task17.task1707;

/* 
МВФ
*/

public class Solution {
    public static void main(String[] args) {
        IMF fund = IMF.getFund();
        IMF anotherFund = IMF.getFund();
        System.out.println(fund == anotherFund );
    }

    public static class IMF {
        private static IMF imf;

        private IMF() {
        }

        public static IMF getFund() {
            synchronized (IMF.class) {
                if (null == imf)
                    imf = new IMF();
            }
            return imf;
        }
    }
}
