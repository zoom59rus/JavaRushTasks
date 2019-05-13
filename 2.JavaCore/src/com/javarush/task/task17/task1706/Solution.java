package com.javarush.task.task17.task1706;

/* 
Синхронизированный президент
*/

public class Solution {
    public static void main(String[] args) {
        OurPresident expectedPresident = OurPresident.getOurPresident();
        OurPresident ourPresident = OurPresident.getOurPresident();
        System.out.println(expectedPresident == ourPresident );
    }

    public static class OurPresident {
        private static OurPresident president;

        static {
            synchronized (OurPresident.class) {
                president = new OurPresident();
            }

        }

        private OurPresident() {
        }

        private static OurPresident getOurPresident() {
            return president;
        }
    }
}
